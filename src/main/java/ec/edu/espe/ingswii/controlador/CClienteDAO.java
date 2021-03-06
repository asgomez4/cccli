package ec.edu.espe.ingswii.controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

import ec.edu.espe.ingswii.modelo.CCliente;

/**
 *
 * @author CRIS
 */
public class CClienteDAO {

    /**
     * cliente es un objeto con los datos del cliente.
     */
    private CCliente cliente;
    /**
     * conexion establece la conexion con la base de datos.
     */
    private Conexion conexion;
    /**
     * resultado guarda las acciones DML en la BD.
     */
    private ResultSet resultado;

    /**
     * contructor de la clase.
     *
     * @param cliente
     */
    public CClienteDAO(final CCliente cliente) {
        this.cliente = cliente;
        this.conexion = new Conexion();
    }

    /**
     * Metodo que hace la insercion de un cliente.
     */
    public final void insert() {
        PreparedStatement sentencia = null;
        final Connection con = conexion.getConnection();
        // insertar los datos del cliente dentro de la BD
        try {
            sentencia = con.prepareStatement("insert into cliente (cli_cedula,cli_apellidopaterno,"
                    + "cli_apellidomaterno,cli_nombres,cli_fijo,"
                    + "cli_celular,cli_direccion,"
                    + "cli_correo) values (?,?,?,?,?,?,?,?)");
            sentencia.setString(1, cliente.getCedula());
            sentencia.setString(2, "");
            sentencia.setString(3, "");
            sentencia.setString(4, cliente.getNombres());
            sentencia.setFloat(5, 0);
            sentencia.setFloat(6, 0);
            sentencia.setString(7, "");
            sentencia.setString(8, "");
            sentencia.execute();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
        }
    }

    /**
     * Metodo para ver los clientes que estan en la BD.
     *
     * @param tablaClientes
     * @return tablaClientes
     */
    public final DefaultTableModel visualisarClientes(final DefaultTableModel tablaClientes) {
        PreparedStatement sentencia = null;
        final Connection con = conexion.getConnection();
        // select de todos los clientes y llenado de jtable
        try {
            sentencia = con.prepareStatement("select * from cliente");
            final ResultSet res = sentencia.executeQuery();
            int cont = 0;
            while (res.next()) {
                cont++;
//                cliente = new CCliente(res.getString(1), res.getString(2), res.getString(3), res.getString(4),
//                        res.getFloat(5), res.getFloat(6), res.getString(7), res.getString(8));
//                tablaClientes.addRow(new String[]{"" + cont, cliente.getCedula(), cliente.getApellidop(), cliente.getApellidom(),
//                    cliente.getNombres(), cliente.getDireccion(), cliente.getCorreo()});
                cliente = new CCliente(res.getString(1), res.getString(4));
                tablaClientes.addRow(new String[]{"" + cont, cliente.getCedula(), cliente.getNombres()});
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
        }
        return tablaClientes;
    }

    /**
     * Metodo que hace la busqueda de un cliente por cedula.
     *
     * @param tablaClientes
     * @return tablaClientes
     */
    public final DefaultTableModel busquedaCedula(final DefaultTableModel tablaClientes) {
        PreparedStatement sentencia = null;
        final Connection con = conexion.getConnection();
        // select de todos los clientes y llenado de jtable
        try {
            sentencia = con.prepareStatement("select * from cliente where cli_cedula=?");
            sentencia.setString(1, cliente.getCedula());
            final ResultSet res = sentencia.executeQuery();
            int cont = 0;
            while (res.next()) {
                cont++;
                cliente = new CCliente(res.getString(1), res.getString(4));
                tablaClientes.addRow(new String[]{"" + cont, cliente.getCedula(), cliente.getNombres()});
            }
            if (cont == 0) {
                JOptionPane.showMessageDialog(null, "No se encontraron clientes");
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
        }
        return tablaClientes;
    }

    /**
     * Metodo que hace la busqueda de un cliente por nombre.
     *
     * @param tablaClientes
     * @return tablaClientes
     */
    public final DefaultTableModel busquedaNombre(final DefaultTableModel tablaClientes) {
        PreparedStatement sentencia = null;
        final Connection con = conexion.getConnection();
        // select de todos los clientes y llenado de jtable
        try {
            sentencia = con.prepareStatement("select * from cliente where cli_nombres=?");
            sentencia.setString(4, cliente.getNombres());
            final ResultSet res = sentencia.executeQuery();
            int cont = 0;
            while (res.next()) {
                cont++;
                cliente = new CCliente(res.getString(1), res.getString(4));
                tablaClientes.addRow(new String[]{"" + cont, cliente.getCedula(), cliente.getNombres()});
            }
            if (cont == 0) {
                JOptionPane.showMessageDialog(null, "No se encontraron clientes");
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
        }
        return tablaClientes;
    }

    /**
     * Metodo que actualiza la tabla clientes de la BD.
     */
    public final void actualizarClientes() {
        PreparedStatement sentencia = null;
        final Connection con = conexion.getConnection();
        // update del cliente dentro de la BD
        try {
            sentencia = con.prepareStatement("update cliente set cli_nombres = ?  where cli_cedula = ?");
            sentencia.setString(1, cliente.getNombres());
            sentencia.setString(2, cliente.getCedula());
            final int respuesta = sentencia.executeUpdate();
            if (respuesta > 0) {
                JOptionPane.showMessageDialog(null, "Datos correctamente modificados");
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
        }
    }

    /**
     * Metodo que elimina un cliente de la BD.
     */
    public final void eliminarCliente() {
        PreparedStatement sentencia = null;
        final Connection con = conexion.getConnection();
        // insertar los datos del cliente dentro de la BD
        try {
            sentencia = con.prepareStatement("delete from cliente where cli_cedula = ?");
            sentencia.setString(1, cliente.getCedula());
            final int respuesta = sentencia.executeUpdate();
            if (respuesta > 0) {
                JOptionPane.showMessageDialog(null, "Datos correctamente eliminados");
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
        }
    }

    /**
     * Metodo que hace la busqueda de un cliente.
     */
    public final void buscar() {
        PreparedStatement sentencia = null;
        final Connection con = conexion.getConnection();
        try {
            sentencia = con.prepareStatement("select * from cliente where cli_cedula = ?");
            sentencia.setString(1, cliente.getCedula());
            resultado = sentencia.executeQuery();
            if (resultado.next()) {
                JOptionPane.showMessageDialog(null, "Cliente Ya consta en la Base de Datos");
            } else {
                insert();
                JOptionPane.showMessageDialog(null, "Datos correctamente ingresados");
            }
        } catch (Exception ex) {
        }
    }  
    
    public CCliente buscarV() {
        int band = 0;
        PreparedStatement sentencia = null;
        CCliente cli = null;
        final Connection con = conexion.getConnection();
        try {
            sentencia = con.prepareStatement("select * from cliente where cli_cedula = ?");
            sentencia.setString(1, cliente.getCedula());
            resultado = sentencia.executeQuery();
            if (resultado.next()) {
                band++;
                cli = new CCliente(
                        resultado.getString(1), 
                        resultado.getString(2),
                        resultado.getString(3),
                        resultado.getString(4),
                        resultado.getString(5),
                        resultado.getString(7));
                if(band!=0){
                    JOptionPane.showMessageDialog(null, "Cliente Encontrado");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Cliente no encontrado");
            }
        } catch (Exception ex) {
            
        }
        return cli;
    }
}
