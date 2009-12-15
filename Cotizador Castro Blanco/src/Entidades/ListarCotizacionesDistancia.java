/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Entidades;

import Entidades.Viaje;
import java.util.Comparator;
import java.util.Vector;

/**
 *
 * @author candelas
 */
public class ListarCotizacionesDistancia implements Comparator <Cotizacion>{

    public int compare(Cotizacion c1, Cotizacion c2) {
        String dist1 = Integer.toString(c1.calcularDistanciaTotal());
        String dist2 = Integer.toString(c2.calcularDistanciaTotal());
        return dist1.compareTo(dist2);
   

    }

}
