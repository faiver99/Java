
package reto3;

import java.util.Random;

public class Asistente {
    protected String idTiquete;
    protected String nombreCompleto;
    protected String direccionResidencia;
    protected String credenciales;

    public Asistente(String idTiquete, String nombreCompleto, String direccionResidencia) {
        this.idTiquete = idTiquete;
        this.nombreCompleto = nombreCompleto;
        this.direccionResidencia = direccionResidencia;
        this.credenciales = "";
    }
    
    
    
    public void generarCredenciales(){
        
        if (credenciales.isEmpty()) {
            Random num=new Random();
            int x= num.nextInt(1000000);
            String credencial=String.valueOf(x);
            credenciales=credencialPrevia;
            
        }
       
        
        
         
            
        
    }

    public String getIdTiquete() {
        return idTiquete;
    }

    public void setIdTiquete(String idTiquete) {
        this.idTiquete = idTiquete;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDireccionResidencia() {
        return direccionResidencia;
    }

    public void setDireccionResidencia(String direccionResidencia) {
        this.direccionResidencia = direccionResidencia;
    }

    public String getCredenciales() {
        return credenciales;
    }

    public void setCredenciales(String credenciales) {
        this.credenciales = credenciales;
    }
    
    
}
