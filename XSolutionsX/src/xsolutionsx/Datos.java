package xsolutionsx;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Datos {
    public ArrayList<Usuario> users = new ArrayList<>();
    
    public Datos(){
        
        
    }
    
    public ArrayList<Usuario> datosNuevos() {
        try{
            ObjectInputStream dates = new ObjectInputStream(new FileInputStream("datos2.dat"));
            this.users = (ArrayList<Usuario>)dates.readObject();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Bienvenido a X-SolutYons");
        }
        return users;
    }
    
     void serializar(ArrayList<Usuario> ListaSeriar) {
         
        try{
            FileOutputStream out = new FileOutputStream("datos2.dat");
            ObjectOutputStream objOut = new ObjectOutputStream(out);
            objOut.writeObject(ListaSeriar);
            objOut.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    
}
