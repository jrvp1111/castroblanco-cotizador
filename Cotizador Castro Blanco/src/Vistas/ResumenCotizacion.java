
package Vistas;

import Controladores.ResumenCotizacionCONT;
import Modelos.AdminCotizacion;
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

    public void mostrarCostosCalculados (float costoFijo , float costoVariable , float costoFinanciero , float costoViaje){
        this.txtResumen.setText("Total de costos fijos: " + Float.toString(costoFijo) + "\n"
                              + "Total de costos variables: " + Float.toString(costoVariable) + "\n"
                              + "Total de costos financieros: " + Float.toString(costoFinanciero) + "\n"
                              + "Total de costos viajes: " + Float.toString(costoViaje)) ;
    }
    
    public void mostrarMensaje(String msg) {
      JOptionPane.showMessageDialog(rootPane, msg);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtResumen = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("RESUMEN DE LA COTIZACION");

        txtResumen.setColumns(20);
        txtResumen.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtResumen.setRows(5);
        jScrollPane1.setViewportView(txtResumen);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(278, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtResumen;
    // End of variables declaration//GEN-END:variables
}
