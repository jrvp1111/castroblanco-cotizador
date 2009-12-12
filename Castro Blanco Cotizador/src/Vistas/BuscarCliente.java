
package Vistas;

import Controladores.BuscarClienteCONT;
import Entidades.Cliente;
import Modelos.AdminCliente;
import javax.swing.JOptionPane;

public class BuscarCliente extends javax.swing.JInternalFrame
{
    private BuscarClienteCONT controlador;
    private AdminCliente modelo;

    public BuscarCliente() {
        initComponents();
        this.cmbTipoDoc.addItem("CUIT");
        this.cmbTipoDoc.addItem("CUIL");
        this.setVisible(true);
    }

    public void mostrarMensaje(String msg) {
      JOptionPane.showMessageDialog(rootPane, msg);
    }

    public void cargarDatosCliente (Cliente c){
        // Es el tostring hecho por mi
        this.txtDatosCliente.setText(c.tostring());
    }

    public void setControlador(BuscarClienteCONT c) {
      this.controlador = c;
    }

    public void setModelo(AdminCliente m) {
      this.modelo = m;
    }

    public void cerrar() {
      dispose();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbTipoDoc = new javax.swing.JComboBox();
        txtNumeroDoc = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDatosCliente = new javax.swing.JTextArea();
        btnSiguiente = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("BUSCAR CLIENTE");
        setPreferredSize(new java.awt.Dimension(500, 410));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel1.setText("Tipo de documento:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel2.setText("Numero de documento:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        cmbTipoDoc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { }));
        getContentPane().add(cmbTipoDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 90, -1));
        getContentPane().add(txtNumeroDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 150, -1));

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, 30));

        txtDatosCliente.setColumns(20);
        txtDatosCliente.setEditable(false);
        txtDatosCliente.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        txtDatosCliente.setRows(5);
        jScrollPane1.setViewportView(txtDatosCliente);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 420, 140));

        btnSiguiente.setText("SIGUIENTE");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, -1, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Datos del cliente encontrado:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (this.txtNumeroDoc.getText().equals("")){
            this.mostrarMensaje("Debe completar los datos para hacer la busqueda !");
            return ;
        }
        this.controlador.procesarBuscarCliente(cmbTipoDoc.getSelectedItem().toString(), Integer.valueOf(txtNumeroDoc.getText()));
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
       if (this.txtDatosCliente.equals("")){
           this.mostrarMensaje("Debe seleccionar al cliente que pide la cotizacion !");
           return ;
       }
       this.controlador.procesarBotonSiguiente();
    }//GEN-LAST:event_btnSiguienteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JComboBox cmbTipoDoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtDatosCliente;
    private javax.swing.JTextField txtNumeroDoc;
    // End of variables declaration//GEN-END:variables
}
