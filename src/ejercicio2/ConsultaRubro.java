
package ejercicio2;

import static ejercicio2.MenuPrincipal.listaProductos;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;

public class ConsultaRubro extends javax.swing.JInternalFrame {

    DefaultTableModel table = new DefaultTableModel();

    public ConsultaRubro() {
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
            if (producto.getRubro().equalsIgnoreCase(cbmRubro.getSelectedItem().toString())) {
            table.addRow(new Object[]{producto.getId_prod(), producto.getDescripcion(), producto.getPrecio(), producto.getStock(), producto.getRubro()});
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scpProductos = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        lblRubro = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblLupa = new javax.swing.JLabel();
        cbmRubro = new javax.swing.JComboBox<>();

        setClosable(true);
        setTitle("De Todo S.A.: Consultas por Rubro");
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

        lblRubro.setText("Rubro:");

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitulo.setText("Listado por Rubro");

        lblLupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8-magnifying-glass-tilted-right-48.png"))); // NOI18N

        cbmRubro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comestible", "Limpieza", "Perfumeria" }));
        cbmRubro.addActionListener(this::cbmRubroActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(lblTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLupa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(scpProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(lblRubro)
                        .addGap(45, 45, 45)
                        .addComponent(cbmRubro, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLupa, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbmRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRubro))
                .addGap(18, 18, 18)
                .addComponent(scpProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void cbmRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmRubroActionPerformed
        table.setNumRows(0);
        for (Producto producto : listaProductos) {
            if (producto.getRubro().equalsIgnoreCase(cbmRubro.getSelectedItem().toString())) {
            table.addRow(new Object[]{producto.getId_prod(), producto.getDescripcion(), producto.getPrecio(), producto.getStock(), producto.getRubro()});
            }
        }
    }//GEN-LAST:event_cbmRubroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbmRubro;
    private javax.swing.JLabel lblLupa;
    private javax.swing.JLabel lblRubro;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JScrollPane scpProductos;
    private javax.swing.JTable tblProductos;
    // End of variables declaration//GEN-END:variables
}
