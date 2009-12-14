
package Vistas;

import Controladores.ActualizarCostosCONT;
import Entidades.Camion;
import Entidades.Costo;
import Modelos.AdminCostos;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;

public class ActualizarCostos extends javax.swing.JInternalFrame
{
    private ActualizarCostosCONT controlador;
    private AdminCostos modelo;

    private DefaultListModel dlmViajesEncontrados = new DefaultListModel();

    public ActualizarCostos() {
        initComponents();
        this.listCostosEncontrados.setModel(dlmViajesEncontrados);
        this.setVisible(true);
    }

    public void setControlador(ActualizarCostosCONT c) {
      this.controlador = c;
    }

    public void setModelo(AdminCostos m) {
      this.modelo = m;
    }

    public void inicializarVentana (){
        // tomo la referencia del controlador anterior "BuscarCamionCONT"
        Camion cam = this.controlador.getCamion() ;
        this.lblCamionActualizar.setText("CAMION A ACTUALIZAR: " + cam.toString());
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
        sepCostoFijo = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txtNombreFijo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtValorFijo = new javax.swing.JTextField();
        btnGuardarFijo = new javax.swing.JButton();
        btnCancelarFijo = new javax.swing.JButton();

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

        lblCamionActualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCamionActualizar.setText("COSTOS PARA CAMION");
        getContentPane().add(lblCamionActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        sepCostoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("COSTO FIJO"));
        getContentPane().add(sepCostoFijo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 400, 110));

        jLabel3.setText("NOMBRE:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, -1, -1));
        getContentPane().add(txtNombreFijo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 130, -1));

        jLabel4.setText("VALOR: (Mensual)");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, -1, -1));
        getContentPane().add(txtValorFijo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 130, -1));

        btnGuardarFijo.setText("GUARDAR");
        getContentPane().add(btnGuardarFijo, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 40, 90, -1));

        btnCancelarFijo.setText("CANCELAR");
        getContentPane().add(btnCancelarFijo, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 80, -1, -1));

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelarFijo;
    private javax.swing.JButton btnGuardarFijo;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblCamionActualizar;
    private javax.swing.JList listCostosEncontrados;
    private javax.swing.JSeparator sepCostoFijo;
    private javax.swing.JTextField txtBuscarCosto;
    private javax.swing.JTextField txtNombreFijo;
    private javax.swing.JTextField txtValorFijo;
    // End of variables declaration//GEN-END:variables
}
