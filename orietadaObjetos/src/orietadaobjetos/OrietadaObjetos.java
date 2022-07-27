package orietadaobjetos;

 // @author fafev
import javax.swing.JOptionPane;



public class OrietadaObjetos {

   
    public static void main(String[] args) {
        String usuario;
        String clave;
        String rol;
        
        usuario=JOptionPane.showInputDialog("Digite su usuario");
        clave=JOptionPane.showInputDialog("Digite su clave");
        rol=JOptionPane.showInputDialog("Digite su rol");
        
        Login obj= new Login(usuario,clave,rol);
        if (obj.getUsuario().equals("pepe") && obj.getClave().equals("1234")) {
            if (obj.getRol().equals("cliente")) {
                System.out.println("usuario cliente ingreso corectamente");
                
            }
            
        }
        
    }

}
