
package ejercicio2;

import static ejercicio2.MenuPrincipal.listaProductos;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;

public class ConsultaPrecio extends javax.swing.JInternalFrame {

    DefaultTableModel table = new DefaultTableModel();

    public ConsultaPrecio() {
        initComponents();
        table.addColumn("ID");
        table.addColumn("Descripcion");
        table.addColumn("Precio");
        table.addColumn("Stock");
        table.addColumn("Rubro");
        tblProductos.setModel(table);
        
        Iterator<Producto> it = listaProductos.iterator();
        
        recorrerTabla();
    }

    private void recorrerTabla(){
        for (Producto producto : listaProductos) {
            table.addRow(new Object[]{producto.getId_prod(), producto.getDescripcion(), producto.getPrecio(), producto.getStock(), producto.getRubro()});
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scpProductos = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        lblEntre = new javax.swing.JLabel();
        txtMin = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        lblLupa = new javax.swing.JLabel();
        lblY = new javax.swing.JLabel();
        txtMax = new javax.swing.JTextField();

        setClosable(true);
        setTitle("De Todo S.A.: Consultas por Precio");
        setMinimumSize(new java.awt.Dimension(465, 430));
        setPreferredSize(new java.awt.Dimension(465, 430));

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
        scpProductos.setViewportView(tblProductos);

        lblEntre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEntre.setText("Entre $");

        txtMin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMinKeyReleased(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitulo.setText("Listado por Precio");

        lblLupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8-magnifying-glass-tilted-right-48.png"))); // NOI18N

        lblY.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblY.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblY.setText("y");

        txtMax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMaxKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTitulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblLupa))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEntre, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMin, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblY, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMax, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(scpProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLupa, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEntre)
                    .addComponent(txtMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblY)
                    .addComponent(txtMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(scpProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void txtMinKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMinKeyReleased
        String input = txtMin.getText();
        input = input.replaceAll("[^0-9.]", "");
        txtMin.setText(input);
        filtrarPrecio();
    }//GEN-LAST:event_txtMinKeyReleased

    private void txtMaxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaxKeyReleased
        String input = txtMax.getText();
        input = input.replaceAll("[^0-9.]", "");
        txtMax.setText(input);
        filtrarPrecio();
    }//GEN-LAST:event_txtMaxKeyReleased

    private void filtrarPrecio(){
        table.setNumRows(0);
        for (Producto producto : listaProductos) {
            double min = 0;
            double max = Double.MAX_VALUE; 
            if (txtMin.getText().length()>0) {try {min = Double.parseDouble(txtMin.getText());}catch(Exception e){}}
            if (txtMax.getText().length()>0) {try {max = Double.parseDouble(txtMax.getText());}catch(Exception e){}}
            if (producto.getPrecio() >= min && producto.getPrecio() <= max) {
            table.addRow(new Object[]{producto.getId_prod(), producto.getDescripcion(), producto.getPrecio(), producto.getStock(), producto.getRubro()});
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblEntre;
    private javax.swing.JLabel lblLupa;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblY;
    private javax.swing.JScrollPane scpProductos;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtMax;
    private javax.swing.JTextField txtMin;
    // End of variables declaration//GEN-END:variables
}
