
package reto3;


public class Preferencial extends Asistente{
    
    private boolean participaSorteo=false;

    public Preferencial(String idTiquete, String nombreCompleto, String direccionResidencia) {
        super(idTiquete, nombreCompleto, direccionResidencia);
    }
    
    

    public boolean isParticipaSorteo() {
        return participaSorteo;
    }

    public void setParticipaSorteo(boolean participaSorteo) {
        this.participaSorteo = participaSorteo;
    }
    
    
    
    public  void participaSorteo(){
        
        if (participaSorteo) {
            participaSorteo=false;
            
        }else if (participaSorteo==false) {
            participaSorteo=true;
            
        }
        
    }
    
    

    
}
