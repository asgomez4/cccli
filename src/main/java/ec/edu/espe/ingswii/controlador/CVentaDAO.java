/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.ingswii.controlador;

import ec.edu.espe.ingswii.modelo.CProducto;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sofia Gomez
 */
public class CVentaDAO {

    PreparedStatement ps = null;
    ResultSet rs = null;
    Conexion conn = new Conexion();
    Connection con = conn.getConnection();

    public Vector<CProducto> Descripcion(String subtipo) {
        Vector<CProducto> datos = new Vector<CProducto>();
        CProducto pProducto = null;
        try {
            String sql = "SELECT PRO_DESCRIPCION FROM producto WHERE TIP_NOMBRE='" + subtipo + "' and pro_stock<>0;";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            pProducto = new CProducto();
            pProducto.setProDescripcion("Descripciones");
            datos.add(pProducto);

            while (rs.next()) {
                pProducto = new CProducto();
                pProducto.setProDescripcion(rs.getString("pro_descripcion"));
                datos.add(pProducto);
            }
            rs.close();
        } catch (SQLException ex) {
            System.err.println("Error consulta :" + ex.getMessage());
        }
        return datos;
    }

    public int Cantidad_Productos_Stock(String subtipo, String descripcion) {
        int band1 = 0;
        try {
            String sql = "select pro_stock from producto where TIP_NOMBRE='" + subtipo + "' and pro_descripcion='" + descripcion + "';";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                band1 += rs.getInt(1);
            }
            rs.close();
        } catch (Exception ex) {
            System.err.println("Error consulta :" + ex.getMessage());
        }
        return band1;
    }

    public float Precio_Producto(String subtipo, String descripcion) {
        float band1 = 0;
        try {
            String sql = "select ROUND(AVG(pro_precio),2) from producto where TIP_NOMBRE='" + subtipo + "' and pro_descripcion='" + descripcion + "';";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                band1 = rs.getFloat(1);
            }
            rs.close();
        } catch (Exception ex) {
            System.err.println("Error consulta :" + ex.getMessage());
        }
        return band1;
    }

    public DefaultTableModel visualisarProductos(DefaultTableModel tablaProd,
            String codigo, String cantidad, String desc, String pUni, String tot) {
        tablaProd.addRow(new String[]{codigo, cantidad, desc, pUni, tot});
        return tablaProd;
    }

    public int obtenerCodigo(String tipo, String descripcion) {
        int codigo = 0;
        try {
            String sql = "select pro_codigo from producto where tip_nombre='" + tipo + "' and PRO_DESCRIPCION='" + descripcion + "';";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                codigo = rs.getInt(1);
            }
            rs.close();
        } catch (Exception ex) {
            System.err.println("Error consulta :" + ex.getMessage());
        }
        return codigo;
    }

    public int actualizarStock(String tipo, String descripcion, String cantidad) {
        PreparedStatement sentencia = null;
        final Connection con = conn.getConnection();
        int aux = 0;
        int cod = 0;
        cod = obtenerCodigo(tipo, descripcion);
        // update del cliente dentro de la BD
        try {
            sentencia = con.prepareStatement("update producto set pro_stock = ?  where pro_codigo = ?");
            sentencia.setString(1, cantidad);
            sentencia.setInt(2, cod);
            aux = sentencia.executeUpdate();
            if (aux > 0) {
                //JOptionPane.showMessageDialog(null, "Datos correctamente modificados");
            }
        } catch (SQLException e) {
            System.err.println("Error consulta :" + e.getMessage());
        }
        return aux;
    }

    public int numero_Compra() {
        int num = 0;
        try {
            String sql = "SELECT max(ven_NUMVENTA) from venta;";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                num = rs.getInt(1);
            }
            rs.close();
        } catch (Exception ex) {
            System.err.println("Error consulta :" + ex.getMessage());
        }
        return num;
    }

    public final void registrarCompra(String venta, String cliCedula, String comNumFicha, String comTipo, float comPrecioTotal, Date fechaParaSQL) {
        System.out.println("Entraaaa funcion regCom \n" + venta + "\n" + cliCedula + "\n" + comNumFicha + "\n" + String.valueOf(comPrecioTotal) + "\n" + fechaParaSQL);
        PreparedStatement sentencia = null;
        final Connection con = conn.getConnection();
        // insertar los datos del cliente dentro de la BD
        try {
            sentencia = con.prepareStatement("insert into venta (ven_numventa,cli_cedula,ven_num_ficha,ven_tipo,ven_preciototal,ven_fecha) values (?,?,?,?,?,?)");
            sentencia.setString(1, venta);
            sentencia.setString(2, cliCedula);
            sentencia.setString(3, comNumFicha);
            sentencia.setString(4, comTipo);
            sentencia.setFloat(5, comPrecioTotal);
            sentencia.setDate(6, fechaParaSQL);
            sentencia.execute();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.err.println("Error consulta :" + e.getMessage());
        }
    }
    
    public int productoCompra(int producto, String numeroCompra) {
        PreparedStatement sentencia = null;
        final Connection con = conn.getConnection();
        int band = 0;
        try {
            sentencia = con.prepareStatement("insert into producto_vendido (pro_codigo,ven_numventa) values (?,?)");
            sentencia.setInt(1, producto);
            sentencia.setString(2, numeroCompra);
            sentencia.execute();
            band = 1;
        } catch (SQLException e) {
            band = 0;
        }
        return band;
    }
}
