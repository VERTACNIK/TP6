package ejercicio2;

import java.util.TreeSet;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MenuPrincipal extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MenuPrincipal.class.getName());

    public static TreeSet<Producto> listaProductos = new TreeSet<>();
    
    public MenuPrincipal() {
        initComponents();
        Ventana();
    }

    public void Ventana() {

        ImageIcon imagen = new ImageIcon(getClass().getResource("/assets/fondosuper.jpg"));
        JLabel labelImagen = new JLabel(imagen);
        labelImagen.setBounds(0, 0, 800, 600);
        dtpEscritorio.add(labelImagen);
        add(dtpEscritorio);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dtpEscritorio = new javax.swing.JDesktopPane();
        MenuBarNavigator = new javax.swing.JMenuBar();
        administracionMenu = new javax.swing.JMenu();
        agregarMenuItem = new javax.swing.JMenuItem();
        modificarMenuItem = new javax.swing.JMenuItem();
        eliminarMenuItem = new javax.swing.JMenuItem();
        consultasMenu = new javax.swing.JMenu();
        nombreMenuItem = new javax.swing.JMenuItem();
        precioMenuItem = new javax.swing.JMenuItem();
        rubroMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("De Todo S.A");
        setMaximumSize(new java.awt.Dimension(875, 680));
        setMinimumSize(new java.awt.Dimension(554, 554));
        setResizable(false);

        javax.swing.GroupLayout dtpEscritorioLayout = new javax.swing.GroupLayout(dtpEscritorio);
        dtpEscritorio.setLayout(dtpEscritorioLayout);
        dtpEscritorioLayout.setHorizontalGroup(
            dtpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 863, Short.MAX_VALUE)
        );
        dtpEscritorioLayout.setVerticalGroup(
            dtpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 645, Short.MAX_VALUE)
        );

        administracionMenu.setText("Administración");

        agregarMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/agregar.png"))); // NOI18N
        agregarMenuItem.setText("Agregar productos");
        agregarMenuItem.addActionListener(this::agregarMenuItemActionPerformed);
        administracionMenu.add(agregarMenuItem);

        modificarMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/modi.png"))); // NOI18N
        modificarMenuItem.setText("Modificar produtos");
        modificarMenuItem.addActionListener(this::modificarMenuItemActionPerformed);
        administracionMenu.add(modificarMenuItem);

        eliminarMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/unaX.png"))); // NOI18N
        eliminarMenuItem.setText("Eliminar productos");
        eliminarMenuItem.addActionListener(this::eliminarMenuItemActionPerformed);
        administracionMenu.add(eliminarMenuItem);

        MenuBarNavigator.add(administracionMenu);

        consultasMenu.setText("Consultas");

        nombreMenuItem.setText("Consulta por nombre");
        nombreMenuItem.addActionListener(this::nombreMenuItemActionPerformed);
        consultasMenu.add(nombreMenuItem);

        precioMenuItem.setText("Consulta por precio");
        precioMenuItem.addActionListener(this::precioMenuItemActionPerformed);
        consultasMenu.add(precioMenuItem);

        rubroMenuItem.setText("Consulta por rubro");
        rubroMenuItem.addActionListener(this::rubroMenuItemActionPerformed);
        consultasMenu.add(rubroMenuItem);

        MenuBarNavigator.add(consultasMenu);

        setJMenuBar(MenuBarNavigator);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dtpEscritorio)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dtpEscritorio)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreMenuItemActionPerformed
        dtpEscritorio.removeAll();
        dtpEscritorio.repaint();
        ConsultaNombre ve  = new ConsultaNombre();
        ve.setVisible(true);
        dtpEscritorio.add(ve);
        dtpEscritorio.moveToFront(ve);
    }//GEN-LAST:event_nombreMenuItemActionPerformed

    private void agregarMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarMenuItemActionPerformed
        dtpEscritorio.removeAll();
        dtpEscritorio.repaint();
        Agregar va  = new Agregar(listaProductos);
        va.setVisible(true);
        dtpEscritorio.add(va);
        dtpEscritorio.moveToFront(va);
    }//GEN-LAST:event_agregarMenuItemActionPerformed

    private void eliminarMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarMenuItemActionPerformed
        dtpEscritorio.removeAll();
        dtpEscritorio.repaint();
        Eliminar vistaEliminar = new Eliminar();
        vistaEliminar.setVisible(true);
        dtpEscritorio.add(vistaEliminar);
        dtpEscritorio.moveToFront(vistaEliminar);
    }//GEN-LAST:event_eliminarMenuItemActionPerformed

    private void rubroMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rubroMenuItemActionPerformed
        dtpEscritorio.removeAll();
        dtpEscritorio.repaint();
        ConsultaRubro ve = new ConsultaRubro();
        ve.setVisible(true);
        dtpEscritorio.add(ve);
        dtpEscritorio.moveToFront(ve);
    }//GEN-LAST:event_rubroMenuItemActionPerformed

    private void precioMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioMenuItemActionPerformed
        dtpEscritorio.removeAll();
        dtpEscritorio.repaint();
        ConsultaPrecio ve = new ConsultaPrecio();
        ve.setVisible(true);
        dtpEscritorio.add(ve);
        dtpEscritorio.moveToFront(ve);
    }//GEN-LAST:event_precioMenuItemActionPerformed

    private void modificarMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarMenuItemActionPerformed
        dtpEscritorio.removeAll();
        dtpEscritorio.repaint();
        Modificar modificar = new Modificar();
        modificar.setVisible(true);
        dtpEscritorio.add(modificar);
        dtpEscritorio.moveToFront(modificar);
    }//GEN-LAST:event_modificarMenuItemActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new MenuPrincipal().setVisible(true));
        
        listaProductos.add(new Producto(50, 1200.50, 1, "Leche descremada 1L", "Comestible"));
        listaProductos.add(new Producto(30, 850.00, 2, "Pan lactal blanco", "Comestible"));
        listaProductos.add(new Producto(100, 450.75, 3, "Galletitas de agua", "Comestible"));
        listaProductos.add(new Producto(20, 2500.00, 4, "Yerba mate 1kg", "Comestible"));
        listaProductos.add(new Producto(40, 1800.25, 5, "Fideos tallarín 500g", "Comestible"));
        
        listaProductos.add(new Producto(15, 3200.00, 6, "Shampoo fortificante 400ml", "Perfumeria"));
        listaProductos.add(new Producto(25, 2100.50, 7, "Jabón de tocador pack x3", "Perfumeria"));
        listaProductos.add(new Producto(10, 4500.00, 8, "Crema corporal hidratante", "Perfumeria"));
        listaProductos.add(new Producto(20, 1950.00, 9, "Desodorante aerosol 150ml", "Perfumeria"));
        listaProductos.add(new Producto(12, 5400.00, 10, "Pasta dental blanqueadora", "Perfumeria"));
        
        listaProductos.add(new Producto(18, 2800.00, 11, "Lavandina concentrada 1L", "Limpieza"));
        listaProductos.add(new Producto(22, 3100.25, 12, "Detergente líquido 500ml", "Limpieza"));
        listaProductos.add(new Producto(15, 4200.50, 13, "Desinfectante de pisos 900ml", "Limpieza"));
        listaProductos.add(new Producto(35, 1500.00, 14, "Esponjas multiuso x3", "Limpieza"));
        listaProductos.add(new Producto(10, 6500.00, 15, "Jabón líquido para ropa 3L", "Limpieza"));
 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuBarNavigator;
    private javax.swing.JMenu administracionMenu;
    private javax.swing.JMenuItem agregarMenuItem;
    private javax.swing.JMenu consultasMenu;
    private javax.swing.JDesktopPane dtpEscritorio;
    private javax.swing.JMenuItem eliminarMenuItem;
    private javax.swing.JMenuItem modificarMenuItem;
    private javax.swing.JMenuItem nombreMenuItem;
    private javax.swing.JMenuItem precioMenuItem;
    private javax.swing.JMenuItem rubroMenuItem;
    // End of variables declaration//GEN-END:variables
}
