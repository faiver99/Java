
package reproductor;


public class ReproductorMusica {
    //ATRIBUTOS
    private String Canciones[];
    private int CancionesFavoritas[];
    private boolean Pausado=true;
    private int CancionReproduciendo=0;
    
    public ReproductorMusica(){
        
    }
    
    
    //MÉTODOS
    public ReproductorMusica(String[] Canciones) {
        //COMPLETE AQUÍ LA LÓGICA DEL CONSTRUCTOR SEGÚN EL ENUNCIADO
        this.Canciones= Canciones;
        this.CancionesFavoritas= new int[Canciones.length];
        //        System.out.println(Canciones.length);
        for (int i = 0; i < CancionesFavoritas.length; i++) {
            CancionesFavoritas[i]=-1;
            
            
        }
//        for (int elemetos:CancionesFavoritas) {
//            System.out.println(elemetos);
//        }
    }
    
    public void proximaCancion(){
        //COMPLETE AQUÍ LA LÓGICA DE ESTE MÉTODO SEGÚN EL ENUNCIADO
        CancionReproduciendo=(CancionReproduciendo+1)%Canciones.length;
        
    }
    
    public void devolverCancion(){
        //COMPLETE AQUÍ LA LÓGICA DE ESTE MÉTODO SEGÚN EL ENUNCIADO
        CancionReproduciendo=(CancionReproduciendo+Canciones.length-1)%Canciones.length;
    }
   
    public void cambiarEstadoReproduccion(){
        //COMPLETE AQUÍ LA LÓGICA DE ESTE MÉTODO SEGÚN EL ENUNCIADO
        if (Pausado) {
            Pausado=false;
             
        }
        else if (Pausado==false) {
            Pausado=true;
           
        }
 
           
    }
   
    //NO SE DEBE PREOCUPAR POR DESARROLLAR ESTE MÉTODO. ¡NO ELIMINARLO NI MODIFICARLO!
    public void agregarCancionesFavoritas(){
        for(int i = 0; i < CancionesFavoritas.length; i++)
            /*En caso de que encuentre que cancionReproduciendo está en el banco de cancionesFavoritas
            no seguimos buscando espacio libre para agregarla, y salimos del método*/
            if(CancionesFavoritas[i] == CancionReproduciendo)
                return;
            //Pero si no la encontró, y además encuentra un espacio donde añadirlo, lo hace
            else if(CancionesFavoritas[i] == -1){
                CancionesFavoritas[i] = CancionReproduciendo;
                return;
            }                
    }

    public String[] getCanciones() {
        //COMPLETE AQUÍ EL GETTER CORRESPONDIENTE
        return Canciones;
    }

    public void setCanciones(String[] canciones) {
        //COMPLETE AQUÍ EL SETTER CORRESPONDIENTE
        
    }

    public int[] getCancionesFavoritas() {
        //COMPLETE AQUÍ EL GETTER CORRESPONDIENTE
        
        return CancionesFavoritas;
    }

    public void setCancionesFavoritas(int[] cancionesFavoritas) {
        //COMPLETE AQUÍ EL SETTER CORRESPONDIENTE
    }

    public boolean isPausado() {
        //COMPLETE AQUÍ EL GETTER CORRESPONDIENTE
        return Pausado;
    }

    public void setPausado(boolean pausado) {
        //COMPLETE AQUÍ EL SETTER CORRESPONDIENTE
    }

    public int getCancionReproduciendo() {
        //COMPLETE AQUÍ EL GETTER CORRESPONDIENTE
        return CancionReproduciendo;
    }

    public void setCancionReproduciendo(int cancionReproduciendo) {
        //COMPLETE AQUÍ EL SETTER CORRESPONDIENTE
    }
    
   
}
