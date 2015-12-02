package xsolutionsx;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Datos {
    ArrayList<Usuario> users = new ArrayList<>();
    ArrayList<Usuario> datosNuevos() {
        try{
            ObjectInputStream dats = new ObjectInputStream(new FileInputStream("datitos.dat"));
            this.users = (ArrayList<Usuario>)dats.readObject();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Bienvenido a X-SolutYons");
        }
        return users;
    }
    
    
}
