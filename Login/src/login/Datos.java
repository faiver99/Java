package login;

public class Datos {

    public boolean datosLogin(String usuario ,String clave) {
        boolean x = false;
        if (usuario.equals("pepe") && clave.equals("1234")) {
            
            x=true;
        }
        
        
        return x;

    }

}
