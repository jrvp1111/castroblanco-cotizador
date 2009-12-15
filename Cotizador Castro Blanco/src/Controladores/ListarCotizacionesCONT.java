
package Controladores;

import Entidades.Cotizacion;
import Entidades.ListarCotizacionesDistancia;
import Entidades.ListarCotizacionesFecha;
import Entidades.ListarCotizacionesPrecio;
import Modelos.AdminCotizacion;
import Vistas.CotizacionTableModel;
import Vistas.ListarCotizaciones;
import java.io.IOException;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ListarCotizacionesCONT
{
    private CotizacionTableModel ctm;
    private AdminCotizacion modelo;
    private ListarCotizaciones vista;
    Vector<Cotizacion> cotizaciones;

    public ListarCotizacionesCONT(){
        this.modelo = new AdminCotizacion();
        this.vista = new ListarCotizaciones();
        this.vista.setVisible(true);
        vista.setControlador(this);
        cotizaciones = this.modelo.obtenerCotizaciones();
        if(cotizaciones == null)
            ctm = new CotizacionTableModel();
        else
            ctm = new CotizacionTableModel(cotizaciones);
        this.vista.setTableModel(ctm);
    }

    public ListarCotizaciones getVista(){
        return this.vista;
    }

    public void procesarFiltrosFecha(Date desde, Date hasta){
        this.ctm.setDatalist(cotizaciones);
        Vector<Cotizacion> todas = this.ctm.getDatalist();
        Vector<Cotizacion> quedan = new Vector<Cotizacion>();
        for(Cotizacion c: todas){
            if(c.getFechaEmision().after(desde) && c.getFechaEmision().before(hasta))
                quedan.addElement(c);
        }
        this.ctm.setDatalist(quedan);
    }

    public void ordenarPorPrecio(){
        Vector<Cotizacion> cotizaciones = this.ctm.getDatalist();
        Collections.sort(cotizaciones, new ListarCotizacionesPrecio());
        this.ctm.setDatalist(cotizaciones);        
    }

    public void ordenarPorDistancia(){
        Vector<Cotizacion> cotizaciones = this.ctm.getDatalist();
        Collections.sort(cotizaciones, new ListarCotizacionesDistancia());
        this.ctm.setDatalist(cotizaciones);

    }

    public void ordenarPorFecha(){
        Vector<Cotizacion> cotizaciones = this.ctm.getDatalist();
        Collections.sort(cotizaciones, new ListarCotizacionesFecha());
        this.ctm.setDatalist(cotizaciones);
        
    }

    public void exportarExcel() {
       com.csvreader.CsvWriter csv = new com.csvreader.CsvWriter("export.csv");
        try {
            csv.write("Nro Cotizacion");
            csv.write("Cliente");
            csv.write("Distancia");
            csv.write("Costo Operativo");
            csv.write("Precio Operativo");
            csv.write("Estado");
            csv.write("Fecha");
            csv.endRecord();
            //ITERATOR PATTERN
            Iterator it = ctm.getDatalist().iterator();

            while (it.hasNext()){
                Cotizacion c = (Cotizacion) it.next();
                csv.write(Integer.toString(c.getNroCotizacion()));
                csv.write(c.getCliente().getNombre()+" "+c.getCliente().getApellido());
                csv.write(c.calcularDistanciaTotal()+" km");
                csv.write(Float.toString(c.getCostoOperativo()));
                csv.write(Float.toString(c.getPrecioVenta()));
                csv.write(c.getEstado()?"Aceptada":"Rechazada");
                csv.write(c.getFechaEmision().toString());
                csv.endRecord();
            }

            csv.close();

        } catch (IOException ex) {
            Logger.getLogger(ListarCotizacionesCONT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
