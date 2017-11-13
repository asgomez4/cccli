/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.ingswii.modelo;

/**
 *
 * @author Sofia Gomez
 */
public class CVenta {
    private int numVenta;
    private double precioTotal;
    private String venFecha;
    private String cliCedula;

    public CVenta(int numVenta, double precioTotal, String venFecha, String cliCedula) {
        this.numVenta = numVenta;
        this.precioTotal = precioTotal;
        this.venFecha = venFecha;
        this.cliCedula = cliCedula;
    }

    public int getNumVenta() {
        return numVenta;
    }

    public void setNumVenta(int numVenta) {
        this.numVenta = numVenta;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public String getVenFecha() {
        return venFecha;
    }

    public void setVenFecha(String venFecha) {
        this.venFecha = venFecha;
    }

    public String getCliCedula() {
        return cliCedula;
    }

    public void setCliCedula(String cliCedula) {
        this.cliCedula = cliCedula;
    } 
}
