
package Entidades;

public class Actualizador extends Rol
{
    public boolean puedeAdministrar() {
        return false ;
    }

    public boolean puedeCotizar() {
        return false ;
    }

    public boolean puedeActualizar() {
        return true ;
    }
}
