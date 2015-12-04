/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xsolutionsx;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author DANY
 */
public class TablaRes extends JPanel implements ItemListener{
    JLabel X, Y, tabla;
    JComboBox tipoTabla;
    private Font fuente;
    Controladora cont = new Controladora();
    public TablaRes(int anchos, int altos, int ancho) {
        fuente = new Font("Verdana", Font.PLAIN, 15);
        
        setBackground(Color.GRAY);
        setVisible(true);
        setLayout(null);
        setLocation((ancho+1), 0);
        setSize(anchos, altos);
        
        tipoTabla = new JComboBox();
        tipoTabla.addItem("seleccione alguno");
        tipoTabla.addItem("Recta");
        tipoTabla.addItem("Parabola");
        tipoTabla.addItem("Elipse");
        tipoTabla.addItem("Hiperbole");
        tipoTabla.addItemListener(cont);
        tipoTabla.setBounds(100, 10, 200, 30);

        add(this.tipoTabla);
        
        tabla = new JLabel();
        tabla.setText("|                        TABLA                     |");
        tabla.setVisible(true);
        tabla.setLayout(null);
        tabla.setFont(fuente);
        tabla.setLocation(50, 50);
        tabla.setSize(500, 30);
        tabla.setForeground(Color.WHITE);
        
        add(tabla);
        
        X = new JLabel();
        X.setText("|            X            |");
        X.setVisible(true);
        X.setLayout(null);
        X.setFont(fuente);
        X.setLocation(50, 80);
        X.setSize(200, 30);
        X.setForeground(Color.WHITE);
        
        add(X);
        Y = new JLabel();
        Y.setText("|            Y           |");
        Y.setVisible(true);
        Y.setLayout(null);
        Y.setFont(fuente);
        Y.setLocation(200, 80);
        Y.setSize(200, 30);
        Y.setForeground(Color.WHITE);
        
        add(Y);
        
        setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
