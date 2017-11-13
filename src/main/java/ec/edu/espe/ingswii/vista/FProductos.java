/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.ingswii.vista;

import javax.swing.JOptionPane;

/**
 *
 * @author Jessy
 */
public class FProductos extends javax.swing.JFrame {

    /**
     * Creates new form FProductos
     */
    public FProductos() {
        initComponents();        
        setSize(860, 480); //dar tamano fijo a la pantalla
        setLocationRelativeTo(null);//centrar la pantala 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        pnlProducto = new javax.swing.JPanel();
        lblGrupo = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        cbGrupo = new javax.swing.JComboBox<>();
        cbTipo = new javax.swing.JComboBox<>();
        btnGenerarCodigo = new javax.swing.JButton();
        pnlCrear = new javax.swing.JPanel();
        rdTipo = new javax.swing.JRadioButton();
        rdGrupo = new javax.swing.JRadioButton();
        btnNuevoGT = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pnlDetalles = new javax.swing.JPanel();
        lblTexto = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        rdNo = new javax.swing.JRadioButton();
        rdSi = new javax.swing.JRadioButton();
        lblStock = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblSerie = new javax.swing.JLabel();
        txtSerie = new javax.swing.JTextField();
        lblModelo = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        lblMarca = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        lblPrecio = new javax.swing.JLabel();
        lblTipo1 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        lblDescripcion = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        pnlResumen = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResumen = new javax.swing.JTextArea();
        pnlOpciones = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnGestionar = new javax.swing.JButton();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        pnlProducto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        pnlProducto.setLayout(null);

        lblGrupo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblGrupo.setText("Grupo:");
        pnlProducto.add(lblGrupo);
        lblGrupo.setBounds(30, 40, 37, 15);

        lblTipo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblTipo.setText("Tipo:");
        pnlProducto.add(lblTipo);
        lblTipo.setBounds(30, 70, 28, 15);

        cbGrupo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pnlProducto.add(cbGrupo);
        cbGrupo.setBounds(83, 30, 240, 28);

        cbTipo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pnlProducto.add(cbTipo);
        cbTipo.setBounds(83, 69, 240, 28);

        btnGenerarCodigo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnGenerarCodigo.setText("Generar Código");
        pnlProducto.add(btnGenerarCodigo);
        btnGenerarCodigo.setBounds(140, 115, 117, 23);

        pnlCrear.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Crear un nuevo:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        rdTipo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdTipo.setText("Tipo");

        rdGrupo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdGrupo.setText("Grupo");

        btnNuevoGT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnNuevoGT.setText("Nuevo");
        btnNuevoGT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoGTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCrearLayout = new javax.swing.GroupLayout(pnlCrear);
        pnlCrear.setLayout(pnlCrearLayout);
        pnlCrearLayout.setHorizontalGroup(
            pnlCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCrearLayout.createSequentialGroup()
                .addGroup(pnlCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCrearLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(rdGrupo)
                        .addGap(18, 18, 18)
                        .addComponent(rdTipo))
                    .addGroup(pnlCrearLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btnNuevoGT)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        pnlCrearLayout.setVerticalGroup(
            pnlCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCrearLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(pnlCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdTipo)
                    .addComponent(rdGrupo))
                .addGap(18, 18, 18)
                .addComponent(btnNuevoGT)
                .addGap(20, 20, 20))
        );

