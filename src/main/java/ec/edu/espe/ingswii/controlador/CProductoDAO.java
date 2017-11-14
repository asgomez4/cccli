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
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author Jessy
 */
public class CProductoDAO {

    /**
     * pro es un objeto con los datos del producto.
     */
    private CProducto pro;

    /**
     * conexion establece la conexion con la base de datos.
     */
    private Conexion conexion;
    /**
     * resultado guarda las acciones DML en la BD.
     */

    /**
     * contructor de la clase.
     *
     * @param pro
     */
    PreparedStatement ps = null;
    ResultSet rs = null;
    Conexion conn = new Conexion();
    Connection con = conn.getConnection();

    public CProductoDAO() {
    }

    public CProductoDAO(final CProducto pro) {
        this.pro = pro;
        this.conexion = new Conexion();
    }

    //generar codigo del producto
    public void GenerarCodigo(JComboBox combo1, JComboBox combo2, JTextField grupoTipo, JTextField codigo) {
        //validar si no selecciona
        String cadena1 = combo1.getSelectedItem().toString();
        String cadena2 = combo2.getSelectedItem().toString();
        int antes = 0;
        try {
            String sql = "SELECT  max(pro_codigo) AS pro_codigo from producto";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                rs.next();
                antes = rs.getInt(0);
            }
            rs.close();
        } catch (SQLException ex) {
            System.err.println("Error consulta :" + ex.getMessage());
        }
        grupoTipo.setText(cadena2);
        codigo.setText(cadena1.substring(0, 3) + "-" + String.valueOf(antes + 1) + "-" + cadena2);
    }

    public int insetarProducto(String codigo, String serie, String modelo, String marca, String precio, String tipo, String descripcion, String stock) {
        int resultado = 0;
        String sql = "INSERT INTO producto (pro_codigo_cliente,pro_serie,pro_modelo,pro_marca,pro_precio,tip_nombre,pro_descripcion,pro_stock)"
                + "values (?,?,?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, codigo);
            ps.setString(2, serie);
            ps.setString(3, modelo);
            ps.setString(4, marca);
            ps.setString(5, precio);
            ps.setString(6, tipo);
            ps.setString(7, descripcion);
            ps.setString(8, stock);
            resultado = ps.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Error consulta :" + ex.getMessage());
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
            }
        }
        return resultado;
    }

    //Validar si existe serie
    public Vector<CProducto> Descripcion(String subtipo) {
        Vector<CProducto> datos = new Vector<CProducto>();
        CProducto pProducto = null;
        try {
            String sql = "SELECT PRO_DESCRIPCION FROM producto WHERE TIP_NOMBRE='" + subtipo + "' and pro_stock<>0;";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                pProducto.setProTipo(rs.getString(0));
            }
        } catch (Exception ex) {
            System.err.println("Error consulta :" + ex.getMessage());
        }
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
}
