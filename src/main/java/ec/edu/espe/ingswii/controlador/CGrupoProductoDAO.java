/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.ingswii.controlador;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

/**
 *
 * @author Jessy
 */
public class CGrupoProductoDAO {
    private String grupo;
    public CGrupoProductoDAO(){   
    }
    public CGrupoProductoDAO(String grupo) {
        this.grupo = grupo;
    }
    
    public Vector<CGrupoProductoDAO> mostrarGrupo() {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Conexion conn = new Conexion();
        Connection con = conn.getConnection();

        Vector<CGrupoProductoDAO> datos = new Vector<CGrupoProductoDAO>();
        CGrupoProductoDAO dat = null;
        try {

            String sql = "SELECT * FROM grupo_producto";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            dat = new CGrupoProductoDAO();
            dat.setGrupo("Selecciona grupo");
            datos.add(dat);

            while (rs.next()) {
                dat = new CGrupoProductoDAO();
                dat.setGrupo(rs.getString("gru_nombre"));
                datos.add(dat);
            }
            rs.close();
        } catch (SQLException ex) {
            System.err.println("Error consulta :" + ex.getMessage());
        }
        return datos;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
    
    
    
}
