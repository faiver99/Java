package datoenarreglo;

// @author fafev
import java.util.Scanner;

public class DatoEnArreglo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dimension, buscador;
        int[] arreglo;

        System.out.println("Digite la cantidad de datos que desea ingresar ");
        dimension = entrada.nextInt();

        arreglo = new int[dimension];

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("DIgite un numero ");
            arreglo[i] = entrada.nextInt();

        }
        System.out.println("Digite el dato a buscar ");
        buscador = entrada.nextInt();
        boolean ok = false;

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == buscador) {
                System.out.println("El dato fue encontredo en la posicion  " + i);
                ok = true;
                break;

            } 
        }
        
        if (ok == false) {
                System.out.println("El valor buscado " + buscador + " no fue encontrado ");
                
                
        }       

    }
}