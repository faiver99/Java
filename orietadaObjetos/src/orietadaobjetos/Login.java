
package orietadaobjetos;


public class Login {
    private String usuario;
    private String clave;
    private String rol;
    
    public Login(){ // METODO CONSTRUCTOR
        
    }
    
    public Login(String usuario,String clave,String rol){ // METODO CONSTRUCTOR
        this.usuario=usuario;
        this.clave=clave;
        this.rol=rol;
        
    } 

    public String getUsuario() {
        return usuario;
    }

    public String getClave() {
        return clave;
    }

    public String getRol() {
        return rol;
    }
    
    
    
}
