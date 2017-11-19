/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.ingswii.vista;

import ec.edu.espe.ingswii.controlador.CGrupoProductoDAO;
import ec.edu.espe.ingswii.controlador.CTipoProductoDAO;
import ec.edu.espe.ingswii.controlador.CVentaDAO;
import java.awt.event.ItemEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sofia Gomez
 */
public class FBuscarProducto extends javax.swing.JFrame {

    DefaultTableModel modelo;
    FVenta nuevaVenta;
    float precioUni;
    float precioTotal;
    float subTotal;
    float total;

    public FVenta getNuevaVenta() {
        return nuevaVenta;
    }

    public void setNuevaVenta(FVenta nuevaVenta) {
        this.nuevaVenta = nuevaVenta;
    }

    /**
     * Creates new form FBuscarProducto
     */
    public FBuscarProducto() {
        initComponents();
        subTotal = 0;
        total = 0;
        setLocationRelativeTo(null);//centrar la pantalla 
        modelo = new DefaultTableModel();
        CGrupoProductoDAO cc = new CGrupoProductoDAO();
        jcbGrupoV.removeAllItems();
        for (int i = 0; i < cc.mostrarGrupo().size(); i++) {
            jcbGrupoV.addItem(cc.mostrarGrupo().get(i).getGrupo().toString());
        }        
        modelo.addColumn("Cant.");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Precio Unit.");
        modelo.addColumn("Total");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jcbGrupoV = new javax.swing.JComboBox<>();
        jcbTipoV = new javax.swing.JComboBox<>();
        jcbDescV = new javax.swing.JComboBox<>();
        jcbCantV = new javax.swing.JComboBox<>();
        btnAñadirV = new javax.swing.JButton();
        btnVolverV = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Grupo:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Tipo:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Descripcion:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Cantidad:");

        jcbGrupoV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbGrupoV.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbGrupoVItemStateChanged(evt);
            }
        });

        jcbTipoV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbTipoV.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbTipoVItemStateChanged(evt);
            }
        });

        jcbDescV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbDescV.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbDescVItemStateChanged(evt);
            }
        });

        jcbCantV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcbCantV.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbCantVItemStateChanged(evt);
            }
        });

        btnAñadirV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAñadirV.setText("Añadir");
        btnAñadirV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirVActionPerformed(evt);
            }
        });

        btnVolverV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnVolverV.setText("Volver");
        btnVolverV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jcbDescV, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(47, 47, 47)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jcbTipoV, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jcbGrupoV, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jcbCantV, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnAñadirV)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnVolverV)
                                        .addGap(32, 32, 32)))))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbGrupoV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbTipoV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jcbDescV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jcbCantV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAñadirV)
                    .addComponent(btnVolverV))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbGrupoVItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbGrupoVItemStateChanged
        // TODO add your handling code here:
        String nombre = "";
        jcbTipoV.removeAllItems();
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            nombre = jcbGrupoV.getSelectedItem().toString();
            CTipoProductoDAO tip = new CTipoProductoDAO();
            for (int i = 0; i < tip.mostrarTipo(nombre).size(); i++) {
                jcbTipoV.addItem(tip.mostrarTipo(nombre).get(i).getTipo().toString());
            }
        }
    }//GEN-LAST:event_jcbGrupoVItemStateChanged

    private void btnAñadirVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirVActionPerformed
        // TODO add your handling code here:
        listado(modelo);
    }//GEN-LAST:event_btnAñadirVActionPerformed

    /**
     * Metodo que muetra datos de los productos.
     */
    protected final void listado(DefaultTableModel modelo) {
        String vacio = "";        
        CVentaDAO venta = new CVentaDAO();
        try {
            precioTotal = precioUni * Float.parseFloat(jcbCantV.getSelectedItem().toString());
            nuevaVenta.tblProdVentas.setModel(modelo);
            nuevaVenta.tblProdVentas.setModel(venta.visualisarProductos((modelo),
                     jcbCantV.getSelectedItem().toString(), jcbDescV.getSelectedItem().toString(),
                     String.valueOf(precioUni), String.valueOf(precioTotal)));
            subTotal += precioTotal;
            total = (float)(subTotal + (subTotal * 0.12));
            nuevaVenta.txtSubTotal.setText(String.valueOf(subTotal));
            nuevaVenta.txtIva.setText(String.valueOf((double)Math.round((subTotal * 0.12) * 100d) / 100d));
            nuevaVenta.txtTotal.setText(String.valueOf(total));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error");
            ex.printStackTrace();
        }
    }
    private void jcbTipoVItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbTipoVItemStateChanged
        // TODO add your handling code here:
        String nombre = "";
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            nombre = jcbTipoV.getSelectedItem().toString();
            CVentaDAO tip = new CVentaDAO();
            for (int i = 0; i < tip.Descripcion(nombre).size(); i++) {
                jcbDescV.addItem(tip.Descripcion(nombre).get(i).getProDescripcion().toString());
            }
        }
    }//GEN-LAST:event_jcbTipoVItemStateChanged

    private void jcbCantVItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbCantVItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbCantVItemStateChanged

    private void jcbDescVItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbDescVItemStateChanged
        // TODO add your handling code here:
        jcbCantV.removeAllItems();
        String subtipo;
        String descripcion;
        CVentaDAO tip = new CVentaDAO();
        int cantidadPro = 0;
        descripcion = jcbDescV.getSelectedItem().toString();
        subtipo = jcbTipoV.getSelectedItem().toString();
        cantidadPro = tip.Cantidad_Productos_Stock(subtipo, descripcion);
        for (int i = 1; i <= cantidadPro; i++) {
            jcbCantV.addItem(String.valueOf(i));
        }
        precioUni = tip.Precio_Producto(subtipo, descripcion);
    }//GEN-LAST:event_jcbDescVItemStateChanged

    private void btnVolverVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverVActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverVActionPerformed

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
            java.util.logging.Logger.getLogger(FBuscarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FBuscarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FBuscarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FBuscarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FBuscarProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAñadirV;
    private javax.swing.JButton btnVolverV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcbCantV;
    private javax.swing.JComboBox<String> jcbDescV;
    private javax.swing.JComboBox<String> jcbGrupoV;
    private javax.swing.JComboBox<String> jcbTipoV;
    // End of variables declaration//GEN-END:variables
}
