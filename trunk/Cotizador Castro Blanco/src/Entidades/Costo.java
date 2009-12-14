

package Entidades;

public abstract class Costo
{
    protected String nombre ;

    public String toString (){
        return ("NOMBRE: " + this.nombre) ;
    }

    public String getNombre (){
        return this.nombre ;
    }

    public void setNombre (String nom){
        this.nombre = nom ;
    }
}
