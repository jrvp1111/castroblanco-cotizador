
package Vistas;

import Controladores.BuscarClienteCONT;
import Modelos.AdminCliente;

public class PrincipalUsuario extends javax.swing.JFrame
{
    private static PrincipalUsuario PU = null ;

    public PrincipalUsuario() {
        initComponents();
        this.setVisible(true);
    }

    public static PrincipalUsuario getInstancia(){
        if(PU == null){
            PU = new PrincipalUsuario();
        }
        return PU;
    }

    public void agregarVentanaCargarViajes (CargarViajes vista){
        this.DesktopPrincipal.add(vista);
        vista.setVisible(true);
    }

    public void agregarVentanaResumenCotizacion (ResumenCotizacion vista){
        this.DesktopPrincipal.add(vista);
        vista.setVisible(true);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DesktopPrincipal = new javax.swing.JDesktopPane();
        menuBarPrincipal = new javax.swing.JMenuBar();
        jMenuCargarChofer = new javax.swing.JMenu();
        jMenuChoferes = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuGenerarCotizacion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU PRINCIPAL");

        jMenuCargarChofer.setText("Camiones");
        menuBarPrincipal.add(jMenuCargarChofer);

        jMenuChoferes.setText("Choferes");
        menuBarPrincipal.add(jMenuChoferes);

        jMenu1.setText("Cotizacion");

        jMenuGenerarCotizacion.setText("Generar Cotizacion");
        jMenuGenerarCotizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuGenerarCotizacionActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuGenerarCotizacion);

        menuBarPrincipal.add(jMenu1);

        setJMenuBar(menuBarPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1134, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 949, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuGenerarCotizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuGenerarCotizacionActionPerformed
       BuscarCliente vista = new BuscarCliente () ;
       AdminCliente modelo = new AdminCliente () ;
       BuscarClienteCONT buscarclieCONT = new BuscarClienteCONT(vista, modelo);
       this.DesktopPrincipal.add(vista);
    }//GEN-LAST:event_jMenuGenerarCotizacionActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DesktopPrincipal;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenuCargarChofer;
    private javax.swing.JMenu jMenuChoferes;
    private javax.swing.JMenuItem jMenuGenerarCotizacion;
    private javax.swing.JMenuBar menuBarPrincipal;
    // End of variables declaration//GEN-END:variables
}
