
package Vistas;

import Controladores.CargarViajesCONT;
import Entidades.Camion;
import Entidades.CostoViaje;
import Entidades.Ubicacion;
import Entidades.Viaje;
import Modelos.AdminViaje;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class CargarViajes extends javax.swing.JInternalFrame
{
    private CargarViajesCONT controlador;
    private AdminViaje modelo;

    private DefaultListModel dlmCostoViaje = new DefaultListModel();
    private DefaultListModel dlmViajesCargados = new DefaultListModel ();

    private Vector<CostoViaje> costoViajeTemporal ;
    private Vector<Viaje> viajesCotizados ;
    
    public CargarViajes() {
        initComponents();
        this.setVisible(true);
    }

    public void cerrar() {
      dispose();
    }

    public void mostrarMensaje(String msg) {
      JOptionPane.showMessageDialog(rootPane, msg);
    }

    public void setControlador(CargarViajesCONT c) {
      this.controlador = c;
    }

    public void setModelo(AdminViaje m) {
      this.modelo = m;
    }

    public void inicializarDatosVentana (){
        this.listCostosViaje.setModel(dlmCostoViaje);
        this.listViajesCotizados.setModel(dlmViajesCargados);
        this.costoViajeTemporal = new Vector<CostoViaje> () ;
        this.viajesCotizados = new Vector <Viaje> () ;
        CargarCamiones () ;
        mostrarCostosViajes () ;
    }

    public void CargarCamiones (){
        List<Camion> aux = this.modelo.obtenerCamiones() ;
        for (int i = 0 ; i < aux.size() ; i ++){
            Camion auxCam = aux.get(i) ;
            this.cmbCamion.addItem(auxCam);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDireccionOrigen = new javax.swing.JTextField();
        txtPaisOrigen = new javax.swing.JTextField();
        txtProvinciaOrigen = new javax.swing.JTextField();
        txtCiudadOrigen = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtDireccionDestino = new javax.swing.JTextField();
        txtPaisDestino = new javax.swing.JTextField();
        txtProvinciaDestino = new javax.swing.JTextField();
        txtCiudadDestino = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtDistancia = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        cmbCamion = new javax.swing.JComboBox();
        btnDetalleCamion = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDetalleMercaderia = new javax.swing.JTextArea();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtMontoCostoAdi = new javax.swing.JTextField();
        txtNombreCostoAdi = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listCostosViaje = new javax.swing.JList();
        btnEliminarCostoAdi = new javax.swing.JButton();
        btnAgregarCostoAdi = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        txtTotalCostoViaje = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        listViajesCotizados = new javax.swing.JList();
        btnAgregarViaje = new javax.swing.JButton();
        btnEliminarViaje = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        calFechaSalida = new org.freixas.jcalendar.JCalendarCombo();
        calFechaLlegada = new org.freixas.jcalendar.JCalendarCombo();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("CARGAR VIAJES");
        setPreferredSize(new java.awt.Dimension(750, 850));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBorder(javax.swing.BorderFactory.createTitledBorder("ORIGEN"));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 150));

        jLabel1.setText("DIRECCION:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel2.setText("PAIS:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jLabel3.setText("PROVINCIA:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel4.setText("CIUDAD:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));
        getContentPane().add(txtDireccionOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 130, -1));
        getContentPane().add(txtPaisOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 130, -1));
        getContentPane().add(txtProvinciaOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 130, -1));
        getContentPane().add(txtCiudadOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 130, -1));

        jSeparator2.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS VARIOS"));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 460, 20));

        jLabel5.setText("DIRECCION:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, -1, -1));

        jLabel6.setText("PAIS:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, -1));

        jLabel7.setText("PROVINCIA:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, -1, -1));

        jLabel8.setText("CIUDAD:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, -1));
        getContentPane().add(txtDireccionDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 130, -1));
        getContentPane().add(txtPaisDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 130, -1));
        getContentPane().add(txtProvinciaDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 130, -1));
        getContentPane().add(txtCiudadDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 130, -1));

        jLabel9.setText("Camion a utilizar:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));
        getContentPane().add(txtDistancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 90, -1));

        jLabel10.setText("Fecha de llegada:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jLabel11.setText("Fecha de salida:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        jSeparator3.setBorder(javax.swing.BorderFactory.createTitledBorder("DESTINO"));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 220, 150));

        jLabel12.setText("Distancia Viaje (Km):");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        cmbCamion.setModel(new javax.swing.DefaultComboBoxModel(new String[] {}));
        getContentPane().add(cmbCamion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 190, -1));

        btnDetalleCamion.setText("VER DETALLE");
        getContentPane().add(btnDetalleCamion, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, -1, -1));

        jLabel13.setText("Descripcion de la mercaderia:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        txtDetalleMercaderia.setColumns(20);
        txtDetalleMercaderia.setRows(5);
        jScrollPane1.setViewportView(txtDetalleMercaderia);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 430, 70));

        jSeparator4.setBorder(javax.swing.BorderFactory.createTitledBorder("COSTOS ADICIONALES"));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 460, 170));

        jLabel14.setText("Monto Costo:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, -1, -1));

        jLabel15.setText("Nombre Costo:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, -1, -1));
        getContentPane().add(txtMontoCostoAdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 520, 100, -1));
        getContentPane().add(txtNombreCostoAdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, 100, -1));

        jLabel16.setText("COSTOS CARGADOS");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 460, -1, -1));

        listCostosViaje.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listCostosViaje);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, 200, 80));

        btnEliminarCostoAdi.setText("Eliminar");
        getContentPane().add(btnEliminarCostoAdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 560, -1, -1));

        btnAgregarCostoAdi.setText("Agregar");
        btnAgregarCostoAdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCostoAdiActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarCostoAdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, -1, -1));

        jLabel17.setText("Monto Total:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 570, -1, -1));
        getContentPane().add(txtTotalCostoViaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 570, 60, -1));

        jSeparator5.setBorder(javax.swing.BorderFactory.createTitledBorder("VIAJES A COTIZAR"));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, 460, 180));

        listViajesCotizados.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        listViajesCotizados.setEnabled(false);
        jScrollPane3.setViewportView(listViajesCotizados);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 650, 420, 110));

        btnAgregarViaje.setText("AGREGAR VIAJE");
        btnAgregarViaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarViajeActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarViaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 770, -1, -1));

        btnEliminarViaje.setText("ELIMINAR VIAJE");
        getContentPane().add(btnEliminarViaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 770, -1, -1));

        btnSiguiente.setText("SIGUIENTE");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 690, -1, -1));
        getContentPane().add(calFechaSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, -1));
        getContentPane().add(calFechaLlegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarCostoAdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCostoAdiActionPerformed
        CostoViaje nuevo = new CostoViaje (this.txtNombreCostoAdi.getText() , Float.valueOf(this.txtMontoCostoAdi.getText())) ;
        this.costoViajeTemporal.add(nuevo);
        mostrarCostosViajes () ;
        mostrarTotalCostosViaje () ;
        // limpio las cajas de texto
        this.txtNombreCostoAdi.setText("");
        this.txtMontoCostoAdi.setText("");
    }//GEN-LAST:event_btnAgregarCostoAdiActionPerformed

    public void agregarViajeAVectorTemporal (Viaje v){
        this.viajesCotizados.add(v);
    }

    public void limpiarVentanaCompleta (){
        this.txtPaisOrigen.setText("");
        this.txtPaisDestino.setText("");
        this.txtProvinciaOrigen.setText("");
        this.txtProvinciaDestino.setText("");
        this.txtCiudadOrigen.setText("");
        this.txtCiudadDestino.setText("");
        this.txtDireccionOrigen.setText("");
        this.txtDireccionDestino.setText("");
        this.txtDistancia.setText("");
        this.txtDetalleMercaderia.setText("");
        this.txtNombreCostoAdi.setText("");
        this.txtMontoCostoAdi.setText("");
        this.txtTotalCostoViaje.setText("");
        DefaultListModel blanco = new DefaultListModel () ;
        blanco.clear(); 
        this.listCostosViaje.setModel(blanco);
    }

    public void cargarViaje (){
        Ubicacion Origen = new Ubicacion (this.txtPaisOrigen.getText() , this.txtProvinciaOrigen.getText() , this.txtCiudadOrigen.getText() , this.txtDireccionOrigen.getText()) ;
        Ubicacion Destino = new Ubicacion (this.txtPaisDestino.getText() , this.txtProvinciaDestino.getText() , this.txtCiudadDestino.getText() , this.txtDireccionDestino.getText()) ;

        java.util.Date fechaSalida = calFechaSalida.getDate() ;
        java.util.Date fechaLlegada = calFechaLlegada.getDate() ;

        java.sql.Date fSalidaSql = new java.sql.Date(fechaSalida.getTime());
        java.sql.Date fLlegadaSql = new java.sql.Date(fechaLlegada.getTime());

        int Distancia = Integer.valueOf(txtDistancia.getText()) ;

        String DescMercaderia = this.txtDetalleMercaderia.getText() ;
        
        Viaje nuevoViaje = new Viaje (Origen , Destino , fSalidaSql , fLlegadaSql , Distancia , DescMercaderia) ;

        nuevoViaje.setCamion((Camion) this.cmbCamion.getSelectedItem());

        this.controlador.procesarCargarViajeNuevo(nuevoViaje);
    }

    // le cargo al viaje definitivo, los costos viaje que guarde temporalmente
    public void agregarCostosViajeTemporales (Viaje v){
        for (int i = 0 ; i < this.costoViajeTemporal.size() ; i ++){
            CostoViaje c = this.costoViajeTemporal.get(i);
            v.agregarCostoViaje(c);
        }
    }

    public void limpiarVectorCostoViajeTemporal (){
        this.costoViajeTemporal.clear();
    }

    // BOTON AGREGAR VIAJE
    private void btnAgregarViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarViajeActionPerformed
        cargarViaje () ;
    }//GEN-LAST:event_btnAgregarViajeActionPerformed

    // muestra la ventana con el resumen de la cotizacion
    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        this.controlador.procesarBotonSiguiente(); 
    }//GEN-LAST:event_btnSiguienteActionPerformed

    public void mostrarViajesCargados (){
        DefaultListModel dlmViajesCargadosAux = (DefaultListModel) this.listViajesCotizados.getModel() ;
        dlmViajesCargadosAux.clear(); 
        for (int i = 0 ; i < this.viajesCotizados.size() ; i ++){
             Viaje aux = this.viajesCotizados.get (i);
             dlmViajesCargadosAux.addElement(aux.toString());
        }
        this.listViajesCotizados.setModel(dlmViajesCargadosAux);
    }

    public void mostrarCostosViajes (){
        DefaultListModel dmlCostosViajesAux = (DefaultListModel) this.listCostosViaje.getModel();
        dmlCostosViajesAux.clear();
        for (int i = 0 ; i < this.costoViajeTemporal.size() ; i ++){
            CostoViaje aux = this.costoViajeTemporal.get(i);
            dmlCostosViajesAux.addElement(aux);
        }
        this.listCostosViaje.setModel(dmlCostosViajesAux);
    }

    public void mostrarTotalCostosViaje (){
        float total = 0 ;
        for (int i = 0 ; i < this.costoViajeTemporal.size() ; i ++){
            CostoViaje aux = this.costoViajeTemporal.get(i);
            total = total + aux.getValor() ;
        }
        this.txtTotalCostoViaje.setText(String.valueOf(total));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCostoAdi;
    private javax.swing.JButton btnAgregarViaje;
    private javax.swing.JButton btnDetalleCamion;
    private javax.swing.JButton btnEliminarCostoAdi;
    private javax.swing.JButton btnEliminarViaje;
    private javax.swing.JButton btnSiguiente;
    private org.freixas.jcalendar.JCalendarCombo calFechaLlegada;
    private org.freixas.jcalendar.JCalendarCombo calFechaSalida;
    private javax.swing.JComboBox cmbCamion;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JList listCostosViaje;
    private javax.swing.JList listViajesCotizados;
    private javax.swing.JTextField txtCiudadDestino;
    private javax.swing.JTextField txtCiudadOrigen;
    private javax.swing.JTextArea txtDetalleMercaderia;
    private javax.swing.JTextField txtDireccionDestino;
    private javax.swing.JTextField txtDireccionOrigen;
    private javax.swing.JTextField txtDistancia;
    private javax.swing.JTextField txtMontoCostoAdi;
    private javax.swing.JTextField txtNombreCostoAdi;
    private javax.swing.JTextField txtPaisDestino;
    private javax.swing.JTextField txtPaisOrigen;
    private javax.swing.JTextField txtProvinciaDestino;
    private javax.swing.JTextField txtProvinciaOrigen;
    private javax.swing.JTextField txtTotalCostoViaje;
    // End of variables declaration//GEN-END:variables
}
