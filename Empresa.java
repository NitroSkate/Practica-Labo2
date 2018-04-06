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
public class Empresa {
    private String Nombre;
    private String Direccion;
    private int Telefono;
    private String Productos;
    
    public Empresa() {}
    
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    
    public String getNombre(){
        return Nombre;
    }
    
    public void setDireccion(String Direccion){
        this.Direccion = Direccion;
    }
    
    public String getDireccion(){
        return Direccion;
    }
    
    public void setTelefono(int Telefono){
        this.Telefono = Telefono;
    }
    
    public int getTelefono(){
        return Telefono;
    }
    
}
