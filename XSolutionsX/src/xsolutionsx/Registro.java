
package xsolutionsx;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Registro extends JFrame{
    static JTextField nombre,grup;
    static JPasswordField contraseña, compCB;
    JLabel nombresito,contra, compCont, grupo;
    JButton Registrar;
    Controladora cont = new Controladora();
   public Registro () {
       setLayout(null);
       
        setTitle("Registrarse :v");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(1500, 300, 500, 400);
        
        nombresito = new JLabel ("Nombre: ");
        nombresito.setBounds(50, 50, 150, 30);
        add(nombresito);
                
        nombre = new JTextField();
        nombre.setBounds (250,50,200,30 );
        nombre.setEnabled(true);
        add(nombre);
        
        grup = new JTextField();
        grup.setBounds(250, 100, 200,30);
        grup.setEnabled(true);
        add(grup);
        
        grupo = new JLabel("Grupo: ");
        grupo.setBounds(50, 100, 150, 30);
        add(grupo);
        
        contra = new JLabel ("Contraseña:");
        contra.setBounds(50,150 , 150, 30);
        add(contra);
        
        contraseña = new JPasswordField();
        contraseña.setBounds(250, 150, 200,30);
        contraseña.setEnabled(true);
        add (contraseña);
        
        compCB = new JPasswordField();
        compCB.setBounds(250, 200, 200, 30);
        compCB.setEnabled(true);
        add(compCB);
        
        compCont = new JLabel("Comprobar Contraseña:");
        compCont.setBounds(50, 200, 150, 30);
        add(compCont);
        
        Registrar = new JButton ("Registrar");
        Registrar.setBounds(50, 250, 150, 30);
        Registrar.addActionListener(cont);
        Registrar.setEnabled(true);
        add(Registrar);
        
        
        setVisible(true);
   }
    
    
}
