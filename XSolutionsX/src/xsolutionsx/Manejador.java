/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xsolutionsx;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author AlbertoReyes
 */
class Manejador {
    
    private ArrayList <Usuario> user;
    private Ventana vent;
    public static Plano plano;
    private MenuUno menuno;
    private BarraBaja bar;
    
    
    public Manejador() throws IOException{
        
        vent = new Ventana();
        
        menuno = new MenuUno(vent.getWidth(), vent.getHeight() / 2);
        
        vent.getContentPane().add(menuno);
        
        bar = new BarraBaja(0, vent.getHeight() / 2, vent.getWidth(), vent.getHeight());
        
        vent.getContentPane().add(bar);
    }
}
