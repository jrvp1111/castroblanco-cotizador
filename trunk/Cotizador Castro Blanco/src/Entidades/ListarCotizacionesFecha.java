
package Entidades;

import java.util.Comparator;

public class ListarCotizacionesFecha implements Comparator<Cotizacion>
{
    public int compare(Cotizacion c1, Cotizacion c2)
    {
        return c1.getFechaEmision().compareTo(c2.getFechaEmision());
    }
}
