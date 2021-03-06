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
    private PreparedStatement ps;
    private ResultSet rs;
    private Conexion conn;

    public CGrupoProductoDAO() {
        this.conn = new Conexion();
    }

    public CGrupoProductoDAO(String grupo) {
        this.grupo = grupo;
        this.conn = new Conexion();
    }

    public Vector<CGrupoProductoDAO> mostrarGrupo() {
        Vector<CGrupoProductoDAO> datos = new Vector<CGrupoProductoDAO>();
        CGrupoProductoDAO dat = null;
        ps = null;
        Connection con = conn.getConnection();
        try {

            String sql = "SELECT * FROM grupo_producto";
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            dat = new CGrupoProductoDAO();
            dat.setGrupo("SELECCIONAR GRUPO");
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

    public int insetarGrupo(String grupo) {
        int resultado = 0;
        ps = null;
        Connection con = conn.getConnection();
        String sql = "INSERT INTO grupo_producto(gru_nombre) values (?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, grupo);
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

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

}
