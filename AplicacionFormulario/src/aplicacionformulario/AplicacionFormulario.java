package aplicacionformulario;

 // @author fafev

public class AplicacionFormulario {

   
    public static void main(String[] args) {
        FormularioInicial fi= new FormularioInicial();
        
        fi.setVisible(true);
      // fi.setLocation(350, 300);
        fi.setLocationRelativeTo(null);  // para ubicar la ventana en el centro de la pantalla 
        Menu me=new Menu();
        
        
    }

}
