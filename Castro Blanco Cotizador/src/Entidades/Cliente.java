
package Entidades;

public class Cliente
{
    private String tipoId ;
    private int numeroId ;
    private String nombre ;
    private String apellido ;
    private String razonSocial ;
    private String email ;
    
    public Cliente (String tId , int nId , String nom , String ape , String razSoc , String email){
        this.tipoId = tId ;
        this.numeroId = nId ;
        this.nombre = nom ;
        this.apellido = ape ;
        this.razonSocial = razSoc ;
        this.email = email ;
    }

    public String getTipoId (){
        return this.tipoId ;
    }

    public int getNumeroId (){
        return this.numeroId ;
    }

    public String getNombre (){
        return this.nombre ;
    }

    public String getApellido (){
        return this.apellido ;
    }

    public String getRazonSocial (){
        return this.razonSocial ;
    }

    public String getEmail (){
        return this.email ;
    }
}
