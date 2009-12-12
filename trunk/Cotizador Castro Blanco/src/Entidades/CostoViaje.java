
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

    @Override
    public String toString (){
        return (this.nombre + ": $" +  this.valor);
    }
}
