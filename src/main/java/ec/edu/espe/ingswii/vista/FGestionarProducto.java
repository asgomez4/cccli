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
        noEditable();
    }
    public void limpiarDatos() {
        txtCodigo.setText("");
        txtModelo.setText("");
    }
    public void noEditable(){
        txtCodigo.setEditable(false);
        txtSerie.setEditable(false);txtModelo.setEditable(false);txtMarca.setEditable(false);
        txtPrecio.setEditable(false);txtTipo.setEditable(false);txtDescripcion.setEditable(false);
        txtStock.setEditable(false);
    }
    public void Limpiar(){
        txtCodigo.setText("");
        txtSerie.setText("");txtModelo.setText("");txtMarca.setText("");
        txtPrecio.setText("");txtTipo.setText("");txtDescripcion.setText("");
        txtStock.setText("");
    }
    protected final void listadoProductoTotal() {
        String vacio = "";
        DefaultTableModel model = new DefaultTableModel();
        try {
            String codigo = txtCodigo.getText();
            String serie = txtSerie.getText();
            String modelo = txtModelo.getText();
            String marca = txtMarca.getText();
            String precio = txtPrecio.getText();
            String tipo = txtTipo.getText();
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
            tblProducto.setModel(proDAO.verProductosTotal((model)));
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
            String serie = txtSerie.getText();
            String modelo = txtModelo.getText();
            String marca = txtMarca.getText();
            String precio = txtPrecio.getText();
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
        btnOK = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        pnlOpciones = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnCargar = new javax.swing.JButton();

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
        lblStock.setBounds(20, 260, 50, 15);

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
        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyReleased(evt);
            }
        });
        pnlAcciones.add(txtDescripcion);
        txtDescripcion.setBounds(90, 210, 160, 40);

        txtCodigo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pnlAcciones.add(txtCodigo);
        txtCodigo.setBounds(90, 30, 160, 21);

        txtSerie.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtSerie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSerieKeyReleased(evt);
            }
        });
        pnlAcciones.add(txtSerie);
        txtSerie.setBounds(90, 60, 160, 21);

        txtModelo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtModeloKeyReleased(evt);
            }
        });
        pnlAcciones.add(txtModelo);
        txtModelo.setBounds(90, 90, 160, 21);

        txtMarca.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMarcaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMarcaKeyTyped(evt);
            }
        });
        pnlAcciones.add(txtMarca);
        txtMarca.setBounds(90, 120, 160, 21);

        txtPrecio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });
        pnlAcciones.add(txtPrecio);
        txtPrecio.setBounds(90, 150, 160, 21);

        txtStock.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pnlAcciones.add(txtStock);
        txtStock.setBounds(90, 260, 90, 21);

        txtTipo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pnlAcciones.add(txtTipo);
        txtTipo.setBounds(90, 180, 160, 21);

        btnOK.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnOK.setText("OK");
        btnOK.setEnabled(false);
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });
        pnlAcciones.add(btnOK);
        btnOK.setBounds(100, 330, 80, 23);

        btnModificar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        pnlAcciones.add(btnModificar);
        btnModificar.setBounds(40, 290, 90, 23);

        btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        pnlAcciones.add(btnEliminar);
        btnEliminar.setBounds(150, 290, 90, 23);

        btnMenu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnMenu.setText("Menú P.");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        pnlAcciones.add(btnMenu);
        btnMenu.setBounds(150, 370, 90, 23);

        btnVolver.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        pnlAcciones.add(btnVolver);
        btnVolver.setBounds(40, 370, 90, 23);

        getContentPane().add(pnlAcciones);
        pnlAcciones.setBounds(600, 10, 260, 400);

        pnlOpciones.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        pnlOpciones.setLayout(null);

        btnNuevo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        pnlOpciones.add(btnNuevo);
        btnNuevo.setBounds(40, 100, 100, 23);

        btnCargar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCargar.setText("Cargar Fila Selecionada");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });
        pnlOpciones.add(btnCargar);
        btnCargar.setBounds(15, 50, 160, 23);

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

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        if(txtCodigo.getText().equals("")){
            JOptionPane.showMessageDialog(null, "NO HA CARGADO LOS DATOS DE UN PRODUCTO");
        }else{
            txtSerie.setEditable(true);txtModelo.setEditable(true);txtMarca.setEditable(true);
            txtPrecio.setEditable(true);txtDescripcion.setEditable(true);
            btnOK.setEnabled(true);
            btnModificar.setEnabled(false);
            
            if(txtSerie.getText().equals("-")){
                txtStock.setEditable(true);               
            }            
        }        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        // TODO add your handling code here:
        noEditable();
        btnModificar.setEnabled(true);
        btnOK.setEnabled(false);
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
            JOptionPane.showMessageDialog(null, "INTENTALO NUEVAMENTE", "ERROR", JOptionPane.ERROR_MESSAGE); 
        }   
    }//GEN-LAST:event_btnCargarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:        
        cbTipo.setSelectedIndex(0);
        cbGrupo.setSelectedIndex(0);
        CGrupoProductoDAO cc = new CGrupoProductoDAO();
        for (int i = 0; i < cc.mostrarGrupo().size(); i++) {
            cbGrupo.addItem(cc.mostrarGrupo().get(i).getGrupo().toString());
        }
        Limpiar();
        listadoProductoTotal();
        noEditable();
        btnModificar.setEnabled(true);
        btnOK.setEnabled(false);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        if(txtCodigo.getText().equals("")){
            JOptionPane.showMessageDialog(null, "NO HA CARGADO LOS DATOS DE UN PRODUCTO");
        }else{
            noEditable();
            int confirmar = JOptionPane.showConfirmDialog(null, "ESTÁ SEGURO QUE DESEA ELIMINAR EL PRODUCTO?");
            if (JOptionPane.OK_OPTION == confirmar) {
                int exito =  proDAO.eliminarProducto(txtCodigo.getText());
                Limpiar();
                listadoProductoTotal();                
                if(exito>0){
                    JOptionPane.showMessageDialog(null, "PRODUCTO ELIMINADO ","ÉXITO", JOptionPane.INFORMATION_MESSAGE);         
                    
                }
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        // TODO add your handling code here:        
        int aux = proDAO.actualizarProducto(txtCodigo.getText(), txtSerie.getText(), txtModelo.getText(), txtMarca.getText(), txtPrecio.getText(), txtDescripcion.getText(),txtStock.getText());
        Limpiar();
        if (aux > 0){
            JOptionPane.showMessageDialog(null, "PRODUCTO MODIFICADO");          
        } 
        listadoProductoTotal();
    }//GEN-LAST:event_btnOKActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
        FMenu obj = new FMenu();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

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

    private void txtDescripcionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyReleased
        // TODO add your handling code here:
        txtDescripcion.setText(txtDescripcion.getText().toUpperCase());
    }//GEN-LAST:event_txtDescripcionKeyReleased

    private void txtMarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarcaKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if((c<'a'||c>'z')&&(c<'A'||c>'Z')){
            evt.consume();
        }
    }//GEN-LAST:event_txtMarcaKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(c<'0'||c>'9'){
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        FProductos obj = new FProductos();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

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
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnOK;
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
