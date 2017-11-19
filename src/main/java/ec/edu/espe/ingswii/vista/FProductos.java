/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.ingswii.vista;

import ec.edu.espe.ingswii.controlador.CGrupoProductoDAO;
import ec.edu.espe.ingswii.controlador.CProductoDAO;
import ec.edu.espe.ingswii.controlador.CTipoProductoDAO;
import java.awt.event.ItemEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Jessy
 */
public class FProductos extends javax.swing.JFrame {

    /**
     * Creates new form FProductos
     */
    CProductoDAO pro=new CProductoDAO();
    public FProductos() {
        initComponents();
        setSize(875, 490); //dar tamano fijo a la pantalla
        setLocationRelativeTo(null);//centrar la pantala 
        CGrupoProductoDAO cc = new CGrupoProductoDAO();
        for (int i = 0; i < cc.mostrarGrupo().size(); i++) {
            cbGrupo.addItem(cc.mostrarGrupo().get(i).getGrupo().toString());
        }
        Editable();
        Ocultar();
        cbTipo.setSelectedIndex(0);
        cbGrupo.setSelectedIndex(0);
    }
    public void Editable(){
        txtCodigo.setEditable(false);
        txtSerie.setEditable(false);txtModelo.setEditable(false);txtMarca.setEditable(false);
        txtPrecio.setEditable(false);txtTipo.setEditable(false);txtDescripcion.setEditable(false);
        txtResumen.setEditable(false);
    }
    public void Ocultar(){
        txtSerie.setVisible(false);lblSerie.setVisible(false);
        txtModelo.setVisible(false);lblModelo.setVisible(false);
        txtMarca.setVisible(false);lblMarca.setVisible(false);
        txtPrecio.setVisible(false);lblPrecio.setVisible(false);
        txtTipo.setVisible(false);lblTipo1.setVisible(false);
        txtDescripcion.setVisible(false);lblDescripcion.setVisible(false);
        txt1.setVisible(false);txt2.setVisible(false);txt3.setVisible(false);
        txtStock.setVisible(false);lblStock.setVisible(false);
    }
    public void MostrarSi(){
        txtSerie.setVisible(true);lblSerie.setVisible(true); txtSerie.setEditable(true);
        txtModelo.setVisible(true);lblModelo.setVisible(true);txtModelo.setEditable(true);
        txtMarca.setVisible(true);lblMarca.setVisible(true);txtMarca.setEditable(true);
        txtPrecio.setVisible(true);lblPrecio.setVisible(true);txtPrecio.setEditable(true);
        txtTipo.setVisible(true);lblTipo1.setVisible(true);
        txtDescripcion.setVisible(true);lblDescripcion.setVisible(true);txtDescripcion.setEditable(true);
        txt1.setVisible(true);txt2.setVisible(true);txt3.setVisible(true);
        txtStock.setVisible(true);lblStock.setVisible(true);
        String st="1";
        txtStock.setText(st); txtStock.setEditable(false);
    }
    public void MostrarNo(){
        
        txtMarca.setVisible(true);lblMarca.setVisible(true);txtMarca.setEditable(true);
        txtPrecio.setVisible(true);lblPrecio.setVisible(true);txtPrecio.setEditable(true);
        txtTipo.setVisible(true);lblTipo1.setVisible(true);
        txtDescripcion.setVisible(true);lblDescripcion.setVisible(true);txtDescripcion.setEditable(true);
        txt1.setVisible(true);txt2.setVisible(true);txt3.setVisible(true);
        txtStock.setVisible(true);lblStock.setVisible(true);
        txtStock.setText("");txtStock.setEditable(true);
        txtSerie.setText(""); txtModelo.setText("");
    }
    public void Limpiar(){
        txtCodigo.setText("");
        txtSerie.setText("");
        txtModelo.setText("");
        txtMarca.setText("");
        txtPrecio.setText("");
        txtTipo.setText("");
        txtDescripcion.setText("");
        txtStock.setText("");
        cbTipo.setSelectedIndex(0);
        cbGrupo.setSelectedIndex(0);
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
        txt3 = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
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
        txt1 = new javax.swing.JLabel();
        txt2 = new javax.swing.JLabel();
        btnNo = new javax.swing.JButton();
        btnSi = new javax.swing.JButton();
        txtDescripcion = new javax.swing.JTextField();
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
        cbGrupo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbGrupoItemStateChanged(evt);
            }
        });
        pnlProducto.add(cbGrupo);
        cbGrupo.setBounds(83, 30, 240, 28);

        cbTipo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pnlProducto.add(cbTipo);
        cbTipo.setBounds(83, 69, 240, 28);

        btnGenerarCodigo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnGenerarCodigo.setText("Generar Código");
        btnGenerarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarCodigoActionPerformed(evt);
            }
        });
        pnlProducto.add(btnGenerarCodigo);
        btnGenerarCodigo.setBounds(140, 115, 117, 23);

        pnlCrear.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Crear un nuevo:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        rdTipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdTipo.setText("Tipo");

        rdGrupo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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
                        .addGap(15, 15, 15)
                        .addComponent(rdGrupo)
                        .addGap(28, 28, 28)
                        .addComponent(rdTipo))
                    .addGroup(pnlCrearLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btnNuevoGT)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        pnlCrearLayout.setVerticalGroup(
            pnlCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCrearLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
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
        lblTexto.setBounds(20, 60, 200, 15);

        txt3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt3.setForeground(new java.awt.Color(255, 0, 0));
        txt3.setText("*");
        pnlDetalles.add(txt3);
        txt3.setBounds(20, 250, 20, 15);

        lblCodigo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCodigo.setText("Código:");
        pnlDetalles.add(lblCodigo);
        lblCodigo.setBounds(30, 30, 41, 15);

        lblStock.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblStock.setText("Stock:");
        pnlDetalles.add(lblStock);
        lblStock.setBounds(340, 250, 50, 15);

        txtCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCodigoMouseClicked(evt);
            }
        });
        pnlDetalles.add(txtCodigo);
        txtCodigo.setBounds(90, 20, 220, 30);

        lblSerie.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSerie.setText("Serie:");
        pnlDetalles.add(lblSerie);
        lblSerie.setBounds(30, 90, 50, 15);

        txtSerie.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtSerie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSerieKeyReleased(evt);
            }
        });
        pnlDetalles.add(txtSerie);
        txtSerie.setBounds(90, 90, 220, 30);

        lblModelo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblModelo.setText("Modelo:");
        pnlDetalles.add(lblModelo);
        lblModelo.setBounds(30, 130, 50, 15);

        txtModelo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtModeloKeyReleased(evt);
            }
        });
        pnlDetalles.add(txtModelo);
        txtModelo.setBounds(90, 128, 220, 30);

        lblMarca.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblMarca.setText("Marca:");
        pnlDetalles.add(lblMarca);
        lblMarca.setBounds(30, 170, 50, 15);

        txtMarca.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMarcaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMarcaKeyTyped(evt);
            }
        });
        pnlDetalles.add(txtMarca);
        txtMarca.setBounds(90, 165, 220, 30);

        txtPrecio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });
        pnlDetalles.add(txtPrecio);
        txtPrecio.setBounds(90, 203, 220, 30);

        lblPrecio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPrecio.setText("Precio:");
        pnlDetalles.add(lblPrecio);
        lblPrecio.setBounds(30, 210, 50, 15);

        lblTipo1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblTipo1.setText("Tipo:");
        pnlDetalles.add(lblTipo1);
        lblTipo1.setBounds(30, 250, 50, 15);

        txtStock.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pnlDetalles.add(txtStock);
        txtStock.setBounds(390, 240, 90, 30);

        lblDescripcion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDescripcion.setText("Descripción:");
        pnlDetalles.add(lblDescripcion);
        lblDescripcion.setBounds(340, 100, 70, 15);

        txtTipo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pnlDetalles.add(txtTipo);
        txtTipo.setBounds(90, 240, 220, 30);

        txt1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt1.setForeground(new java.awt.Color(255, 0, 0));
        txt1.setText("*");
        pnlDetalles.add(txt1);
        txt1.setBounds(20, 30, 20, 15);

        txt2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt2.setForeground(new java.awt.Color(255, 0, 0));
        txt2.setText("*");
        pnlDetalles.add(txt2);
        txt2.setBounds(20, 210, 20, 15);

        btnNo.setText("No");
        btnNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoActionPerformed(evt);
            }
        });
        pnlDetalles.add(btnNo);
        btnNo.setBounds(260, 60, 50, 23);

        btnSi.setText("Si");
        btnSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiActionPerformed(evt);
            }
        });
        pnlDetalles.add(btnSi);
        btnSi.setBounds(218, 60, 40, 23);
        pnlDetalles.add(txtDescripcion);
        txtDescripcion.setBounds(340, 130, 210, 100);

        getContentPane().add(pnlDetalles);
        pnlDetalles.setBounds(10, 170, 570, 280);

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
        btnCancelar.setText("Volver");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnNuevo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(pnlOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnNuevo))
                .addGap(21, 21, 21))
        );

        getContentPane().add(pnlOpciones);
        pnlOpciones.setBounds(590, 290, 250, 160);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoGTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoGTActionPerformed
        // TODO add your handling code here:
        //seleccionar opcion radio button
        if ((rdGrupo.isSelected() == false && rdTipo.isSelected() == false) || 
                (rdGrupo.isSelected() == true && rdTipo.isSelected() == true)) {//valida sino a seleccionado alguna opcion 
            JOptionPane.showMessageDialog(null, "SELECCIONE EL GRUPO O TIPO HA CREAR");
        }
        else {
            if (rdGrupo.isSelected()) {
                //this.hide();
                FNuevoGrupo obj1 = new FNuevoGrupo();
                obj1.setVisible(true);
                dispose();
            }
            if (rdTipo.isSelected()) {
                //this.hide();
                FNuevoTipo obj2 = new FNuevoTipo();
                obj2.setVisible(true);
                dispose();
            }
        }
    }//GEN-LAST:event_btnNuevoGTActionPerformed

    private void btnGestionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarActionPerformed
        // TODO add your handling code here:
        FGestionarProducto obj = new FGestionarProducto();
        obj.show();
    }//GEN-LAST:event_btnGestionarActionPerformed

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

    private void btnGenerarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarCodigoActionPerformed
        // TODO add your handling code here:
        if (cbGrupo.getSelectedItem()=="SELECCIONAR GRUPO" || cbTipo.getSelectedItem()=="SELECCIONAR TIPO"){
            JOptionPane.showMessageDialog(null, "SELECCIONE EL GRUPO Y TIPO DE PRODUCTO");                
        }
        else{
            pro.GenerarCodigo(cbGrupo, cbTipo, txtTipo, txtCodigo); 
            pnlProducto.setEnabled(false);
            btnGenerarCodigo.setEnabled(false);
        }
    }//GEN-LAST:event_btnGenerarCodigoActionPerformed

    private void txtCodigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCodigoMouseClicked
        // TODO add your handling code here:
        if(txtCodigo.getText().equals("")){   
            JOptionPane.showMessageDialog(null, "NO HA GENERADO UN CÓDIGO");
        }             
    }//GEN-LAST:event_txtCodigoMouseClicked

    private void txtSerieKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSerieKeyReleased
        // TODO add your handling code here:
        txtSerie.setText(txtSerie.getText().toUpperCase());
    }//GEN-LAST:event_txtSerieKeyReleased

    private void txtModeloKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModeloKeyReleased
        // TODO add your handling code here:
        txtModelo.setText(txtModelo.getText().toUpperCase());
    }//GEN-LAST:event_txtModeloKeyReleased

    private void txtMarcaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarcaKeyReleased
        // TODO add your handling code here:
        txtMarca.setText(txtMarca.getText().toUpperCase());
    }//GEN-LAST:event_txtMarcaKeyReleased

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:        
        int exito =  pro.insetarProducto(txtCodigo.getText(), txtSerie.getText(), txtModelo.getText(), txtMarca.getText(), txtPrecio.getText(), txtTipo.getText(), txtDescripcion.getText(), txtStock.getText());
        if(exito>0){
            JOptionPane.showMessageDialog(null, "PRODUCTO GUARDADO ","ÉXITO", JOptionPane.INFORMATION_MESSAGE);            
            String resumen = "USTED HA REGISTRADO LA SIGUIENTE INFORMACIÓN: \nCódigo: " + txtCodigo.getText() + "\nSerie: " + txtSerie.getText() + "\nModelo: " + txtModelo.getText()+
                            "\nMarca: " + txtMarca.getText() + "\nPrecio: " + txtPrecio.getText() + "\nTipo: " +"\nDescripción: "+ txtDescripcion.getText() + txtTipo.getText() + "\nStock: " + txtStock.getText();
            txtResumen.setText(resumen);  
            Limpiar();
        }else{
            JOptionPane.showMessageDialog(null, "INTENTALO NUEVAMENTE", "ERROR", JOptionPane.ERROR_MESSAGE); 
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        // TODO add your handling code here:
        if(txtCodigo.getText().equals("") && txtPrecio.getText().equals("") && txtTipo.getText().equals("")){
            JOptionPane.showMessageDialog(null, "LLENAR TODOS LOS CAMPOS OBLIGATORIOS");
        }else{
        }
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        Limpiar();
        txtResumen.setText("");
        btnGenerarCodigo.setEnabled(true);
        Editable();
        Ocultar();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:        
        FMenu obj=new FMenu();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(c<'0'||c>'9'){
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtMarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarcaKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if((c<'a'||c>'z')&&(c<'A'||c>'Z')){
            evt.consume();
        }
    }//GEN-LAST:event_txtMarcaKeyTyped

    private void btnSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiActionPerformed
        // TODO add your handling code here:
        if(txtCodigo.getText().equals("")){;
            JOptionPane.showMessageDialog(null, "NO HA GENERADO UN CÓDIGO");
        }else{
            Ocultar();
            MostrarSi();
        }
    }//GEN-LAST:event_btnSiActionPerformed

    private void btnNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoActionPerformed
        // TODO add your handling code here:
        if(txtCodigo.getText().equals("")){;
            JOptionPane.showMessageDialog(null, "NO HA GENERADO UN CÓDIGO");
        }else{
            Ocultar();
            MostrarNo();
        }
    }//GEN-LAST:event_btnNoActionPerformed

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
    private javax.swing.JButton btnNo;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnNuevoGT;
    private javax.swing.JButton btnSi;
    private javax.swing.JComboBox<String> cbGrupo;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
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
    private javax.swing.JRadioButton rdTipo;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txt3;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextArea txtResumen;
    private javax.swing.JTextField txtSerie;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
