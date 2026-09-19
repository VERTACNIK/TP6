
package ejercicio2;

import static ejercicio2.MenuPrincipal.listaProductos;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;

public class ConsultaNombre extends javax.swing.JInternalFrame {

    DefaultTableModel table = new DefaultTableModel();

    public ConsultaNombre() {
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
        lblDescripcion = new javax.swing.JLabel();
        txtFiltrar = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        lblLupa = new javax.swing.JLabel();

        setClosable(true);
        setTitle("De Todo S.A.: Consultas por Nombre");
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

        lblDescripcion.setText("Ingrese Descripción:");

        txtFiltrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFiltrarKeyReleased(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitulo.setText("Listado por Nombre");

        lblLupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8-magnifying-glass-tilted-right-48.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDescripcion)
                            .addComponent(txtFiltrar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLupa))
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
                .addComponent(lblDescripcion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scpProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void txtFiltrarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltrarKeyReleased
        table.setNumRows(0);
        for (Producto producto : listaProductos) {
            if (producto.getDescripcion().toLowerCase().contains(txtFiltrar.getText().toLowerCase())) {
            table.addRow(new Object[]{producto.getId_prod(), producto.getDescripcion(), producto.getPrecio(), producto.getStock(), producto.getRubro()});
            }
        }
    }//GEN-LAST:event_txtFiltrarKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblLupa;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JScrollPane scpProductos;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtFiltrar;
    // End of variables declaration//GEN-END:variables
}
