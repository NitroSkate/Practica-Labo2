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
public class Factura {
    private String NombreProv;
    private int NumeroVenta;
    private String NombreCliente;
    private String FechaVenta;
    private int PrecioProduc;
    
    public Factura (){}
    
    public void setNombreProv(String NombreProv){
        this.NombreProv = NombreProv;
    }
    
    public String getNombreProv(){
        return NombreProv;
    }
    
    public void setNumeroVenta(int NumeroVenta){
        this.NumeroVenta = NumeroVenta;
    }
    
    public int getNumeroVenta(){
        return NumeroVenta;
    }
        
    public void setNombreCliente(String NombreCliente){
        this.NombreCliente = NombreCliente;
    }
    
    public String getNombreCliente(){
        return NombreCliente;
    }
        
    public void setFechaVenta(String FechaVenta){
        this.FechaVenta = FechaVenta;
    }
    
    public String getFechaVenta(){
        return FechaVenta;
    }
        
    public void setPrecioProduc(int PrecioProduc){
        this.PrecioProduc = PrecioProduc;
    }
    
    public int getPrecioProduc(){
        return PrecioProduc;
    }
    
    
}
