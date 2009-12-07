
package Vistas;

public class PrincipalUsuario extends javax.swing.JFrame {

    /** Creates new form PrincipalUsuario */
    public PrincipalUsuario() {
        initComponents();
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBarPrincipal = new javax.swing.JMenuBar();
        jMenuCargarChofer = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuChoferes = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU PRINCIPAL");

        jMenuCargarChofer.setText("Camiones");

        jMenuItem1.setText("Cargar Chofer Nuevo");
        jMenuCargarChofer.add(jMenuItem1);

        menuBarPrincipal.add(jMenuCargarChofer);

        jMenuChoferes.setText("Choferes");
        menuBarPrincipal.add(jMenuChoferes);

        setJMenuBar(menuBarPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1015, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 525, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenuCargarChofer;
    private javax.swing.JMenu jMenuChoferes;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuBar menuBarPrincipal;
    // End of variables declaration//GEN-END:variables

}
