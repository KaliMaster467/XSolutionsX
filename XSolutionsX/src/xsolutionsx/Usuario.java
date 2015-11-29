/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xsolutionsx;

/**
 *
 * @author AlbertoReyes
 */
public class Usuario {
    
    public Usuario(String nombre, String clave){
        
        this.nombre = nombre;
        this.clave = clave;
        
    }
    public Usuario(String clave){
        
        this.clave = clave;
        nombre = "";
        
    }
    public void setClave(String clave){
        
        this.clave = clave;
        
    }
    public String getNombre(){
        
        return nombre;
        
    }
    public String getClave(){
        
        return clave;
        
    }
    private final String nombre;
    private String clave;
    
}
