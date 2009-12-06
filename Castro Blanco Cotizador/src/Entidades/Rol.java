
package Entidades;

public abstract class Rol
{
    private boolean permisoAdministrador ;
    private boolean permisoCotizador ;
    private boolean permisoActualizado ;

    public abstract boolean puedeAdministrar () ;
    public abstract boolean puedeCotizar () ;
    public abstract boolean puedeActualizar () ;
}
