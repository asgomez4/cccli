/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventas;

/**
 *
 * @author Jessy
 */
public class JDVentas extends javax.swing.JDialog {

    /**
     * Creates new form JDVentas
     */
    public JDVentas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        javax.swing.JPanel pnlDatosCliente = new javax.swing.JPanel();
        javax.swing.JLabel lblCliente = new javax.swing.JLabel();
        javax.swing.JLabel lblRUC = new javax.swing.JLabel();
        javax.swing.JLabel lblDireccion = new javax.swing.JLabel();
        javax.swing.JTextField txtCliente = new javax.swing.JTextField();
        javax.swing.JTextField txtRUC = new javax.swing.JTextField();
        javax.swing.JTextField txtDireccion = new javax.swing.JTextField();
        javax.swing.JLabel lblFecha = new javax.swing.JLabel();
        javax.swing.JLabel lblTelefono = new javax.swing.JLabel();
        javax.swing.JTextField txtFecha = new javax.swing.JTextField();
        javax.swing.JTextField txtTelefono = new javax.swing.JTextField();
        javax.swing.JLabel lblLlenar = new javax.swing.JLabel();
        javax.swing.JLabel lblLLenarDatos = new javax.swing.JLabel();
        javax.swing.JPanel pnlProductos = new javax.swing.JPanel();
        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        javax.swing.JTable jtbProductos = new javax.swing.JTable();
        javax.swing.JLabel lblAnadir = new javax.swing.JLabel();
        javax.swing.JLabel lblQuitar = new javax.swing.JLabel();
        javax.swing.JTextField jTextField8 = new javax.swing.JTextField();
        javax.swing.JPanel pnlCalculos = new javax.swing.JPanel();
        javax.swing.JLabel lblSubtotal = new javax.swing.JLabel();
        javax.swing.JTextField txtSubtotal = new javax.swing.JTextField();
        javax.swing.JLabel lblIVA = new javax.swing.JLabel();
        javax.swing.JRadioButton rbSi = new javax.swing.JRadioButton();
        javax.swing.JRadioButton rbNo = new javax.swing.JRadioButton();
        javax.swing.JTextField txtIVA2 = new javax.swing.JTextField();
        javax.swing.JLabel lblDescuento = new javax.swing.JLabel();
        javax.swing.JTextField txtDescuento = new javax.swing.JTextField();
        javax.swing.JLabel lblTotal = new javax.swing.JLabel();
        javax.swing.JComboBox<String> cbDescuento = new javax.swing.JComboBox<>();
        javax.swing.JTextField txtTotal = new javax.swing.JTextField();
        javax.swing.JPanel pnlFormaPago = new javax.swing.JPanel();
        javax.swing.JRadioButton rbContado = new javax.swing.JRadioButton();
        javax.swing.JRadioButton rbCredito = new javax.swing.JRadioButton();
        javax.swing.JPanel pnlGuardar = new javax.swing.JPanel();
        javax.swing.JButton btnGuardar = new javax.swing.JButton();
        javax.swing.JLabel jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        pnlDatosCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 2, 14))); // NOI18N
        pnlDatosCliente.setToolTipText("");
        pnlDatosCliente.setOpaque(false);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jLabel14, org.jdesktop.beansbinding.ELProperty.create("${}"), pnlDatosCliente, org.jdesktop.beansbinding.BeanProperty.create("background"));
        bindingGroup.addBinding(binding);

        pnlDatosCliente.setLayout(null);

        lblCliente.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblCliente.setText("Cliente:");
        pnlDatosCliente.add(lblCliente);
        lblCliente.setBounds(20, 20, 43, 30);

        lblRUC.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblRUC.setText("RUC/CI.:");
        pnlDatosCliente.add(lblRUC);
        lblRUC.setBounds(20, 57, 48, 30);

        lblDireccion.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblDireccion.setText("Dirección:");
        pnlDatosCliente.add(lblDireccion);
        lblDireccion.setBounds(20, 100, 57, 20);

        txtCliente.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        pnlDatosCliente.add(txtCliente);
        txtCliente.setBounds(80, 20, 160, 23);

        txtRUC.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        pnlDatosCliente.add(txtRUC);
        txtRUC.setBounds(80, 60, 160, 23);

        txtDireccion.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        pnlDatosCliente.add(txtDireccion);
        txtDireccion.setBounds(80, 100, 430, 23);

        lblFecha.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblFecha.setText("Fecha:");
        pnlDatosCliente.add(lblFecha);
        lblFecha.setBounds(280, 20, 43, 30);

        lblTelefono.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblTelefono.setText("Teléfono:");
        pnlDatosCliente.add(lblTelefono);
        lblTelefono.setBounds(280, 57, 60, 30);

        txtFecha.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        pnlDatosCliente.add(txtFecha);
        txtFecha.setBounds(350, 20, 160, 23);

        txtTelefono.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        pnlDatosCliente.add(txtTelefono);
        txtTelefono.setBounds(350, 60, 160, 23);

        lblLlenar.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        lblLlenar.setText("Llenar datos del Cliente");
        pnlDatosCliente.add(lblLlenar);
        lblLlenar.setBounds(530, 20, 130, 17);

        lblLLenarDatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/registrar_venta_llenarD.png"))); // NOI18N
        pnlDatosCliente.add(lblLLenarDatos);
        lblLLenarDatos.setBounds(560, 50, 70, 70);

        getContentPane().add(pnlDatosCliente);
        pnlDatosCliente.setBounds(10, 30, 670, 138);

        pnlProductos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14))); // NOI18N
        pnlProductos.setOpaque(false);
        pnlProductos.setPreferredSize(new java.awt.Dimension(256, 130));
        pnlProductos.setLayout(null);

        jtbProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtbProductos);

        pnlProductos.add(jScrollPane1);
        jScrollPane1.setBounds(60, 10, 600, 200);

        lblAnadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/plus.png"))); // NOI18N
        pnlProductos.add(lblAnadir);
        lblAnadir.setBounds(10, 10, 32, 40);

        lblQuitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/minus-symbol.png"))); // NOI18N
        pnlProductos.add(lblQuitar);
        lblQuitar.setBounds(10, 70, 40, 20);

        jTextField8.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        pnlProductos.add(jTextField8);
        jTextField8.setBounds(130, 100, 100, 23);

        getContentPane().add(pnlProductos);
        pnlProductos.setBounds(10, 180, 670, 230);

        pnlCalculos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cálculos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 2, 14))); // NOI18N
        pnlCalculos.setOpaque(false);
        pnlCalculos.setLayout(null);

        lblSubtotal.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblSubtotal.setText("Subtotal:");
        pnlCalculos.add(lblSubtotal);
        lblSubtotal.setBounds(40, 20, 60, 30);

        txtSubtotal.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        pnlCalculos.add(txtSubtotal);
        txtSubtotal.setBounds(130, 20, 100, 23);

        lblIVA.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblIVA.setText("IVA 14%");
        pnlCalculos.add(lblIVA);
        lblIVA.setBounds(40, 57, 50, 30);

        rbSi.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        rbSi.setText("Si");
        pnlCalculos.add(rbSi);
        rbSi.setBounds(130, 57, 35, 25);

        rbNo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        rbNo.setText("No");
        pnlCalculos.add(rbNo);
        rbNo.setBounds(188, 57, 41, 25);

        txtIVA2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        pnlCalculos.add(txtIVA2);
        txtIVA2.setBounds(130, 90, 100, 23);

        lblDescuento.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblDescuento.setText("Descuento:");
        pnlCalculos.add(lblDescuento);
        lblDescuento.setBounds(40, 140, 70, 17);

        txtDescuento.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        pnlCalculos.add(txtDescuento);
        txtDescuento.setBounds(130, 140, 100, 23);

        lblTotal.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblTotal.setText("Total:");
        pnlCalculos.add(lblTotal);
        lblTotal.setBounds(40, 230, 50, 23);

        cbDescuento.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cbDescuento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pnlCalculos.add(cbDescuento);
        cbDescuento.setBounds(130, 180, 100, 23);

        txtTotal.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(204, 0, 0));
        pnlCalculos.add(txtTotal);
        txtTotal.setBounds(130, 230, 100, 30);

        getContentPane().add(pnlCalculos);
        pnlCalculos.setBounds(690, 30, 280, 280);

        pnlFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Forma de Pago", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 2, 14))); // NOI18N
        pnlFormaPago.setOpaque(false);
        pnlFormaPago.setLayout(null);

        rbContado.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        rbContado.setText("Contado");
        pnlFormaPago.add(rbContado);
        rbContado.setBounds(20, 30, 73, 25);

        rbCredito.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        rbCredito.setText("Crédito");
        pnlFormaPago.add(rbCredito);
        rbCredito.setBounds(20, 60, 67, 25);

        getContentPane().add(pnlFormaPago);
        pnlFormaPago.setBounds(690, 310, 130, 100);

        pnlGuardar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Guardar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 2, 14))); // NOI18N
        pnlGuardar.setOpaque(false);
        pnlGuardar.setLayout(null);

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/RegAdmin_guardar.png"))); // NOI18N
        pnlGuardar.add(btnGuardar);
        btnGuardar.setBounds(25, 20, 90, 70);

        getContentPane().add(pnlGuardar);
        pnlGuardar.setBounds(830, 310, 140, 100);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/fondo_CCCli_Registro.png"))); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(0, 0, 980, 420);

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(JDVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDVentas dialog = new JDVentas(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}