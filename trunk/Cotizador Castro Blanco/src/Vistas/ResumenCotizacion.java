
package Vistas;

import Controladores.ResumenCotizacionCONT;
import Entidades.Viaje;
import Modelos.AdminCotizacion;
import java.util.Vector;
import javax.swing.JOptionPane;

public class ResumenCotizacion extends javax.swing.JInternalFrame
{
    private ResumenCotizacionCONT controlador;
    private AdminCotizacion modelo;

    public ResumenCotizacion() {
        initComponents();
    }

    public void setControlador(ResumenCotizacionCONT c) {
      this.controlador = c;
    }

    public void setModelo(AdminCotizacion m) {
      this.modelo = m;
    }

    public void cerrar() {
      dispose();
    }

    public void mostrarViajesCotizados (Vector<Viaje> viajes){
        String X = "" ;
        for (int i = 0 ; i < viajes.size() ; i ++){
            Viaje aux = viajes.get(i) ;
            X = X + aux.toString() + "\n\n" ;
        }
        this.txtViajesCotizados.setText(X);
    }

    public void mostrarCostosCalculados (float margenGan , float costoFijo , float costoVariable , float costoFinanciero , float costoViaje){
        float costoOperativo = costoFijo + costoVariable + costoFinanciero + costoViaje ;
        float precioVenta = costoOperativo * (1 + margenGan) ;
        // el controlador de la ventana tienen referencia de la cotizacion activa
        this.controlador.getCotizacion().setCostoOperativo(costoOperativo);
        this.controlador.getCotizacion().setPrecioVenta(precioVenta);
        this.txtResumen.setText("Total de costos fijos: " + Float.toString(costoFijo) + "\n"
                              + "Total de costos variables: " + Float.toString(costoVariable) + "\n"
                              + "Total de costos financieros: " + Float.toString(costoFinanciero) + "\n"
                              + "Total de costos viajes: " + Float.toString(costoViaje) + "\n\n"
                              + "TOTAL COSTO OPERATIVO: " + costoOperativo + "\n\n"
                              + "PRECIO DE VENTA: " + precioVenta) ;
    }

    public void mostrarMensaje(String msg) {
      JOptionPane.showMessageDialog(rootPane, msg);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtResumen = new javax.swing.JTextArea();
        btnFinalizar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtViajesCotizados = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("RESUMEN DE LA COTIZACION");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtResumen.setColumns(20);
        txtResumen.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtResumen.setRows(5);
        jScrollPane1.setViewportView(txtResumen);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 320, 380));

        btnFinalizar.setText("FINALIZAR");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 443, -1, 30));

        btnAtras.setText("ATRAS");
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 443, -1, 30));

        txtViajesCotizados.setColumns(20);
        txtViajesCotizados.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        txtViajesCotizados.setRows(5);
        jScrollPane2.setViewportView(txtViajesCotizados);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 460, 380));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Datos de la cotizacion final:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Datos de los viajes a cotizar:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // guardo la cotizacion en la base de datos
    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        this.modelo.guardarCotizacion(this.controlador.getCotizacion());
        this.mostrarMensaje("La cotizacion se ha guardado exitosamente !");
        dispose () ;
    }//GEN-LAST:event_btnFinalizarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtResumen;
    private javax.swing.JTextArea txtViajesCotizados;
    // End of variables declaration//GEN-END:variables
}
