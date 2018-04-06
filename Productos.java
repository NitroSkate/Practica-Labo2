/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;



/**
 *
 * @author Joshua Sharp
 */
public class Productos {

    private String Nombre;
    private int Cantidad;
    private int Costo;
    private String Estado;
    
    public Productos() {}
    
    /*public Productos(String Nombre, int Cantidad, int Costo, String Estado){
        this.Nombre = Nombre;
        this.Cantidad = Cantidad;
        this.Costo = Costo;
        this.Estado = Estado;
    }*/
    
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    
    public String getNombre(){
        return Nombre;
    }
    
    public void setCantidad(int Cantidad){
        this.Cantidad = Cantidad;
    }
    
    public int getCantidad(){
        return Cantidad;
    }
    
    public void setCosto(int Costo){
        this.Costo = Costo;
    }
    
    public int getCosto(){
        return Costo;
    }
    
    public void setEstado(String Estado){
        this.Estado = Estado;
    }
    
    public String getEstado(){
        return Estado;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Menu menu = Menu.getInstance();
        
        //menu.login();
    }
    
}
