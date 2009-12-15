
package Entidades;

import java.util.Comparator;

public class ListarCotizacionesPrecio implements Comparator<Cotizacion>
{
    public int compare(Cotizacion c1, Cotizacion c2)
    {
        String precio1 = Float.toString(c1.getPrecioVenta());
        String precio2 = Float.toString(c2.getPrecioVenta());
        return precio1.compareTo(precio2);
    }
}
