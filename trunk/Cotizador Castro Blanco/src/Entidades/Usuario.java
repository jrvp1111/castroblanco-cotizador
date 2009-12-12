
package Entidades;

import java.util.Vector;

public class Usuario
{
    private String nombreUsuario ;
    private String contrasenia ;
    private Vector<Rol> roles ;

    public Usuario (String user , String pass){
        this.nombreUsuario = user ;
        this.contrasenia = pass ;
        this.roles = new Vector<Rol> () ;
    }

    public Usuario() {
        this.nombreUsuario = null ;
        this.contrasenia = null ;
        this.roles = new Vector<Rol> () ;
    }

    public void agregarRol (Rol r){
        this.roles.add(r);
    }

    public Vector<Rol> obtenerRoles (){
        return this.roles ;
    }

    public String getNombreUsuario (){
        return this.nombreUsuario ;
    }

    public void setNombreUsuario (String nomUsuario){
        this.nombreUsuario = nomUsuario ;
    }

    public String getContrasenia (){
        return this.contrasenia ;
    }

    public void setContrasenia (String pass){
        this.contrasenia = pass ;
    }
}
