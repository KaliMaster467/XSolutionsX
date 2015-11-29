/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xsolutionsx;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

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
    
    public Ventana(){
        
        dim = super.getToolkit().getScreenSize();
        width = dim.getWidth();
        height = dim.getHeight();
        setVisible(true);
        setLocation(0,0);
        setSize(dim);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setTitle("X-Solutyons");
        
        add(menuno = new MenuUno(this.getWidth(), this.getHeight() / 2));
        
        bar = new BarraBaja(0, this.getHeight() / 2, this.getWidth(), this.getHeight());
        
        add(bar);
        
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
    private class BarraBaja extends JPanel{
        
        private final JLabel des;
        
        public BarraBaja(int x, int y, int width, int height){
            
            setVisible(true);
            setLayout(null);
            setBackground(Color.DARK_GRAY);
            setLocation(x, y);
            setSize(width, height);
            
            des = new JLabel();
            des.setVisible(true);
            des.setLayout(null);
            des.setLocation(100, 2);
            des.setSize(width, 200);
            des.setFont(new Font("Verdana", Font.PLAIN, 20));
            des.setForeground(Color.WHITE);
            des.setText("La mejor Graficadora de este mundo");
            
            add(des);
            
        }
        public int getWidth(){
            
            return (int) width;
            
        }
        public int getHeight(){
            
            return (int) height;
            
        }
        
    }
    
}