/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.ingswii.controlador;
import ec.edu.espe.ingswii.modelo.CProducto;
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
    
    public CProductoDAO(final CProducto pro) {
        this.pro = pro;
        this.conexion = new Conexion();
    }
    //Validar si existe serie
    

    
    
}
