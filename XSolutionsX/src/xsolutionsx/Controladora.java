/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xsolutionsx;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author AlbertoReyes
 */
public class Controladora implements ActionListener{
    
    private ArrayList <Usuario> user;
    
    public Controladora(){
        
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        JOptionPane.showMessageDialog(null, e);
        
    }
    
}
