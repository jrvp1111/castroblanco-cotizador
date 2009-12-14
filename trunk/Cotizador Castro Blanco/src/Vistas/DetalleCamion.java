
package Vistas;

import Entidades.Camion;

public class DetalleCamion extends javax.swing.JInternalFrame
{

    public DetalleCamion() {
        initComponents();
    }

    public void completarInformacionCamion (Camion cam){
        this.txtDetalle.setText("PATENTE: " + cam.getPatente() + "\n"
                              + "MARCA: " + cam.getMarca() + "\n"
                              + "MODELO: " + cam.getModelo() + "\n"
                              + "CANT. PALLETS: " + cam.getCantPallets() + "\n"
                              + "CONSUMO COMBUSTIBLE: " + cam.getCantCombustible()) ;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtDetalle = new javax.swing.JTextArea();
        btnCerrar = new javax.swing.JButton();

        setTitle("DETALLE DEL CAMION");

        txtDetalle.setColumns(20);
        txtDetalle.setEditable(false);
        txtDetalle.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        txtDetalle.setRows(5);
        jScrollPane1.setViewportView(txtDetalle);

        btnCerrar.setText("CERRAR");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btnCerrar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        dispose () ;
    }//GEN-LAST:event_btnCerrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtDetalle;
    // End of variables declaration//GEN-END:variables
}
