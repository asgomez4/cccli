/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.ingswii.vista;

import ec.edu.espe.ingswii.modelo.CCliente;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.JTextField;

/**
 *
 * @author Sofia Gomez
 */
public class FVenta extends javax.swing.JFrame {

    private Calendar c;
    int año, mes, dia; 

    /**
     * Creates new form FVenta
     */
    public FVenta() {
        initComponents();
        c = Calendar.getInstance();
        año = c.get(Calendar.YEAR);
        mes = c.get(Calendar.MONTH) + 1;
        dia = c.get(Calendar.DATE);
        txtFechaVenta.setText(año + "/" + mes + "/" + dia);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlDatosCliente = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtClienteVenta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCIVenta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDirVenta = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtFechaVenta = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTelfVenta = new javax.swing.JTextField();
        btnLllenarDatos = new javax.swing.JButton();
        pnlTabla = new javax.swing.JPanel();
        btnMasPro = new javax.swing.JButton();
        btnMenPro = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProdVentas = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtSubTotal = new javax.swing.JTextField();
        txtIva = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnVGuardar = new javax.swing.JButton();
        btnVLimpiar = new javax.swing.JButton();
        btnVVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlDatosCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        pnlDatosCliente.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Cliente:");
        pnlDatosCliente.add(jLabel1);
        jLabel1.setBounds(10, 30, 41, 15);

        txtClienteVenta.setEditable(false);
        txtClienteVenta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pnlDatosCliente.add(txtClienteVenta);
        txtClienteVenta.setBounds(70, 30, 192, 21);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("C.I./RUC:");
        pnlDatosCliente.add(jLabel2);
        jLabel2.setBounds(10, 60, 50, 15);

        txtCIVenta.setEditable(false);
        txtCIVenta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pnlDatosCliente.add(txtCIVenta);
        txtCIVenta.setBounds(70, 60, 192, 21);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("C.I./RUC:");
        pnlDatosCliente.add(jLabel3);
        jLabel3.setBounds(10, 60, 50, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Dirección:");
        pnlDatosCliente.add(jLabel4);
        jLabel4.setBounds(10, 90, 53, 15);

        txtDirVenta.setEditable(false);
        txtDirVenta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pnlDatosCliente.add(txtDirVenta);
        txtDirVenta.setBounds(70, 90, 470, 21);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Fecha:");
        pnlDatosCliente.add(jLabel5);
        jLabel5.setBounds(290, 30, 36, 15);

        txtFechaVenta.setEditable(false);
        txtFechaVenta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pnlDatosCliente.add(txtFechaVenta);
        txtFechaVenta.setBounds(350, 30, 192, 21);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Teléfono:");
        pnlDatosCliente.add(jLabel6);
        jLabel6.setBounds(290, 60, 53, 15);

        txtTelfVenta.setEditable(false);
        txtTelfVenta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pnlDatosCliente.add(txtTelfVenta);
        txtTelfVenta.setBounds(350, 60, 192, 21);

        btnLllenarDatos.setBackground(new java.awt.Color(0, 153, 153));
        btnLllenarDatos.setText("Llenar datos del Cliente");
        btnLllenarDatos.setBorder(new javax.swing.border.MatteBorder(null));
        btnLllenarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLllenarDatosActionPerformed(evt);
            }
        });
        pnlDatosCliente.add(btnLllenarDatos);
        btnLllenarDatos.setBounds(550, 40, 130, 50);

        pnlTabla.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));

        btnMasPro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnMasPro.setForeground(new java.awt.Color(0, 102, 0));
        btnMasPro.setText("+");

        btnMenPro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnMenPro.setForeground(new java.awt.Color(255, 0, 0));
        btnMenPro.setText("-");

        tblProdVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Cantidad", "Descripción", "Precio Unit.", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProdVentas);

        javax.swing.GroupLayout pnlTablaLayout = new javax.swing.GroupLayout(pnlTabla);
        pnlTabla.setLayout(pnlTablaLayout);
        pnlTablaLayout.setHorizontalGroup(
            pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMasPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMenPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlTablaLayout.setVerticalGroup(
            pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTablaLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btnMasPro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMenPro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Subtotal:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("IVA 12%:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Total:");

        txtSubTotal.setEditable(false);
        txtSubTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtIva.setEditable(false);
        txtIva.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtTotal.setEditable(false);
        txtTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIva)
                            .addComponent(txtSubTotal)
                            .addComponent(txtTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel7)
                .addGap(16, 16, 16)
                .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(txtIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnVGuardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnVGuardar.setText("Guardar");

        btnVLimpiar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnVLimpiar.setText("Limpiar");

        btnVVolver.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnVVolver.setText("Volver");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnVGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVLimpiar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnVVolver)
                        .addGap(79, 79, 79)))
                .addGap(29, 29, 29))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVGuardar)
                    .addComponent(btnVLimpiar))
                .addGap(18, 18, 18)
                .addComponent(btnVVolver)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlDatosCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlDatosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pnlDatosCliente.getAccessibleContext().setAccessibleName("Datos del Cliente");
        pnlDatosCliente.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLllenarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLllenarDatosActionPerformed
        // TODO add your handling code here:
        FBuscarCliente obj = new FBuscarCliente();
        obj.setObj(this);
        obj.show();
    }//GEN-LAST:event_btnLllenarDatosActionPerformed

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
            java.util.logging.Logger.getLogger(FVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FVenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLllenarDatos;
    private javax.swing.JButton btnMasPro;
    private javax.swing.JButton btnMenPro;
    private javax.swing.JButton btnVGuardar;
    private javax.swing.JButton btnVLimpiar;
    private javax.swing.JButton btnVVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlDatosCliente;
    private javax.swing.JPanel pnlTabla;
    private javax.swing.JTable tblProdVentas;
    public javax.swing.JTextField txtCIVenta;
    public javax.swing.JTextField txtClienteVenta;
    public javax.swing.JTextField txtDirVenta;
    public javax.swing.JTextField txtFechaVenta;
    private javax.swing.JTextField txtIva;
    private javax.swing.JTextField txtSubTotal;
    public javax.swing.JTextField txtTelfVenta;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
