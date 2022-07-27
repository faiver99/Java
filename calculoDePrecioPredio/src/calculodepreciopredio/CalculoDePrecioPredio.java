package calculodepreciopredio;

 // @author fafev
import java.util.Scanner;




public class CalculoDePrecioPredio {

   
    public static void main(String[] args) {
        Scanner cap = new Scanner(System.in);
        System.out.println("Ingrese el precio por metro cuadrado");
        int precio=cap.nextInt();
        System.out.println("Ingrese el largo de el predio");
        int largo=cap.nextInt();
        System.out.println("Ingrese el ancho de el predio");
        int ancho=cap.nextInt();
        
        int costo=(ancho*largo)*precio;
        System.out.println("El valor del predio es de "+ costo);
    }

}
