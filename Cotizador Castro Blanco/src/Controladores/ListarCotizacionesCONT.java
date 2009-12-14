/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Controladores;

import Entidades.Cotizacion;
import Modelos.AdminCotizacion;
import Vistas.CotizacionTableModel;
import Vistas.ListarCotizaciones;
import java.util.Date;
import java.util.Vector;

/**
 *
 * @author candelas
 */
public class ListarCotizacionesCONT {

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

}
