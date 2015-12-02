/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xsolutionsx;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author AlbertoReyes
 */
public class Controladora implements ActionListener{
    
    Usuario user;
    /*private ArrayList <Usuario> user;
    private Ventana vent;
    public static Plano plano;
    private MenuUno menuno;
    private BarraBaja bar;
    
    
    public Controladora() throws IOException{
        
        vent = new Ventana();
        
        menuno = new MenuUno(vent.getWidth(), vent.getHeight() / 2);
        
        vent.getContentPane().add(menuno);
        
        bar = new BarraBaja(0, vent.getHeight() / 2, vent.getWidth(), vent.getHeight());
        
        vent.getContentPane().add(bar);
        
    }*/
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        switch (e.getActionCommand()) {
            case "Iniciar":
                JOptionPane.showMessageDialog(null,"hola");
                break;
            case "Registro":
                Registro reg = new Registro();
                break;
            case "Registrar":
                if(Registro.contraseña.getText().equals(Registro.compCB.getText())) {
                    user = new Usuario();
                    user.setClave(Registro.contraseña.getText());
                    user.setGrupo(Registro.grup.getText());
                    user.setNombre(Registro.nombre.getText());
                    Manejador.pp.add(user);
                }
                
        }    
    }
        
}
    
