
package Vistas;

import Controladores.ActualizarCostosCONT;
import Controladores.BuscarCamionCONT;
import Controladores.BuscarClienteCONT;
import Controladores.ListarCotizacionesCONT;
import Modelos.AdminCamion;
import Modelos.AdminCliente;
import Modelos.AdminCostos;
import Modelos.Sistema;

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

    public void agregarVentanaDetalleCamion (DetalleCamion vista){
        this.DesktopPrincipal.add(vista);
        vista.setVisible(true);
    }

    public void agregarVentanaActualizarCostos (ActualizarCostos vista){
        this.DesktopPrincipal.add(vista);
        vista.setVisible(true);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        DesktopPrincipal = new javax.swing.JDesktopPane();
        menuBarPrincipal = new javax.swing.JMenuBar();
        jMenuCostos = new javax.swing.JMenu();
        jMenuActualizarCostos = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuGenerarCotizacion = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU PRINCIPAL");

        jScrollPane1.setViewportView(DesktopPrincipal);

        jMenuCostos.setText("Costos");

        jMenuActualizarCostos.setText("Actualizar Costos");
        jMenuActualizarCostos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuActualizarCostosActionPerformed(evt);
            }
        });
        jMenuCostos.add(jMenuActualizarCostos);

        menuBarPrincipal.add(jMenuCostos);

        jMenu1.setText("Cotizacion");

        jMenuGenerarCotizacion.setText("Generar Cotizacion");
        jMenuGenerarCotizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuGenerarCotizacionActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuGenerarCotizacion);

        jMenuItem1.setText("Listar Cotizaciones");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        menuBarPrincipal.add(jMenu1);

        setJMenuBar(menuBarPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1134, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 949, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuGenerarCotizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuGenerarCotizacionActionPerformed
       BuscarCliente vista = new BuscarCliente () ;
       //AdminCliente modelo = new AdminCliente () ;
       Sistema modelo = Sistema.getInstancia() ;
       new BuscarClienteCONT(vista, modelo);
       this.DesktopPrincipal.add(vista);
    }//GEN-LAST:event_jMenuGenerarCotizacionActionPerformed

    
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       ListarCotizacionesCONT controlador = new ListarCotizacionesCONT();
       this.DesktopPrincipal.add(controlador.getVista());
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    
    // abro la primer ventana para seleccionar el camion
    private void jMenuActualizarCostosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuActualizarCostosActionPerformed
       BuscarCamion vista = new BuscarCamion () ;
       //AdminCamion modelo = new AdminCamion () ;
       Sistema modelo = Sistema.getInstancia() ;
       new BuscarCamionCONT (vista, modelo);
       vista.inicializarVentana();
       this.DesktopPrincipal.add(vista);
    }//GEN-LAST:event_jMenuActualizarCostosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DesktopPrincipal;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuActualizarCostos;
    private javax.swing.JMenu jMenuCostos;
    private javax.swing.JMenuItem jMenuGenerarCotizacion;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuBar menuBarPrincipal;
    // End of variables declaration//GEN-END:variables
}