        pnlProducto.add(pnlCrear);
        pnlCrear.setBounds(361, 20, 190, 124);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("*");
        pnlProducto.add(jLabel3);
        jLabel3.setBounds(20, 70, 20, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("*");
        pnlProducto.add(jLabel4);
        jLabel4.setBounds(20, 40, 20, 15);

        getContentPane().add(pnlProducto);
        pnlProducto.setBounds(10, 0, 570, 160);

        pnlDetalles.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalles", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        pnlDetalles.setLayout(null);

        lblTexto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblTexto.setText("Es un producto con identificación?");
        pnlDetalles.add(lblTexto);
        lblTexto.setBounds(20, 70, 200, 15);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("*");
        pnlDetalles.add(jLabel8);
        jLabel8.setBounds(20, 220, 20, 15);

        lblCodigo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCodigo.setText("Código:");
        pnlDetalles.add(lblCodigo);
        lblCodigo.setBounds(30, 30, 41, 15);

        rdNo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdNo.setText("No");
        pnlDetalles.add(rdNo);
        rdNo.setBounds(270, 67, 40, 23);

        rdSi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdSi.setText("Si");
        pnlDetalles.add(rdSi);
        rdSi.setBounds(220, 67, 40, 23);

        lblStock.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblStock.setText("Stock:");
        pnlDetalles.add(lblStock);
        lblStock.setBounds(340, 220, 50, 15);

        txtCodigo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pnlDetalles.add(txtCodigo);
        txtCodigo.setBounds(90, 30, 220, 21);

        lblSerie.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSerie.setText("Serie:");
        pnlDetalles.add(lblSerie);
        lblSerie.setBounds(30, 100, 50, 15);

        txtSerie.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pnlDetalles.add(txtSerie);
        txtSerie.setBounds(90, 100, 220, 21);

        lblModelo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblModelo.setText("Modelo:");
        pnlDetalles.add(lblModelo);
        lblModelo.setBounds(30, 130, 50, 15);

        txtModelo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pnlDetalles.add(txtModelo);
        txtModelo.setBounds(90, 130, 220, 21);

        lblMarca.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblMarca.setText("Marca:");
        pnlDetalles.add(lblMarca);
        lblMarca.setBounds(30, 160, 50, 15);

        txtMarca.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pnlDetalles.add(txtMarca);
        txtMarca.setBounds(90, 160, 220, 21);

        txtPrecio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pnlDetalles.add(txtPrecio);
        txtPrecio.setBounds(90, 190, 220, 21);

        lblPrecio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPrecio.setText("Precio:");
        pnlDetalles.add(lblPrecio);
        lblPrecio.setBounds(30, 190, 50, 15);

        lblTipo1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblTipo1.setText("Tipo:");
        pnlDetalles.add(lblTipo1);
        lblTipo1.setBounds(30, 220, 50, 15);

        txtStock.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pnlDetalles.add(txtStock);
        txtStock.setBounds(390, 220, 90, 21);

        lblDescripcion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDescripcion.setText("Descripción:");
        pnlDetalles.add(lblDescripcion);
        lblDescripcion.setBounds(340, 100, 70, 15);

        txtTipo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pnlDetalles.add(txtTipo);
        txtTipo.setBounds(90, 220, 220, 21);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 0, 0));
        jLabel17.setText("*");
        pnlDetalles.add(jLabel17);
        jLabel17.setBounds(20, 30, 20, 15);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 0, 0));
        jLabel18.setText("*");
        pnlDetalles.add(jLabel18);
        jLabel18.setBounds(20, 190, 20, 15);

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane2.setViewportView(txtDescripcion);

        pnlDetalles.add(jScrollPane2);
        jScrollPane2.setBounds(340, 120, 210, 90);

        getContentPane().add(pnlDetalles);
        pnlDetalles.setBounds(10, 170, 570, 270);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("*");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 70, 20, 15);

        pnlResumen.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resúmen", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        txtResumen.setColumns(20);
        txtResumen.setRows(5);
        jScrollPane1.setViewportView(txtResumen);

        javax.swing.GroupLayout pnlResumenLayout = new javax.swing.GroupLayout(pnlResumen);
        pnlResumen.setLayout(pnlResumenLayout);
        pnlResumenLayout.setHorizontalGroup(
            pnlResumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResumenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlResumenLayout.setVerticalGroup(
            pnlResumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResumenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(pnlResumen);
        pnlResumen.setBounds(590, 0, 250, 280);

        pnlOpciones.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCancelar.setText("Cancelar");

        btnNuevo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnNuevo.setText("Nuevo");

        btnGuardar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnGuardar.setText("Guardar");

        btnGestionar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnGestionar.setText("Gestionar");
        btnGestionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlOpcionesLayout = new javax.swing.GroupLayout(pnlOpciones);
        pnlOpciones.setLayout(pnlOpcionesLayout);
        pnlOpcionesLayout.setHorizontalGroup(
            pnlOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpcionesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlOpcionesLayout.createSequentialGroup()
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlOpcionesLayout.createSequentialGroup()
                        .addComponent(btnGestionar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlOpcionesLayout.setVerticalGroup(
            pnlOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpcionesLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(pnlOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnGestionar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(pnlOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnNuevo))
                .addGap(21, 21, 21))
        );

        getContentPane().add(pnlOpciones);
        pnlOpciones.setBounds(590, 290, 250, 150);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoGTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoGTActionPerformed
        // TODO add your handling code here:
        //seleccionar opcion radio button
        if (rdGrupo.isSelected()==false && rdTipo.isSelected()==false){//valida sino a seleccionado alguna opcion 
            JOptionPane.showMessageDialog(null, "SELECCIONE EL GRUPO O TIPO HA CREAR");                
        }else{
            if (rdGrupo.isSelected()){
                //this.hide();
                FNuevoGrupo obj1 = new FNuevoGrupo();
                obj1.show();
            }
            if (rdTipo.isSelected()){
                //this.hide();
                FNuevoTipo obj2 = new FNuevoTipo();
                obj2.show();
            }
        }
    }//GEN-LAST:event_btnNuevoGTActionPerformed

    private void btnGestionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarActionPerformed
        // TODO add your handling code here:
        FGestionarProducto obj = new FGestionarProducto();
        obj.show();
    }//GEN-LAST:event_btnGestionarActionPerformed

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
            java.util.logging.Logger.getLogger(FProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGenerarCodigo;
    private javax.swing.JButton btnGestionar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnNuevoGT;
    private javax.swing.JComboBox<String> cbGrupo;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblGrupo;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblSerie;
    private javax.swing.JLabel lblStock;
    private javax.swing.JLabel lblTexto;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblTipo1;
    private javax.swing.JPanel pnlCrear;
    private javax.swing.JPanel pnlDetalles;
    private javax.swing.JPanel pnlOpciones;
    private javax.swing.JPanel pnlProducto;
    private javax.swing.JPanel pnlResumen;
    private javax.swing.JRadioButton rdGrupo;
    private javax.swing.JRadioButton rdNo;
    private javax.swing.JRadioButton rdSi;
    private javax.swing.JRadioButton rdTipo;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextArea txtResumen;
    private javax.swing.JTextField txtSerie;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
