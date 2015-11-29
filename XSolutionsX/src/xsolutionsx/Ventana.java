/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xsolutionsx;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
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
        
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("showimage.png"));
        
        setIconImage(icon);
        
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
        private ImageIcon imagelap;
        
        public BarraBaja(int x, int y, int width, int height) throws IOException{
            
            setVisible(true);
            setLayout(null);
            setBackground(Color.DARK_GRAY);
            setLocation(x, y);
            setSize(width, height);
            
            //BufferedImage pic = ImageIO.read(this.getClass().getResource("imageslap.jpeg"));
            
           // setBackground(pic);
            
            des = new JLabel();
            des.setVisible(true);
            des.setLayout(null);
            des.setLocation(100, 2);
            des.setSize(width, 200);
            des.setFont(new Font("Verdana", Font.PLAIN, 30));
            des.setForeground(Color.WHITE);
            des.setText("La mejor Graficadora de este mundo");
            
            add(des);
            
        }
        public void paint(Graphics g){
            
            Dimension tam = getSize();
            imagelap = new ImageIcon(getClass().getResource("alumnosjpg.jpg"));           
            
            g.drawImage(imagelap.getImage(), 0, 0, tam.width, tam.height, null);
            setOpaque(false);
            super.paint(g);
            
        }
        public int getWidth(){
            
            return (int) width;
            
        }
        public int getHeight(){
            
            return (int) height;
            
        }
        
    }
    
}
