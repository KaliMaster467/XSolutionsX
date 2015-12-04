/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xsolutionsx;

import java.io.Serializable;

/**
 *
 * @author AlbertoReyes
 */
public class Usuario implements Serializable{

    public void setClave(String clave){
        
        this.clave = clave;
        
    }
    public String getNombre(){
        
        return nombre;
        
    }
    public String getClave(){
        
        return clave;
        
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
    private String nombre;
    private String clave;
    private String grupo;
    
}
