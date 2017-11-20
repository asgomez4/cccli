/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.ingswii.modelo;

/**
 *
 * @author Jessy
 */
public class CProducto {
    /**
    * Variables que acoge el producto.
    */
    private String proCodigo; 
    private String proCodigoCliente;
    private String proSerie;
    private String proModelo;
    private String proMarca;
    private String proPrecio;
    private String proTipo;
    private String proDescripcion;
    private String proStock;
    
    /**
     * Constructores
     */
    public CProducto(){ 
    }

    public CProducto(String proCodigo, String proSerie, String proModelo, String proMarca, String proPrecio, String proTipo, String proDescripcion, String proStock){
        this.proCodigo = proCodigo;
        this.proSerie = proSerie;
        this.proModelo = proModelo;
        this.proMarca = proMarca;
        this.proPrecio = proPrecio;
        this.proTipo = proTipo;
        this.proDescripcion = proDescripcion;
        this.proStock = proStock;
    }
    /**
     * Metodos getter de todos los atributos.
     * @return 
     */
    public String getProCodigo() {
        return proCodigo;
    }

    public String getProCodigoCliente() {
        return proCodigoCliente;
    }

    public String getProSerie() {
        return proSerie;
    }

    public String getProModelo() {
        return proModelo;
    }

    public String getProMarca() {
        return proMarca;
    }

    public String getProPrecio() {
        return proPrecio;
    }

    public String getProTipo() {
        return proTipo;
    }

    public String getProDescripcion() {
        return proDescripcion;
    }

    public String getProStock() {
        return proStock;
    }
     /**
     * Metodos setter de todos los atributos.
     */

    public void setProCodigo(String proCodigo) {
        this.proCodigo = proCodigo;
    }

    public void setProCodigoCliente(String proCodigoCliente) {
        this.proCodigoCliente = proCodigoCliente;
    }

    public void setProSerie(String proSerie) {
        this.proSerie = proSerie;
    }

    public void setProModelo(String proModelo) {
        this.proModelo = proModelo;
    }

    public void setProMarca(String proMarca) {
        this.proMarca = proMarca;
    }

    public void setProPrecio(String proPrecio) {
        this.proPrecio = proPrecio;
    }

    public void setProTipo(String proTipo) {
        this.proTipo = proTipo;
    }

    public void setProDescripcion(String proDescripcion) {
        this.proDescripcion = proDescripcion;
    }

    public void setProStock(String proStock) {
        this.proStock = proStock;
    }      
}
