
package calculodenomina;


public class nomina {
    private String nombreEmpledo;
    private int  salarioBasico;
    private int horasExtrasDiurnas;
    private int horasExtrasNocturnas;
    private int horasExtrasFestivas;
    private int horasExtrasDominicales;
    private int DiasNoTrabajados;
    private float totalHorasExtras;
    protected float descuentos;
    protected float ingresos;
    protected float totalPago; 

    public nomina() {
    }

    
    
    public nomina(String nombreEmpledo, int salarioBasico, int horasExtrasDiurnas, int horasExtrasNocturnas, int horasExtrasFestivas, int horasExtrasDominicales, int DiasNoTrabajados) {
        this.nombreEmpledo = nombreEmpledo;
        this.salarioBasico = salarioBasico;
        this.horasExtrasDiurnas = horasExtrasDiurnas;
        this.horasExtrasNocturnas = horasExtrasNocturnas;
        this.horasExtrasFestivas = horasExtrasFestivas;
        this.horasExtrasDominicales = horasExtrasDominicales;
        this.DiasNoTrabajados = DiasNoTrabajados;
        
        
    }

    public nomina(String nombreEmpledo, int salarioBasico, int DiasNoTrabajados) {
        this.nombreEmpledo = nombreEmpledo;
        this.salarioBasico = salarioBasico;
        this.DiasNoTrabajados = DiasNoTrabajados;
    }

    
        
        
    
    // creacion de metodos para hacer los calculos de la nomina 
    
    public void ingresos(){
        ingresos=salarioBasico+totalHorasExtras;
        
        
    }
    
    public void totalHorasExtras(){
        float vht,vhed,vhen,vhef,vhedo;
        vht=salarioBasico/240;
        vhed=(vht*1.25f*horasExtrasDiurnas);
        vhen=vht*1.35f*horasExtrasNocturnas;
        vhef=vht*1.75f*horasExtrasFestivas;
        vhedo=vht*2*horasExtrasDominicales;
        totalHorasExtras=vhed+vhen+vhef+vhedo;
           
    }
    
    public void diasNoTrabajados(){
        float vd;
        vd=salarioBasico/30;
        descuentos=vd*DiasNoTrabajados;
    
        
    }
    
    public void TotalDescuentos(){
        float salud,pension;
        salud=(ingresos-(salarioBasico/30*DiasNoTrabajados))*0.04f;
        pension=(ingresos-(salarioBasico/30*DiasNoTrabajados))*0.04f;
        descuentos=salarioBasico/30*DiasNoTrabajados+salud+pension;
              
    }
    
    public void totalPagar(){
        totalPago=ingresos-descuentos;
        
    }
    
    
    

    public String getNombreEmpledo() {
        return nombreEmpledo;
    }

    public void setNombreEmpledo(String nombreEmpledo) {
        this.nombreEmpledo = nombreEmpledo;
    }

    public int getSalarioBasico() {
        return salarioBasico;
    }

    public void setSalarioBasico(int salarioBasico) {
        this.salarioBasico = salarioBasico;
    }

    public int getHorasExtrasDiurnas() {
        return horasExtrasDiurnas;
    }

    public void setHorasExtrasDiurnas(int horasExtrasDiurnas) {
        this.horasExtrasDiurnas = horasExtrasDiurnas;
    }

    public int getHorasExtrasNocturnas() {
        return horasExtrasNocturnas;
    }

    public void setHorasExtrasNocturnas(int horasExtrasNocturnas) {
        this.horasExtrasNocturnas = horasExtrasNocturnas;
    }

    public int getHorasExtrasFestivas() {
        return horasExtrasFestivas;
    }

    public void setHorasExtrasFestivas(int horasExtrasFestivas) {
        this.horasExtrasFestivas = horasExtrasFestivas;
    }

    public int getHorasExtrasDominicales() {
        return horasExtrasDominicales;
    }

    public void setHorasExtrasDominicales(int horasExtrasDominicales) {
        this.horasExtrasDominicales = horasExtrasDominicales;
    }

    public int getDiasNoTrabajados() {
        return DiasNoTrabajados;
    }

    public void setDiasNoTrabajados(int DiasNoTrabajados) {
        this.DiasNoTrabajados = DiasNoTrabajados;
    }

    public float getTotalHorasExtras() {
        return totalHorasExtras;
    }

    public void setTotalHorasExtras(float totalHorasExtras) {
        this.totalHorasExtras = totalHorasExtras;
    }

    public float getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(float descuentos) {
        this.descuentos = descuentos;
    }

    public float getIngresos() {
        return ingresos;
    }

    public void setIngresos(float ingresos) {
        this.ingresos = ingresos;
    }

    public float getTotalPago() {
        return totalPago;
    }

    public void setTotalPago(float totalPago) {
        this.totalPago = totalPago;
    }

    @Override
    public String toString() {
        return "nombreEmpledo=" + nombreEmpledo + "\n salarioBasico=" + salarioBasico + "\n horasExtrasDiurnas=" + horasExtrasDiurnas + "\n horasExtrasNocturnas=" + horasExtrasNocturnas + "\n horasExtrasFestivas=" + horasExtrasFestivas + "\n horasExtrasDominicales=" + horasExtrasDominicales + "\n DiasNoTrabajados=" + DiasNoTrabajados + "\n totalHorasExtras=" + totalHorasExtras + "\n descuentos=" + descuentos + "\n ingresos=" + ingresos + "\n totalPago=" + totalPago ;
    }

    
    
    
       
    
    
    
    
}
