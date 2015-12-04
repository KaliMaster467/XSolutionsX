/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xsolutionsx;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author AlbertoReyes
 */
public class Controladora implements ActionListener, ItemListener{
    int noCuenta = 0;
    Usuario user;
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        switch (e.getActionCommand()) {
            case "Iniciar":
                boolean enc = false;
                for(int i = 0;i<Manejador.pp.size();i++) {
                    if(Manejador.pp.get(i).getNombre().equals(MenuUno.userReturned.getText())) {
                        if(Manejador.pp.get(i).getClave().equals(MenuUno.passReturned.getText())) {
                            enc = true;
                            JOptionPane.showMessageDialog(null, "Bienvenido "+Manejador.pp.get(i).getNombre());
                            //SE INICIA LA GRAFICADORA
                            Graficadora graf = new Graficadora();
                            noCuenta=i;
                            
                            
                        }
                    }
                }
                if(enc == false) {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña invalidos");
                }
                break;
            case "Registro":
                Registro reg = new Registro();
                break;        
        }    
    }
    public int getNoCuenta() {
        return noCuenta;
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
}
    
