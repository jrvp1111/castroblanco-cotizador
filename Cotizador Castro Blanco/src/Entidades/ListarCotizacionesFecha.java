/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Entidades;

import java.util.Comparator;

/**
 *
 * @author candelas
 */
public class ListarCotizacionesFecha implements Comparator<Cotizacion>{


    public int compare(Cotizacion c1, Cotizacion c2) {
    return c1.getFechaEmision().compareTo(c2.getFechaEmision());
    }

}
