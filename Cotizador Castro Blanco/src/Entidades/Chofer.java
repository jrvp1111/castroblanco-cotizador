
package Entidades;

public class Chofer
{
    private int dni ;
    private String nombre ;
    private String apellido ;
    private String direccion ;
    private int telefono ;
    private String nextel ;

    public Chofer (int dni , String nom , String ape , String dire , int tele , String nex){
        this.dni = dni ;
        this.nombre = nom ;
        this.apellido = ape ;
        this.direccion = dire ;
        this.telefono = tele ;
        this.nextel = nex ;
    }

    public int getDni (){
        return this.dni ;
    }

    public void setDni (int dni){
        this.dni = dni ;
    }

    public String getNombre (){
        return this.nombre ;
    }

    public void setNombre (String nom){
        this.nombre = nom ;
    }

    public String getApellido (){
        return this.apellido ;
    }

    public void setApellido (String ape){
        this.apellido = ape ;
    }

    public String getDireccion (){
        return this.direccion ;
    }

    public void setDireccion (String dire){
        this.direccion = dire ;
    }

    public int getTelefono (){
        return this.telefono ;
    }

    public void setTelefono (int tel){
        this.telefono = tel ;
    }

    public String getNextel (){
        return this.nextel ;
    }

    public void setNextel (String nex){
        this.nextel = nex ;
    }
}
