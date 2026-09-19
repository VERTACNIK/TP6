package ejercicio2;

import static ejercicio2.MenuPrincipal.listaProductos;
import javax.swing.table.DefaultTableModel;

public class Eliminar extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    public Eliminar() {
        initComponents();
        armarCabecera();
        recorrerTabla();
    }

    private void armarCabecera() {
        modelo.addColumn("Codigo ID");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Precio");
        modelo.addColumn("Stock");
        modelo.addColumn("Rubro");
        tblProductos.setModel(modelo);

    }

    private void cargarDatos(Producto producto) {
        modelo.addRow(new Object[]{producto.getId_prod(), producto.getDescripcion(), producto.getPrecio(), producto.getStock(), producto.getRubro()});
    }

    private void recorrerTabla() {
        for (Producto producto : listaProductos) {
            modelo.addRow(new Object[]{producto.getId_prod(), producto.getDescripcion(), producto.getPrecio(), producto.getStock(), producto.getRubro()});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBoton = new javax.swing.JPanel();
        btnBorrar = new javax.swing.JButton();
        pnlTabla = new javax.swing.JPanel();
        scpProductos = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        lblTitulo = new javax.swing.JLabel();

        setClosable(true);
        setTitle("De Todo S.A.: Eliminar Productos");
        setPreferredSize(new java.awt.Dimension(539, 590));

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(this::btnBorrarActionPerformed);

        javax.swing.GroupLayout pnlBotonLayout = new javax.swing.GroupLayout(pnlBoton);
        pnlBoton.setLayout(pnlBotonLayout);
        pnlBotonLayout.setHorizontalGroup(
            pnlBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonLayout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBotonLayout.setVerticalGroup(
            pnlBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo ID", "Descripcion", "Precio", "Stock", "Rubro"
            }
        ));
        scpProductos.setViewportView(tblProductos);

        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Productos en el sistema");

        javax.swing.GroupLayout pnlTablaLayout = new javax.swing.GroupLayout(pnlTabla);
        pnlTabla.setLayout(pnlTablaLayout);
        pnlTablaLayout.setHorizontalGroup(
            pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scpProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
            .addGroup(pnlTablaLayout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTablaLayout.setVerticalGroup(
            pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTablaLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(scpProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        int seleccion = tblProductos.getSelectedRow();
        if (seleccion != -1) {
            int filaModelo = tblProductos.convertRowIndexToModel(seleccion);
            int idABorrar = (int) tblProductos.getModel().getValueAt(filaModelo, 0); // Columna del ID

            // El TreeSet usará compareTo() y al ver que los IDs coinciden (da 0), lo borrará
            listaProductos.remove(new Producto(idABorrar));

            // Borrar de la vista
            ((DefaultTableModel) tblProductos.getModel()).removeRow(filaModelo);
        }
    }//GEN-LAST:event_btnBorrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlBoton;
    private javax.swing.JPanel pnlTabla;
    private javax.swing.JScrollPane scpProductos;
    private javax.swing.JTable tblProductos;
    // End of variables declaration//GEN-END:variables
}
