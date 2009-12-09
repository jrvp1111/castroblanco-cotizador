
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

    public Cliente (){
        this.tipoId = null ;
        this.numeroId = 0 ;
        this.nombre = null ;
        this.apellido = null ;
        this.razonSocial = null ;
        this.email = null ;
    }

    public String getTipoId (){
        return this.tipoId ;
    }

    public void setTipoId (String tipoId){
        this.tipoId = tipoId ;
    }

    public int getNumeroId (){
        return this.numeroId ;
    }

    public void setNumeroId (int numId){
        this.numeroId = numId ;
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

    public String getRazonSocial (){
        return this.razonSocial ;
    }

    public void setRazonSocial (String razSoc){
        this.razonSocial = razSoc ;
    }

    public String getEmail (){
        return this.email ;
    }

    public void setEmail (String email){
        this.email = email ;
    }

    public String tostring (){
        String X = "" ;
        X = "TipoID: " + this.tipoId + " | NumeroID: " + String.valueOf(this.numeroId) + "\n"
            + "Nombre Completo: " + this.nombre + " " + this.apellido + "\n"
            + "Razon Social: " + this.razonSocial + "\n"
            + "Email: " + this.email ;
        return X ;
    }
}
