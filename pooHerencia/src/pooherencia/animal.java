
package pooherencia;

/**
 *
 * @author fafev
 */
public class animal {

    
protected String especie;
protected String tipoDeAlimentacion;
protected int edad;

    public animal(String especie, String tipoDeAlimentacion, int edad) {
        this.especie = especie;
        this.tipoDeAlimentacion = tipoDeAlimentacion;
        this.edad = edad;
    }

    
    public void comer(){
        System.out.print("se alimenta ");
        
    }
    public String getEspecie() {
        return especie;
    }

    public String getTipoDeAlimentacion() {
        return tipoDeAlimentacion;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "especie=" + especie + "\n tipoDeAlimentacion=" + tipoDeAlimentacion + "\n edad=" + edad ;
    }
    
    




}
