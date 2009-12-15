
package Vistas;

import Controladores.ActualizarCostosCONT;
import Entidades.Camion;
import Entidades.Costo;
import Entidades.CostoFijo;
import Entidades.CostoFinanciero;
import Entidades.CostoVariable;
import Modelos.AdminCostos;
import Modelos.Sistema;
import java.util.Calendar;
import java.sql.Date;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

public class ActualizarCostos extends javax.swing.JInternalFrame
{
    private ActualizarCostosCONT controlador;
    private Sistema modelo ;

    private DefaultListModel dlmViajesEncontrados = new DefaultListModel();

    private Costo costoSeleccionado ;

    public ActualizarCostos() {
        initComponents();
        this.listCostosEncontrados.setModel(dlmViajesEncontrados);
        this.setVisible(true);
    }

    public void setControlador(ActualizarCostosCONT c) {
      this.controlador = c;
    }

    public void setModelo(Sistema m) {
      this.modelo = m;
    }

    public void setCostoSeleccionado (Costo c){
        this.costoSeleccionado = c ;
    }

    public Costo getCostoSeleccionado (){
        return this.costoSeleccionado ;
    }

    public void mostrarMensaje(String msg) {
      JOptionPane.showMessageDialog(rootPane, msg);
    }

    public void inicializarVentana (){
        // tomo la referencia del controlador anterior "BuscarCamionCONT"
        Camion cam = this.controlador.getCamion() ;
        this.lblCamionActualizar.setText("CAMION A ACTUALIZAR: " + cam.toString());
    }

    // segun el estado, activo o desavtivo los controles de cada uno
    public void seteoCostosFijos(Boolean estado){
        this.txtNombreFijo.setEnabled(estado);
        this.txtValorFijo.setEnabled(estado);
        this.btnGuardarFijo.setEnabled(estado);
        this.btnCancelarFijo.setEnabled(estado);
    }

    // segun el estado, activo o desavtivo los controles de cada uno
    public void seteoCostosVariables(Boolean estado){
        this.txtNombreVariable.setEnabled(estado);
        this.txtCantidadVariable.setEnabled(estado);
        this.txtDuracionVariable.setEnabled(estado);
        this.txtPrecioUnitarioVariable.setEnabled(estado);
        this.btnGuardarVariable.setEnabled(estado);
        this.btnCancelarVariable.setEnabled(estado);
    }

    public void seteoCostosFinancieros (Boolean estado){
        this.txtNombreFinanciero.setEnabled(estado);
        this.txtDepreciacionFinanciero.setEnabled(estado);
        this.txtValorUnidadFinanciero.setEnabled(estado);
        this.txtVidaUtilFinanciero.setEnabled(estado);
        this.btnGuardarFinanciero.setEnabled(estado);
        this.btnCancelarFinanciero.setEnabled(estado);
    }

    public void limpioVentanaFijo (){
        this.txtNombreFijo.setText("");
        this.txtValorFijo.setText("");
    }

    public void limpioVentanaVariable (){
        this.txtNombreVariable.setText("");
        this.txtCantidadVariable.setText("");
        this.txtDuracionVariable.setText("");
        this.txtPrecioUnitarioVariable.setText("");
    }

    public void limpiarVentanaFinanciero (){
        this.txtNombreFinanciero.setText("");
        this.txtDepreciacionFinanciero.setText("");
        this.txtValorUnidadFinanciero.setText("");
        this.txtVidaUtilFinanciero.setText("");
    }

    public void completarDatosFijo (CostoFijo fijo){
        this.txtNombreFijo.setText(fijo.getNombre());
        this.txtValorFijo.setText(String.valueOf(fijo.getValor())) ;
    }

    public void completarDatosVariable (CostoVariable variable){
        this.txtNombreVariable.setText(variable.getNombre());
        this.txtDuracionVariable.setText(String.valueOf(variable.getDuracion()));
        this.txtCantidadVariable.setText(String.valueOf(variable.getCantidad()));
        this.txtPrecioUnitarioVariable.setText(String.valueOf(variable.getPrecioUnitario()));
    }

    public void completarDatosFinanciero (CostoFinanciero financiero){
        this.txtNombreFinanciero.setText(financiero.getNombre()) ;
        this.txtValorUnidadFinanciero.setText(String.valueOf(financiero.getValorUnidad()));
        this.txtVidaUtilFinanciero.setText(String.valueOf(financiero.getVidaUtil()));
        this.txtDepreciacionFinanciero.setText(String.valueOf(financiero.getDepreciacion()));
    }

    public void limpiarVentanaEntera (){
        this.limpioVentanaFijo();
        this.limpioVentanaVariable();
        this.limpiarVentanaFinanciero();
        this.seteoCostosFijos(false);
        this.seteoCostosVariables(false);
        this.seteoCostosFinancieros(false);
    }

