/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xsolutionsx;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author AlbertoReyes
 */
public class Plano extends JPanel{
    
    public Plano(int ancho, int alto){
        
        setBackground(Color.WHITE);
        setVisible(true);
        setLayout(null);
        setSize(ancho, alto);
        setLocation(0, 0);
    }
    public void paintX(Graphics g){
        
        super.paintComponent(g);
        
        g.setColor(Color.red);
        g.fillRect(this.getWidth() / 2, 0, 3, this.getHeight());
        
    }
    public void paintY(Graphics g){
        
        super.paintComponent(g);
        
        g.setColor(Color.red);
        g.fillRect(0, this.getHeight() / 2, this.getWidth(), 3);
        
    }
    
}
