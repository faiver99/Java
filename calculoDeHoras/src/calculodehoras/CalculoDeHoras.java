package calculodehoras;

 // @author fafev
import java.util.Scanner;



public class CalculoDeHoras {

   
    public static void main(String[] args) {
        Scanner cap = new Scanner(System.in);
        int horas;
        System.out.println("Ingrese el numero de horas");
        horas=cap.nextInt();
        
        float dias=horas/24f;
        float minutos=horas*60;
        float segundos=minutos*60;
        
        System.out.println("Las horas ingresadas quivales a: ");
        System.out.println(dias+" Dias "+minutos+" Minutos "+segundos+" Segundos");
        
        
                
    }

}
