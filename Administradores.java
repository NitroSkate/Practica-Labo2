/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

/**
 *
 * @author nitroskate
 */
public class Administradores {
    private String Nombre;
    private String Usuarios;
    private String Contraseñas;
    
    public Administradores(){}
    
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    
    public String getNombre(){
        return Nombre;
    }
    
    public void setUsuarios(String Usuarios){
        this.Usuarios = Usuarios;
    }
    
    public String getUsuarios(){
        return Usuarios;
    }
    
    public void setContraseñas(String Contraseñas){
        this.Contraseñas = Contraseñas;
    }
    
    public String getContraseñas(){
        return Contraseñas;
    }
}
