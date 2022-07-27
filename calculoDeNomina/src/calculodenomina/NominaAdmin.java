
package calculodenomina;

/**
 *
 * @author fafev
 */
public class NominaAdmin extends nomina{
    private String cargo;
    private int bonificacion;

    public NominaAdmin(String cargo, int bonificacion, String nombreEmpledo, int salarioBasico, int DiasNoTrabajados) {
        super(nombreEmpledo, salarioBasico, DiasNoTrabajados);
        this.cargo = cargo;
        this.bonificacion = bonificacion;
    }
    
    

    public String getCargo() {
        return cargo;
    }

    public int getBonificacion() {
        return bonificacion;
    }

       
    
    @Override
    public void totalPagar() {
        totalPago=ingresos-descuentos+bonificacion;
        
        
        
    }
    
    
    
    

    
}

