
package pooherencia;

/**
 *
 * @author fafev
 */
public class perro extends animal{
    private String raza;
    private String tipoPelo;
    private String genero;

    public perro(String raza, String tipoPelo, String genero, String especie, String tipoDeAlimentacion, int edad) {
        super(especie, tipoDeAlimentacion, edad);
        this.raza = raza;
        this.tipoPelo = tipoPelo;
        this.genero = genero;
    }

    @Override // sobre escritura 
    
    public void comer(){
        super.comer();
        System.out.println("tres veces al dia");
         
    }

    @Override
    public String toString() {
        return "raza=" + raza + "\n tipoPelo=" + tipoPelo + "\n genero=" + genero ;
    }
    
    
        
    
    
    
}
