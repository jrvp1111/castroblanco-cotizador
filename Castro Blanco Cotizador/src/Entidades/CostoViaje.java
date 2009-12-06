
package Entidades;

public class CostoViaje extends Costo
{
    private float valor ;

    public CostoViaje (String nombre , float valor){
        this.nombre = nombre ;
        this.valor = valor ;
    }

    public float getValor (){
        return this.valor ;
    }
}
