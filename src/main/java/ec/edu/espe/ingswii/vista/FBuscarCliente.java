/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.ingswii.vista;

import ec.edu.espe.ingswii.controlador.CClienteDAO;
import ec.edu.espe.ingswii.modelo.CCliente;
import javax.swing.JOptionPane;

/**
 *
 * @author Sofia Gomez
 */
public class FBuscarCliente extends javax.swing.JFrame {
    CCliente nuevo;
    FVenta objVenta = new FVenta();

    public FVenta getObj() {
        return objVenta;
    }

    public void setObj(FVenta obj) {
        this.objVenta = obj;
    }
    /**
     * Creates new form FBuscarCliente
     */
    public FBuscarCliente() {
        setLocationRelativeTo(null);//centrar la pantala 
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

        jLabel1 = new javax.swing.JLabel();
        txtCeBC = new javax.swing.JTextField();
        btnCliBus = new javax.swing.JButton();
        btnCliVol = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Ingrese el número de cédula del cliente");

        txtCeBC.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnCliBus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCliBus.setText("Buscar");
        btnCliBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCliBusActionPerformed(evt);
            }
        });

        btnCliVol.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCliVol.setText("Volver");
        btnCliVol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCliVolActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCliBus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCliVol))
                            .addComponent(txtCeBC, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCeBC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCliVol)
                    .addComponent(btnCliBus))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCliVolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCliVolActionPerformed
        // TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_btnCliVolActionPerformed

    private void btnCliBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCliBusActionPerformed
        // TODO add your handling code here:
        String cedula = txtCeBC.getText();
        nuevo = new CCliente(cedula,null);
        CClienteDAO obj = new CClienteDAO(nuevo);
        nuevo = obj.buscarV();
        objVenta.txtClienteVenta.setText(nuevo.getApellidop()+ " " + nuevo.getApellidom() 
                + " " + nuevo.getNombres());
        objVenta.txtCIVenta.setText(nuevo.getCedula());
        objVenta.txtDirVenta.setText(nuevo.getDireccion());
        objVenta.txtTelfVenta.setText(nuevo.getFijo());
        this.hide();
        
    }//GEN-LAST:event_btnCliBusActionPerformed

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
            java.util.logging.Logger.getLogger(FBuscarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FBuscarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FBuscarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FBuscarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FBuscarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCliBus;
    private javax.swing.JButton btnCliVol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtCeBC;
    // End of variables declaration//GEN-END:variables
}
