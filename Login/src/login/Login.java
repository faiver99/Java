package login;

// @author fafev
import javax.swing.JOptionPane;

public class Login {

    public static void main(String[] args) {
        Datos obj = new Datos();
        String usu, cla;
        usu = JOptionPane.showInputDialog("Digite su usuario");
        cla = JOptionPane.showInputDialog("Digite su clave");

        boolean y;
        y = obj.datosLogin(usu, cla);
        if (y == true) {
            JOptionPane.showMessageDialog(null, "Bienvenido al sistemas");

        } 
        else {
            JOptionPane.showMessageDialog(null, "Su usuario o contraseña son incorectos");

        }

    }

}