    public void cargarCostosEnLista (Vector<Costo> costosEncontrados){
        DefaultListModel modeloLista = (DefaultListModel) this.listCostosEncontrados.getModel() ;
        modeloLista.clear() ;
        for (int i = 0 ; i < costosEncontrados.size() ; i ++){
            Costo aux = costosEncontrados.get(i) ;
            modeloLista.addElement(aux);
        }
        this.listCostosEncontrados.setModel(modeloLista);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        txtBuscarCosto = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listCostosEncontrados = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        btnSeleccionar = new javax.swing.JButton();
        lblCamionActualizar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombreFijo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtValorFijo = new javax.swing.JTextField();
        btnGuardarVariable = new javax.swing.JButton();
        btnCancelarVariable = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        sepCostoFijo = new javax.swing.JSeparator();
        txtNombreVariable = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDuracionVariable = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCantidadVariable = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPrecioUnitarioVariable = new javax.swing.JTextField();
        btnGuardarFijo = new javax.swing.JButton();
        btnCancelarFijo = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        txtNombreFinanciero = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtValorUnidadFinanciero = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtVidaUtilFinanciero = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtDepreciacionFinanciero = new javax.swing.JTextField();
        btnGuardarFinanciero = new javax.swing.JButton();
        btnCancelarFinanciero = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("ACTUALIZAR COSTOS");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jSeparator2.setBorder(javax.swing.BorderFactory.createTitledBorder("BUSCAR COSTO"));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 310, 350));

        jLabel1.setText("Nombre Costo:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));
        getContentPane().add(txtBuscarCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 180, -1));

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, -1, -1));

        listCostosEncontrados.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listCostosEncontrados);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 270, 170));

        jLabel2.setText("Costos Encontrados");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        btnSeleccionar.setText("SELECCIONAR");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, -1, -1));

        lblCamionActualizar.setFont(new java.awt.Font("Tahoma", 1, 12));
        lblCamionActualizar.setText("COSTOS PARA CAMION");
        getContentPane().add(lblCamionActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel3.setText("NOMBRE:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, -1, -1));
        getContentPane().add(txtNombreFijo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 140, -1));

        jLabel4.setText("VALOR: ($ Mes)");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, -1, -1));
        getContentPane().add(txtValorFijo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 140, -1));

        btnGuardarVariable.setText("GUARDAR");
        btnGuardarVariable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarVariableActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardarVariable, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, 90, -1));

        btnCancelarVariable.setText("CANCELAR");
        btnCancelarVariable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarVariableActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelarVariable, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 210, -1, -1));

        jSeparator3.setBorder(javax.swing.BorderFactory.createTitledBorder("COSTO VARIABLE"));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 400, 200));

        jLabel5.setText("NOMBRE:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, -1, -1));

        sepCostoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("COSTO FIJO"));
        getContentPane().add(sepCostoFijo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 400, 110));
        getContentPane().add(txtNombreVariable, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 130, -1));

        jLabel6.setText("DURACION: (Km)");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, -1, -1));
        getContentPane().add(txtDuracionVariable, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 130, -1));

        jLabel7.setText("CANTIDAD: (Unidades) ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, -1, -1));
        getContentPane().add(txtCantidadVariable, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 130, -1));

        jLabel8.setText("PRECIO UNITARIO: ($)");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, -1, -1));
        getContentPane().add(txtPrecioUnitarioVariable, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 130, -1));

        btnGuardarFijo.setText("GUARDAR");
        btnGuardarFijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarFijoActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardarFijo, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 40, 90, -1));

        btnCancelarFijo.setText("CANCELAR");
        btnCancelarFijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarFijoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelarFijo, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 80, -1, -1));

        jSeparator4.setBorder(javax.swing.BorderFactory.createTitledBorder("COSTO FINANCIERO"));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 400, 190));

        jLabel9.setText("NOMBRE:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, -1, -1));
        getContentPane().add(txtNombreFinanciero, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, 130, -1));

        jLabel10.setText("VALOR UNIDAD: ($)");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, -1, -1));
        getContentPane().add(txtValorUnidadFinanciero, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, 130, -1));

        jLabel11.setText("VIDA UTIL: (Años)");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 450, -1, -1));
        getContentPane().add(txtVidaUtilFinanciero, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 450, 130, -1));

        jLabel12.setText("DEPRECIACION: (%)");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 490, -1, -1));
        getContentPane().add(txtDepreciacionFinanciero, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 490, 130, -1));

        btnGuardarFinanciero.setText("GUARDAR");
        btnGuardarFinanciero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarFinancieroActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardarFinanciero, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 370, 90, -1));

        btnCancelarFinanciero.setText("CANCELAR");
        btnCancelarFinanciero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarFinancieroActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelarFinanciero, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 410, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // boton para buscar el costo deseados
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        Vector<Costo> encontrados = this.controlador.obtenerCostosPorNombreParaCamion(this.txtBuscarCosto.getText() , this.controlador.getCamion().getPatente()) ;
        this.cargarCostosEnLista(encontrados);
    }//GEN-LAST:event_btnBuscarActionPerformed

    // boton seleccionar costo
    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        DefaultListModel dlm = (DefaultListModel) this.listCostosEncontrados.getModel() ;
        Costo costo = (Costo)dlm.getElementAt(this.listCostosEncontrados.getSelectedIndex()) ;
        this.controlador.procesarBotonSeleccionarCosto(costo);
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    // guardar los cambios del costo fijo
    private void btnGuardarFijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarFijoActionPerformed
        CostoFijo aux = (CostoFijo) this.costoSeleccionado ;
        aux.setNombre(this.txtNombreFijo.getText());
        aux.setValor(Float.valueOf(this.txtValorFijo.getText()));
        Calendar cal = Calendar.getInstance();
        Date fechaActual = new Date(cal.getTimeInMillis());
        aux.setActualizacion(fechaActual);
        //
        this.modelo.actualizarCostoFijoCamion(aux, this.controlador.getCamion().getPatente());
        this.mostrarMensaje("El costo fijo se ha actualizado correctamente");
        //
        limpiarVentanaEntera () ;
    }//GEN-LAST:event_btnGuardarFijoActionPerformed

    // guardar los cambios del costo variable
    private void btnGuardarVariableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarVariableActionPerformed
        CostoVariable aux = (CostoVariable) this.costoSeleccionado ;
        aux.setNombre(this.txtNombreVariable.getText());
        aux.setCantidad(Integer.valueOf(this.txtCantidadVariable.getText()));
        aux.setDuracion(Integer.valueOf(this.txtDuracionVariable.getText()));
        aux.setPrecioUnitario(Float.valueOf(this.txtPrecioUnitarioVariable.getText()));
        Calendar cal = Calendar.getInstance();
        Date fechaActual = new Date(cal.getTimeInMillis());
        aux.setActualizacion(fechaActual);
        //
        this.modelo.actualizarCostoVariableCamion(aux, this.controlador.getCamion().getPatente());
        this.mostrarMensaje("El costo variable se ha actualizado correctamente");
        //
        limpiarVentanaEntera () ;
    }//GEN-LAST:event_btnGuardarVariableActionPerformed

    private void btnGuardarFinancieroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarFinancieroActionPerformed
        CostoFinanciero aux = (CostoFinanciero) this.costoSeleccionado ;
        aux.setNombre(this.txtNombreFinanciero.getText());
        aux.setVidaUtil(Integer.valueOf(this.txtVidaUtilFinanciero.getText()));
        aux.setValorUnidad(Float.valueOf(this.txtValorUnidadFinanciero.getText()));
        aux.setDepreciacion(Float.valueOf(this.txtDepreciacionFinanciero.getText()));
        //
        this.modelo.actualizarCostoFinancieroCamion(aux, this.controlador.getCamion().getPatente());
        this.mostrarMensaje("El costo financiero se ha actualizado correctamente");
        //
        limpiarVentanaEntera () ;
    }//GEN-LAST:event_btnGuardarFinancieroActionPerformed

    private void btnCancelarVariableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarVariableActionPerformed
        this.limpioVentanaVariable();
        this.seteoCostosVariables(Boolean.FALSE);
    }//GEN-LAST:event_btnCancelarVariableActionPerformed

    private void btnCancelarFijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarFijoActionPerformed
        this.limpioVentanaFijo();
        this.seteoCostosFijos(Boolean.FALSE);
    }//GEN-LAST:event_btnCancelarFijoActionPerformed

    private void btnCancelarFinancieroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarFinancieroActionPerformed
        this.limpiarVentanaFinanciero();
        this.seteoCostosFinancieros(Boolean.FALSE);
    }//GEN-LAST:event_btnCancelarFinancieroActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelarFijo;
    private javax.swing.JButton btnCancelarFinanciero;
    private javax.swing.JButton btnCancelarVariable;
    private javax.swing.JButton btnGuardarFijo;
    private javax.swing.JButton btnGuardarFinanciero;
    private javax.swing.JButton btnGuardarVariable;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblCamionActualizar;
    private javax.swing.JList listCostosEncontrados;
    private javax.swing.JSeparator sepCostoFijo;
    private javax.swing.JTextField txtBuscarCosto;
    private javax.swing.JTextField txtCantidadVariable;
    private javax.swing.JTextField txtDepreciacionFinanciero;
    private javax.swing.JTextField txtDuracionVariable;
    private javax.swing.JTextField txtNombreFijo;
    private javax.swing.JTextField txtNombreFinanciero;
    private javax.swing.JTextField txtNombreVariable;
    private javax.swing.JTextField txtPrecioUnitarioVariable;
    private javax.swing.JTextField txtValorFijo;
    private javax.swing.JTextField txtValorUnidadFinanciero;
    private javax.swing.JTextField txtVidaUtilFinanciero;
    // End of variables declaration//GEN-END:variables
}
