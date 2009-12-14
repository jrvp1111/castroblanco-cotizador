/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Entidades;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Vector;

/**
 *
 * @author candelas
 */
public class ListarCotizacionesPrecio implements Comparator<Cotizacion>{

    public int compare(Cotizacion c1, Cotizacion c2) {
        String precio1 = Float.toString(c1.getPrecioVenta());
        String precio2 = Float.toString(c2.getPrecioVenta());
        return precio1.compareTo(precio2);
    }

}
