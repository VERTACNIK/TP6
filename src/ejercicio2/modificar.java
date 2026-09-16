package ejercicio2;

import static ejercicio2.windo.listaProductos;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Modificar extends javax.swing.JInternalFrame {
    
    DefaultTableModel modelo = new DefaultTableModel();
    
    
    public Modificar() {
        initComponents();
        armarTabla();
        rellenarTabla();
    }
    
    private void armarTabla() {
        String[] tituloTabla = {"Código", "Descripción", "Precio", "Stock"};
        
        modelo = new DefaultTableModel(null, tituloTabla) {
            @Override
            public boolean isCellEditable(int x, int y) {
                return false;
            }
        };
        
        tblProductos.setModel(modelo);
        
        tblProductos.getSelectionModel().addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            @Override
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                if (!evt.getValueIsAdjusting()) {
                    int seleccion = tblProductos.getSelectedRow();
                    if (seleccion != -1) {
                        txtCodigo.setText(String.valueOf(tblProductos.getValueAt(seleccion, 0)));
                        txtDescripcion.setText(String.valueOf(tblProductos.getValueAt(seleccion, 1)));
                        txtPrecio.setText(String.valueOf(tblProductos.getValueAt(seleccion, 2)));
                        jsStock.setValue(Integer.parseInt(String.valueOf(tblProductos.getValueAt(seleccion, 3))));
                        cmbRubro.setSelectedItem((Object) cmbFiltro.getSelectedItem());
                    }
                }
            }
        });
    }
    
    private void rellenarTabla() {
         modelo.setRowCount(0);
        
        String filtro = (String) cmbFiltro.getSelectedItem();
        
        for (Producto aux : windo.listaProductos) {
            
            if (aux.getRubro().equalsIgnoreCase(filtro)) {
                modelo.addRow(new Object[]{aux.getId_prod(), aux.getDescripcion(), aux.getPrecio(), aux.getStock()});
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlDatos = new javax.swing.JPanel();
        lblDescripcion = new javax.swing.JLabel();
        lblStock = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        lblPrecio = new javax.swing.JLabel();
        jsStock = new javax.swing.JSpinner();
        txtCodigo = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        lblRubro = new javax.swing.JLabel();
        cmbRubro = new javax.swing.JComboBox<>();
        btnCerrar = new javax.swing.JButton();
        lblFiltro = new javax.swing.JLabel();
        cmbFiltro = new javax.swing.JComboBox<>();
        pnlProductos = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();

        setClosable(true);
        setTitle("De Todo S.A: Modificar Produtos");

        pnlDatos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        lblDescripcion.setText("Descripcion");

        lblStock.setText("Stock");

        lblCodigo.setText("Codigo id");

        lblPrecio.setText("Precio");

        jsStock.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });

        btnModificar.setText("Modificar producto");
        btnModificar.addActionListener(this::btnModificarActionPerformed);

        btnLimpiar.setText("Limpiar");
        btnLimpiar.setToolTipText("Limpia los campos");
        btnLimpiar.addActionListener(this::btnLimpiarActionPerformed);

        lblRubro.setText("Rubro:");

        cmbRubro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comestible", "Limpieza", "Perfumeria" }));
        cmbRubro.setToolTipText("");

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(this::btnCerrarActionPerformed);

        javax.swing.GroupLayout pnlDatosLayout = new javax.swing.GroupLayout(pnlDatos);
        pnlDatos.setLayout(pnlDatosLayout);
        pnlDatosLayout.setHorizontalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(pnlDatosLayout.createSequentialGroup()
                                    .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblCodigo)
                                        .addComponent(lblDescripcion)
                                        .addComponent(lblPrecio))
                                    .addGap(46, 46, 46))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlDatosLayout.createSequentialGroup()
                                    .addComponent(lblStock)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(pnlDatosLayout.createSequentialGroup()
                                .addComponent(lblRubro)
                                .addGap(22, 22, 22)))
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbRubro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDescripcion)
                            .addComponent(txtPrecio)
                            .addComponent(jsStock)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        pnlDatosLayout.setVerticalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescripcion)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecio)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStock)
                    .addComponent(jsStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRubro)
                    .addComponent(cmbRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        lblFiltro.setText("Filtrar por rubro:");

        cmbFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comestible", "Limpieza", "Perfumeria" }));
        cmbFiltro.setToolTipText("");
        cmbFiltro.addActionListener(this::cmbFiltroActionPerformed);

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        pnlProductos.setViewportView(tblProductos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblFiltro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pnlProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(41, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFiltro)
                    .addComponent(cmbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtCodigo.setText("");
        txtDescripcion.setText("");
        txtPrecio.setText("");
        jsStock.setValue(0);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void cmbFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFiltroActionPerformed
       if (cmbFiltro.getSelectedItem() != null) {
            rellenarTabla();
        }
    }//GEN-LAST:event_cmbFiltroActionPerformed

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        char c = evt.getKeyChar();
        
        if (!Character.isDigit(c) && c != java.awt.event.KeyEvent.VK_BACK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCodigoKeyTyped

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (tblProductos.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona un producto de la lista primero.");
            return;
        }
        
        if (txtCodigo.getText().isEmpty() || txtDescripcion.getText().isEmpty() || txtPrecio.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Rellena todos los campos primero.");
            return;
        }
        
        int codigo;
        int precio;
        
        try {
            
            codigo = Integer.parseInt(txtCodigo.getText());
            precio = Integer.parseInt(txtPrecio.getText());
            
        } catch (NumberFormatException numberFormat) {
            JOptionPane.showMessageDialog(this, "Código id y precio deben ser números enteros menor a ocho dígitos.", "Error de datos", JOptionPane.ERROR_MESSAGE);
            return;
        }
        /*
        try {
            
            precio = Double.parseDouble(txtPrecio.getText());
            
        } catch (NumberFormatException numberFormat) {
            JOptionPane.showMessageDialog(this, "Precio debe ser un número entero o decimal.", "Error de datos", JOptionPane.ERROR_MESSAGE);
            return;
        }
        */
        int stockExis = Integer.parseInt(String.valueOf(tblProductos.getValueAt(tblProductos.getSelectedRow(), 3)));
        int precioExis = Integer.parseInt(String.valueOf(tblProductos.getValueAt(tblProductos.getSelectedRow(), 2)));
        int codigoExis = Integer.parseInt(String.valueOf(tblProductos.getValueAt(tblProductos.getSelectedRow(), 0)));
        String descripcionExis = (String) tblProductos.getValueAt(tblProductos.getSelectedRow(), 1);
        String rubroExis = String.valueOf(cmbFiltro.getSelectedItem());
        
        Producto existente = new Producto(stockExis, precioExis, codigoExis, descripcionExis, rubroExis);
        Producto nuevo = new Producto((Integer)jsStock.getValue(), precio, codigo, txtDescripcion.getText(), (String) cmbRubro.getSelectedItem());
        
        int opcion = JOptionPane.showConfirmDialog(this, "¿Desea modificar el producto?", "Confirmación de reemplazo.", JOptionPane.YES_NO_OPTION);
        
        if (opcion == JOptionPane.YES_OPTION) {
            listaProductos.remove(existente);
            listaProductos.add(nuevo);
            JOptionPane.showMessageDialog(this, "Se reemplazó el producto con éxito.");
            rellenarTabla();
        }
    }//GEN-LAST:event_btnModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cmbFiltro;
    private javax.swing.JComboBox<String> cmbRubro;
    private javax.swing.JSpinner jsStock;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblFiltro;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblRubro;
    private javax.swing.JLabel lblStock;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JScrollPane pnlProductos;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
