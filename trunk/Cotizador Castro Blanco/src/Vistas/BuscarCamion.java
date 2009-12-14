
package Vistas;

import Controladores.BuscarCamionCONT;
import Entidades.Camion;
import Modelos.AdminCamion;
import java.util.List;
import javax.swing.JOptionPane;

public class BuscarCamion extends javax.swing.JInternalFrame
{
    private BuscarCamionCONT controlador;
    private AdminCamion modelo;

    public BuscarCamion() {
        initComponents();
        this.setVisible(true);
    }
    
    public void mostrarMensaje(String msg) {
      JOptionPane.showMessageDialog(rootPane, msg);
    }

    public void setControlador(BuscarCamionCONT c) {
      this.controlador = c;
    }

    public void setModelo(AdminCamion m) {
      this.modelo = m;
    }

    public void inicializarVentana (){
        this.cargarCamionesCombo(); 
    }

    public void cerrar() {
      dispose();
    }

    public void cargarCamionesCombo (){
        List<Camion> aux = this.modelo.obtenerTodos() ;
        for (int i = 0 ; i < aux.size() ; i ++){
            Camion auxCam = aux.get(i) ;
            this.cmbCamion.addItem(auxCam);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        btnSiguiente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        cmbCamion = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDetalle = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);
        setTitle("BUSCAR CAMION");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBorder(javax.swing.BorderFactory.createTitledBorder("BUSCAR CAMION"));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnSiguiente.setText("SIGUIENTE");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));

        jLabel1.setText("Marca y Modelo:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jSeparator3.setBorder(javax.swing.BorderFactory.createTitledBorder("SELECCIONAR EL CAMION"));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 370, 270));

        cmbCamion.setModel(new javax.swing.DefaultComboBoxModel(new String[] {}));
        cmbCamion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCamionActionPerformed(evt);
            }
        });
        getContentPane().add(cmbCamion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 180, -1));

        jLabel2.setText("Datos del camion seleccionado:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        txtDetalle.setColumns(20);
        txtDetalle.setRows(5);
        jScrollPane1.setViewportView(txtDetalle);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 320, 90));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCamionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCamionActionPerformed
        Camion cam = (Camion) this.cmbCamion.getSelectedItem() ;
        this.controlador.setCamion(cam);
        this.txtDetalle.setText("PATENTE: " + cam.getPatente() + "\n"
                              + "MARCA: " + cam.getMarca() + "\n"
                              + "MODELO: " + cam.getModelo() + "\n"
                              + "CANT. PALLETS: " + cam.getCantPallets() + "\n"
                              + "CONSUMO COMBUSTIBLE: " + cam.getCantCombustible()) ;
    }//GEN-LAST:event_cmbCamionActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
       this.controlador.procesarBotonSiguiente();
    }//GEN-LAST:event_btnSiguienteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JComboBox cmbCamion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextArea txtDetalle;
    // End of variables declaration//GEN-END:variables
}
