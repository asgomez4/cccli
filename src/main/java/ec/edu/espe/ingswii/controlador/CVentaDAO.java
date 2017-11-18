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
        CProducto pProducto = new CProducto();
        try {
            String sql = "select pro_stock from producto where TIP_NOMBRE='" + subtipo + "' and pro_descripcion='" + descripcion + "';";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                band1 = rs.getInt(0);
            }
            rs.close();
        } catch (Exception ex) {
            System.err.println("Error consulta :" + ex.getMessage());
        }
        return band1;
    }
}
