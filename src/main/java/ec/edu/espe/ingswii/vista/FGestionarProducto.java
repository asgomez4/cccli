/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.ingswii.vista;

import ec.edu.espe.ingswii.controlador.CGrupoProductoDAO;
import ec.edu.espe.ingswii.controlador.CProductoDAO;
import ec.edu.espe.ingswii.controlador.CTipoProductoDAO;
import ec.edu.espe.ingswii.modelo.CProducto;
import java.awt.HeadlessException;
import java.awt.event.ItemEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jessy
 */
public class FGestionarProducto extends javax.swing.JFrame {

    /**
     * Creates new form FBProducto
     */
    CProductoDAO proDAO;
    public FGestionarProducto() {
        initComponents();
        this.setTitle("Gestión de Producto");
        setSize(885, 460);//dar tamano fijo a la pantalla
        setLocationRelativeTo(null); //centrar la pantala        
        CGrupoProductoDAO cc = new CGrupoProductoDAO();
        for (int i = 0; i < cc.mostrarGrupo().size(); i++) {
            cbGrupo.addItem(cc.mostrarGrupo().get(i).getGrupo().toString());
        }
        listadoProductoTotal();
    }
    public void limpiarDatos() {
        txtCodigo.setText("");
        txtModelo.setText("");
    }
    protected final void listadoProductoTotal() {
        String vacio = "";
        DefaultTableModel model = new DefaultTableModel();
        try {
            String codigo = txtCodigo.getText();
            String serie = txtModelo.getText();
            String modelo = txtMarca.getText();
            String marca = txtPrecio.getText();
            String precio = txtTipo.getText();
            String tipo = txtSerie.getText();
            String descripcion = txtDescripcion.getText();
            String stock = txtStock.getText();
            proDAO = new CProductoDAO(new CProducto(codigo,serie,modelo,marca,precio,tipo,descripcion,stock));
            model.addColumn("Código");
            model.addColumn("Serie");
            model.addColumn("Modelo");
            model.addColumn("Marca");
            model.addColumn("Precio");
            model.addColumn("Tipo");
            model.addColumn("Descripción");
            model.addColumn("Stock");
            tblProducto.setModel(model);
            tblProducto.setModel(proDAO.visualisarProductosTotal((model)));
            limpiarDatos();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "INTENTELO DE NUEVO");
            ex.printStackTrace();
        }
    }
    protected final void listadoTipo() {
        String tipo = cbTipo.getSelectedItem().toString();
        DefaultTableModel model = new DefaultTableModel();
        try {
            String codigo = txtCodigo.getText();
            String serie = txtModelo.getText();
            String modelo = txtMarca.getText();
            String marca = txtPrecio.getText();
            String precio = txtTipo.getText();
            String descripcion = txtDescripcion.getText();
            String stock = txtStock.getText();
            proDAO = new CProductoDAO(new CProducto(codigo,serie,modelo,marca,precio,tipo,descripcion,stock));
            model.addColumn("Código");
            model.addColumn("Serie");
            model.addColumn("Modelo");
            model.addColumn("Marca");
            model.addColumn("Precio");
            model.addColumn("Tipo");
            model.addColumn("Descripción");
            model.addColumn("Stock");
            tblProducto.setModel(model);
            tblProducto.setModel(proDAO.buscarTipo((model)));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "INTENTELO DE NUEVO");
            ex.printStackTrace();
        }
    }
    public void CargarDatosFila(){
        int filaseleccionada = tblProducto.getSelectedRow();
        String codigo = (String)tblProducto.getValueAt(filaseleccionada, 0);
        String serie = (String)tblProducto.getValueAt(filaseleccionada, 1);
        String modelo = (String)tblProducto.getValueAt(filaseleccionada, 2);
        String marca = (String)tblProducto.getValueAt(filaseleccionada, 3);
        String precio = (String)tblProducto.getValueAt(filaseleccionada, 4);
        String tipo = (String)tblProducto.getValueAt(filaseleccionada, 5);
        String descripcion = (String)tblProducto.getValueAt(filaseleccionada, 6);
        String stock = (String)tblProducto.getValueAt(filaseleccionada, 7);      

        //Volcamos los datos de la tabla en los jTextFields.
        Object[] vc = new Object[8];
        vc[0] = codigo;
        vc[1] = serie;
        vc[2] = modelo;
        vc[3] = marca;
        vc[4] = precio;
        vc[5] = tipo;
        vc[6] = descripcion;
        vc[7] = stock;
        txtCodigo.setText(String.valueOf(vc[0]));
        txtSerie.setText(String.valueOf(vc[1]));
        txtModelo.setText(String.valueOf(vc[2]));
        txtMarca.setText(String.valueOf(vc[3]));
        txtPrecio.setText(String.valueOf(vc[4]));
        txtTipo.setText(String.valueOf(vc[5]));
        txtDescripcion.setText(String.valueOf(vc[6]));
        txtStock.setText(String.valueOf(vc[7]));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlProducto = new javax.swing.JPanel();
        pnlGT = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbTipo = new javax.swing.JComboBox<>();
        cbGrupo = new javax.swing.JComboBox<>();
        btnSerie = new javax.swing.JButton();
        pnlLista = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducto = new javax.swing.JTable();
        pnlAcciones = new javax.swing.JPanel();
        lblStock = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        lblSerie = new javax.swing.JLabel();
        lblModelo = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        txtSerie = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        pnlOpciones = new javax.swing.JPanel();
        btnCargar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        pnlProducto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        pnlProducto.setLayout(null);

        pnlGT.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modo de Búsqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        pnlGT.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Grupo:");
        pnlGT.add(jLabel1);
        jLabel1.setBounds(10, 27, 37, 15);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Tipo:");
        pnlGT.add(jLabel2);
        jLabel2.setBounds(10, 70, 28, 15);

        cbTipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbTipoItemStateChanged(evt);
            }
        });
        pnlGT.add(cbTipo);
        cbTipo.setBounds(70, 70, 170, 23);

        cbGrupo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbGrupo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbGrupoItemStateChanged(evt);
            }
        });
        pnlGT.add(cbGrupo);
        cbGrupo.setBounds(70, 27, 170, 23);

        btnSerie.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSerie.setText("Serie");
        pnlGT.add(btnSerie);
        btnSerie.setBounds(260, 50, 80, 23);

        pnlProducto.add(pnlGT);
        pnlGT.setBounds(10, 30, 360, 120);

        getContentPane().add(pnlProducto);
        pnlProducto.setBounds(10, 11, 380, 170);

        pnlLista.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        pnlLista.setLayout(null);

        tblProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblProducto);

        pnlLista.add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 580, 220);

        getContentPane().add(pnlLista);
        pnlLista.setBounds(10, 190, 580, 220);

        pnlAcciones.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Acciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        pnlAcciones.setLayout(null);

        lblStock.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblStock.setText("Stock:");
        pnlAcciones.add(lblStock);
        lblStock.setBounds(20, 300, 50, 15);

        lblCodigo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCodigo.setText("Código:");
        pnlAcciones.add(lblCodigo);
        lblCodigo.setBounds(20, 30, 50, 15);

        lblTipo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblTipo.setText("Serie:");
        pnlAcciones.add(lblTipo);
        lblTipo.setBounds(20, 60, 50, 15);

        lblSerie.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSerie.setText("Modelo:");
        pnlAcciones.add(lblSerie);
        lblSerie.setBounds(20, 90, 50, 15);

        lblModelo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblModelo.setText("Marca:");
        pnlAcciones.add(lblModelo);
        lblModelo.setBounds(20, 120, 50, 15);

        lblMarca.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblMarca.setText("Precio:");
        pnlAcciones.add(lblMarca);
        lblMarca.setBounds(20, 150, 50, 15);

        lblPrecio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPrecio.setText("Tipo:");
        pnlAcciones.add(lblPrecio);
        lblPrecio.setBounds(20, 180, 50, 15);

        lblDescripcion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDescripcion.setText("Descripción:");
        pnlAcciones.add(lblDescripcion);
        lblDescripcion.setBounds(20, 210, 70, 15);

        txtDescripcion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pnlAcciones.add(txtDescripcion);
        txtDescripcion.setBounds(90, 210, 160, 80);

        txtCodigo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pnlAcciones.add(txtCodigo);
        txtCodigo.setBounds(90, 30, 160, 21);

        txtSerie.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pnlAcciones.add(txtSerie);
        txtSerie.setBounds(90, 60, 160, 21);

        txtModelo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pnlAcciones.add(txtModelo);
        txtModelo.setBounds(90, 90, 160, 21);

        txtMarca.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pnlAcciones.add(txtMarca);
        txtMarca.setBounds(90, 120, 160, 21);

        txtPrecio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pnlAcciones.add(txtPrecio);
        txtPrecio.setBounds(90, 150, 160, 21);

        txtStock.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pnlAcciones.add(txtStock);
        txtStock.setBounds(90, 300, 90, 21);

        txtTipo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pnlAcciones.add(txtTipo);
        txtTipo.setBounds(90, 180, 160, 21);

        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnGuardar.setText("Guardar");
        pnlAcciones.add(btnGuardar);
        btnGuardar.setBounds(40, 350, 90, 25);

        btnVolver.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnVolver.setText("Volver");
        pnlAcciones.add(btnVolver);
        btnVolver.setBounds(160, 350, 80, 23);

        getContentPane().add(pnlAcciones);
        pnlAcciones.setBounds(600, 10, 260, 400);

        pnlOpciones.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        pnlOpciones.setLayout(null);

        btnCargar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCargar.setText("Cargar Fila Seleccionada");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });
        pnlOpciones.add(btnCargar);
        btnCargar.setBounds(20, 30, 161, 40);

        btnModificar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnModificar.setText("Modificar");
        pnlOpciones.add(btnModificar);
        btnModificar.setBounds(60, 83, 80, 23);

        btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        pnlOpciones.add(btnEliminar);
        btnEliminar.setBounds(60, 120, 80, 23);

        getContentPane().add(pnlOpciones);
        pnlOpciones.setBounds(400, 10, 190, 170);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbGrupoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbGrupoItemStateChanged
        // TODO add your handling code here:
        String nombre = ""; 
        cbTipo.removeAllItems(); 
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            nombre = cbGrupo.getSelectedItem().toString();
            CTipoProductoDAO tip = new CTipoProductoDAO();
            for (int i = 0; i < tip.mostrarTipo(nombre).size(); i++) {                
                cbTipo.addItem(tip.mostrarTipo(nombre).get(i).getTipo().toString());
            }
        }
    }//GEN-LAST:event_cbGrupoItemStateChanged

    private void cbTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbTipoItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            listadoTipo();
        }
    }//GEN-LAST:event_cbTipoItemStateChanged

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        // TODO add your handling code here:
        int filaseleccionada;
        try{
            //Guardamos en un entero la fila seleccionada.
            filaseleccionada = tblProducto.getSelectedRow();
            if (filaseleccionada == -1){
                JOptionPane.showMessageDialog(null, "NO HA SELECCIONADO UNA FILA");
            } else {                  
                CargarDatosFila();
            }
        }catch (HeadlessException ex){
            JOptionPane.showMessageDialog(null, "Error: "+ex+"\nInténtelo nuevamente", " .::Error En la Operacion::." ,JOptionPane.ERROR_MESSAGE);
        }   
    }//GEN-LAST:event_btnCargarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FGestionarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FGestionarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FGestionarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FGestionarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FGestionarProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSerie;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cbGrupo;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblSerie;
    private javax.swing.JLabel lblStock;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JPanel pnlAcciones;
    private javax.swing.JPanel pnlGT;
    private javax.swing.JPanel pnlLista;
    private javax.swing.JPanel pnlOpciones;
    private javax.swing.JPanel pnlProducto;
    private javax.swing.JTable tblProducto;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtSerie;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
