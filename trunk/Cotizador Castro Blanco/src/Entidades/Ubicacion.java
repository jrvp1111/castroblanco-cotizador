
package Entidades;

public class Ubicacion
{
    private String pais  ;
    private String provincia ;
    private String ciudad ;
    private String direccion ;

    public Ubicacion (String pais , String provin , String ciud , String dire)
    {
        this.pais = pais ;
        this.provincia = provin ;
        this.ciudad = ciud ;
        this.direccion = dire ;
    }

    @Override
    public String toString (){
        return (this.pais + ", " + this.provincia + ", " + this.ciudad + ", " + this.direccion) ;
    }

    public String getPais (){
        return this.pais ;
    }

    public String getProvincia (){
        return this.provincia ;
    }

    public String getCiudad (){
        return this.ciudad ;
    }

    public String getDireccion (){
        return this.direccion ;
    }
}
