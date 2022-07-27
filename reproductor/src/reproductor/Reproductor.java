package reproductor;

 // @author fafev

public class Reproductor {

   
    public static void main(String[] args) {
        // TODO ACA
        
        
        String [] Canciones = new String [] {"Mil horas","Por ese hombre","A esa","Algo de mi",
            "Si me dejas ahora","¿Quieres ser mi amante?","Quel sorriso in volto","Per una notte insieme",
            "Como un pintor","Sencillamente","Un segundo","Enciéndeme","Cuando me enamoro","Tu eres mi tesoro",
            "Piccola anima","Solo a ti pertenezco","Todos por todos"
        };
                
        ReproductorMusica ventana1 =new ReproductorMusica(Canciones);
        
           //Screenshot 2
        ventana1.devolverCancion();
        ventana1.devolverCancion();
        ventana1.devolverCancion();
        ventana1.devolverCancion();    
        //Screenshot 3
        ventana1.agregarCancionesFavoritas();
        ventana1.proximaCancion();
        ventana1.agregarCancionesFavoritas();
        ventana1.devolverCancion();
        ventana1.agregarCancionesFavoritas();
        //Screenshot 4
        ventana1.cambiarEstadoReproduccion();
        ventana1.cambiarEstadoReproduccion();
        ventana1.cambiarEstadoReproduccion();
        ventana1.cambiarEstadoReproduccion();
        ventana1.cambiarEstadoReproduccion();        


    }

}
