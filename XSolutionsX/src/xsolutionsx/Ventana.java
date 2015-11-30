/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xsolutionsx;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import javax.swing.JFrame;

/**
 *
 * @author AlbertoReyes
 */
public class Ventana extends JFrame{
    
    protected Dimension dim;
    protected double width;
    protected double height;
    protected MenuUno menuno;
    private BarraBaja bar;
    
    public Ventana() throws IOException{
        
        dim = super.getToolkit().getScreenSize();
        width = dim.getWidth();
        height = dim.getHeight();
        setVisible(true);
        setLocation(0,0);
        setSize(dim);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setTitle("X-Solutyons");
        this.setResizable(true);
        
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("showimage.png"));
        
        setIconImage(icon);
        
        /*add(menuno = new MenuUno(this.getWidth(), this.getHeight() / 2));
        
        bar = new BarraBaja(0, this.getHeight() / 2, this.getWidth(), this.getHeight());
        
        add(bar);*/
        
    }
    public Dimension getDimension(){
        
        return dim;
        
    }
    @Override
    public int getWidth(){
        
        return (int)width;
        
    }
    @Override
    public int getHeight(){
        
        return (int)height;
        
    }
    
}
