/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xsolutionsx;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Bugatti
 */
public class MenuUno extends JPanel{
    
    public static JTextField userReturned;
    public static JPasswordField passReturned;
    private JLabel usuario;
    private JLabel contraseña;
    private JLabel imag;
    private int width;
    private int height;
    private static Font fuente;
    private Controladora cont;
    private JButton iniciar;
    private JButton registrarse;
        
    public MenuUno(int width, int height) throws IOException{
        
        fuente = new Font("Verdana", Font.PLAIN, 15);
        
        cont = new Controladora();
        
        this.width = width;
        this.height = height;
        
        //Caracteristicas de la ventana
        
        setBackground(Color.WHITE);
        setVisible(true);
        setLayout(null);
        setLocation(0,0);
        setSize(width, height);
        
        //Crea la zona de texto para el usuario
        
        userReturned = new JTextField();
        userReturned.setVisible(true);
        userReturned.setLayout(null);
        userReturned.setSize(200, 30);
        userReturned.setLocation(200, this.getHeight() /3 );
        userReturned.setFont(fuente);
        
        add(userReturned);
        
        //crea la etiqueta
        
        usuario = new JLabel();
        usuario.setVisible(true);
        usuario.setLayout(null);
        usuario.setLocation(100, this.getHeight() /3 );
        usuario.setSize(200, 25);
        usuario.setText("Usuario: ");
        usuario.setFont(fuente);
        usuario.setForeground(Color.BLACK);
                
        add(usuario);
        
        //Crea el area de texto para la contraseña
        
        passReturned = new JPasswordField();
        passReturned.setVisible(true);
        passReturned.setLayout(null);
        passReturned.setSize(200, 30);
        passReturned.setLocation(200, 200);
        
        add(passReturned);
        
        //Crea la etiqueta para la contraseña
        
        contraseña = new JLabel();
        contraseña.setText("Contraseña: ");
        contraseña.setVisible(true);
        contraseña.setLayout(null);
        contraseña.setFont(fuente);
        contraseña.setLocation(100, 200);
        contraseña.setSize(200, 30);
        contraseña.setForeground(Color.BLACK);
        
        add(contraseña);
        
        //Crea el boton de inicio
        
        iniciar = new JButton("Iniciar");
        iniciar.setVisible(true);
        iniciar.setLayout(null);
        iniciar.addActionListener(cont);
        iniciar.setText("Iniciar");
        iniciar.setLocation(100, 280);
        iniciar.setSize(100, 30);
        
        add(iniciar);
        
        //Crea el boton de registro
        
        registrarse = new JButton("Registro");
        registrarse.setVisible(true);
        registrarse.setLayout(null);
        registrarse.addActionListener(cont);
        registrarse.setLocation(300, 280);
        registrarse.setSize(100, 30);
        
        add(registrarse);
        
         
        BufferedImage wPic = ImageIO.read(this.getClass().getResource("showimage.png"));
        
        JLabel wIcon = new JLabel(new ImageIcon(wPic));
        
        wIcon.setLocation(900, 120);
        wIcon.setSize(wPic.getWidth(), wPic.getHeight());
        wIcon.setVisible(true);
        wIcon.setLayout(null);
        wIcon.setToolTipText("La mejor graficadora papu");
        
        add(wIcon);
  
    }
    
    public int getWidth(){
        
        return width;
        
    }
    public int getHeight(){
        
        return height;
        
    }
    public Font getFont(){
        
        return fuente;
        
    }
    public String getUserText(){
        
        return userReturned.getText();
        
    }
    public String getUserPass(){
        
        return contraseña.getText();
        
    }


    
}
