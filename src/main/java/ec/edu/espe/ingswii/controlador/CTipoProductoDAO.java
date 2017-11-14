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
public class CTipoProductoDAO {
    private String tipo;
    PreparedStatement ps = null;
    ResultSet rs = null;
    Conexion conn = new Conexion();
    Connection con = conn.getConnection();
    public CTipoProductoDAO(){}
    public CTipoProductoDAO(String tipo){
        this.tipo = tipo;
    }    
    public Vector<CTipoProductoDAO> mostrarTipo(String grupo) {
        Vector<CTipoProductoDAO> datos = new Vector<CTipoProductoDAO>();
        CTipoProductoDAO dat = null;
        try {
            String sql = "SELECT * FROM tipo_producto WHERE gru_nombre = '" + grupo + "'";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            dat = new CTipoProductoDAO();
            dat.setTipo("Seleccionar Tipo");
            datos.add(dat);
            while (rs.next()){
                dat = new CTipoProductoDAO();
                dat.setTipo(rs.getString("tip_nombre"));
                datos.add(dat);
            }
            rs.close();
        } catch (SQLException ex){
            System.err.println("Error consulta :" + ex.getMessage());
        }
        return datos;
    }
    public int insetarTipo(String grupo, String tipo){
        int resultado = 0;
        String sql="INSERT INTO tipo_producto(gru_nombre, tip_nombre) values (?,?)";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, grupo);
            ps.setString(2, tipo);
            resultado = ps.executeUpdate(); 
        }catch (SQLException ex) {
            System.err.println("Error consulta :" + ex.getMessage());
        }finally{
            try {            
                if(con!=null){            
                    con.close();                
                }            
            }catch (SQLException ex) {      
            }
        }
        return resultado;        
    }
    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
}
