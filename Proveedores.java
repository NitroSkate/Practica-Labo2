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
public class Proveedores {
    private String Nombre;
    private int Telefono;
    private String Empresas;
    private String Productos;
    private String Email;
    
    public Proveedores(){}
    
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    
    public String getNombre(){
        return Nombre;
    }
    
    public void setTelefono(int Telefono){
        this.Telefono = Telefono;
    }
    
    public int getTelefono(){
        return Telefono;
    }
    
    public void setEmpresas(String Empresas){
        this.Empresas = Empresas;
    }
    
    public String getEmpresas(){
        return Empresas;
    }
    
    public void setProductos(String Productos){
        this.Productos = Productos;
    }
    
    public String getProductos(){
        return Productos;
    }
    
    public void setEmail(String Email){
        this.Email = Email;
    }
    
    public String getEmail(){
        return Email;
    }
}
