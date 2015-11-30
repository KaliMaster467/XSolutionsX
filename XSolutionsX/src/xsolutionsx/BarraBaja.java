package xsolutionsx;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AlbertoReyes
 */
public class BarraBaja extends JPanel{
        
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
            des.setText("La mejor Graficadora de este mundo.");
            
            add(des);
            
        }
        public void paint(Graphics g){
            
            Dimension tam = getSize();
            imagelap = new ImageIcon(getClass().getResource("alumnosjpg.jpg"));           
            
            g.drawImage(imagelap.getImage(), 0, 0, tam.width, tam.height, null);
            setOpaque(false);
            super.paint(g);
            
        }
        /*public int getWidth(){
            
            return (int) width;
            
        }
        public int getHeight(){
            
            return (int) height;
            
        }*/
        
    }
