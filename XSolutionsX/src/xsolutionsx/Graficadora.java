/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xsolutionsx;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author Alumno
 */
public class Graficadora extends JFrame{
    protected Dimension dim;
    protected double width;
    protected double height;
    Plano plano;
    TablaRes tablaRes;
    
    public Graficadora() {
        dim = super.getToolkit().getScreenSize();
        width = dim.getWidth();
        height = dim.getHeight();
        
        setLocation(0,0);
        setSize(dim);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(true);
        
        setTitle("X-Solutyons");
        int anchoPlano =(int)Math.floor(width*.7);
        int altoPlano = (int)Math.floor(height*.7);
        plano = new Plano(anchoPlano, altoPlano);
        this.setResizable(true);
        add(plano);
        int anchoTabla = (int)Math.floor(width*.3);
        tablaRes = new TablaRes(anchoTabla, altoPlano, anchoPlano);
        add(tablaRes);
        
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("showimage.png"));
        
        setIconImage(icon);
        setVisible(true);
    }
}
