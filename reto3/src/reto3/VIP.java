
package reto3;

import java.util.Random;


public class VIP extends Asistente{
    private boolean [] pantallas;
    private String credencialesPrevia="";

    public VIP(String idTiquete, String nombreCompleto, String direccionResidencia) {
        super(idTiquete, nombreCompleto, direccionResidencia);
        this.pantallas = new boolean[]{false,false,false};
    }
    
    
    
    
    
    public void generarCredencialesPrevia(){
        if (credencialesPrevia.isEmpty()) {
            Random num=new Random();
            int x= num.nextInt(1000000);
            String credencialPrevia=String.valueOf(x);
            credencialesPrevia=credencialPrevia;
            
        }
    }
    
    public void asignarPantalla(int pantalla) {
        

        if ((pantalla - 1) >= 1 && (pantalla - 1) <= 3) {
            if (this.pantallas[pantalla] == true) {
                this.pantallas[pantalla] = false;

            } else if ((pantalla - 1) >= 1 && (pantalla - 1) <= 3) {
                if (this.pantallas[pantalla] == false) {
                    this.pantallas[pantalla] = true;

                }

            }
        }
    }
    public boolean[] getPantallas() {
        return pantallas;
    }

    public void setPantallas(boolean[] pantallas) {
        this.pantallas = pantallas;
    }

    public String getCredencialesPrevia() {
        return credencialesPrevia;
    }

    public void setCredencialesPrevia(String credencialesPrevia) {
        this.credencialesPrevia = credencialesPrevia;
    }
    
    
       
}
