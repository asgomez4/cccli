package ec.edu.espe.ingswii.modelo;
/**
 * 
 * @author dovac
 */
public class CCliente {
    /**
     * Variable que acoge la cedula del cliente.
     */
    private String cedula;
    /**
     * Variable que acoge el nombre del usuario.
     */
    private String apellidop;
    private String apellidom;
    private String nombres;
    private String fijo;
    private float celular;
    private String direccion;
    private String correo;
    /**
     * Constructor de la clase CCliente.
     * @param cedula
     * @param nombre 
     */
    public CCliente(final String cedula,final String nombres) {
        this.cedula = cedula;       
        this.nombres=nombres;
//        this.apellidop= apellidop;
//        this.apellidom=apellidom;
//        this.fijo=fijo;
//        this.celular = celular;
//        this.direccion=direccion;
//        this.correo=correo;
//        final float fijo , final float celular,final String direccion,final String correo
    }
    
    public CCliente(final String cedula,final String apellidop, 
            final String apellidom,final String nombres, final String fijo, final String direccion) {
        this.cedula = cedula;   
        this.apellidop= apellidop;
        this.apellidom=apellidom;            
        this.nombres=nombres;
        this.fijo=fijo;
        this.direccion=direccion;
    }
    /**
     * Metodo que obtiene la cedula del cliente.
     * @return 
     */
    public final String getCedula() {
        return cedula;
    }
    /**
     * Metodo que ingresa la cedula dentro del objeto cliente.
     * @param cedula 
     */
    public final void setCedula(final String cedula) {
        this.cedula = cedula;
    }

    public String getApellidop() {
        return apellidop;
    }

    public String getApellidom() {
        return apellidom;
    }

    public String getNombres() {
        return nombres;
    }

    public String getFijo() {
        return fijo;
    }

    public float getCelular() {
        return celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setApellidop(String apellidop) {
        this.apellidop = apellidop;
    }

    public void setApellidom(String apellidom) {
        this.apellidom = apellidom;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setFijo(String fijo) {
        this.fijo = fijo;
    }

    public void setCelular(float celular) {
        this.celular = celular;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }    
}
