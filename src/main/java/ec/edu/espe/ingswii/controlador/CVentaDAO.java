/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.ingswii.controlador;

import ec.edu.espe.ingswii.modelo.CProducto;
import java.sql.Connection;
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
            String cantidad, String desc, String pUni, String tot) {
        tablaProd.addRow(new String[]{cantidad, desc, pUni, tot});
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
        int aux = 0;
        int codigo = 0;
        codigo = obtenerCodigo(tipo, descripcion);
        try {
            String sql = "Update producto set pro_stock='" + cantidad + " ' where pro_codigo='" + codigo + "';";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            rs.close();
        } catch (Exception ex) {
             System.err.println("Error consulta :" + ex.getMessage());
        }
        return aux;
    }

}
