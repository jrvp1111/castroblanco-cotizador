
package Controladores;

import Entidades.Cotizacion;
import Modelos.AdminCotizacion;
import Vistas.ResumenCotizacion;

public class ResumenCotizacionCONT
{
    private ResumenCotizacion vista;
    private AdminCotizacion modelo;

    private Cotizacion coti ;

    public ResumenCotizacionCONT(ResumenCotizacion v, AdminCotizacion m) {
        this.vista = v;
        this.modelo = m;
        vista.setControlador(this);
        vista.setModelo(m);
    }

    public void setCotizacion (Cotizacion coti){
        this.coti = coti ;
    }

    public void cargarDatosIniciales (){
        this.vista.mostrarCostosCalculados(modelo.calcularCostosFijos(coti)) ;
    }
}
