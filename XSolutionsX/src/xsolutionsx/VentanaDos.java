/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xsolutionsx;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import javax.swing.JFrame;

/**
 *
 * @author AlbertoReyes
 */
public class VentanaDos extends Ventana{
    
    private static Plano plano;
    
    public VentanaDos()throws IOException{
        
        dim = super.getToolkit().getScreenSize();
        setSize(dim);
        setVisible(true);
        setLocation(0,0);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("X-Solutyons");
        this.setResizable(true);
        
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("showimage.png"));
        
        setIconImage(icon);
        
        add(plano);
        
    }
    
}
