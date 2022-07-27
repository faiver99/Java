package arreglos;

 // @author fafev
import java.util.Scanner;



public class Arreglos {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int sumarpares = 0;
        int sumarimpares = 0;
        int dimension;
        int[] arreglo;

        System.out.println("Digite la cantidad de datos que desea ingresar ");
        dimension = entrada.nextInt();

        arreglo = new int[dimension];

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("DIgite un numero ");
            arreglo[i] = entrada.nextInt();

            if (arreglo[i] % 2 == 0) {
                sumarpares = sumarpares + arreglo[i];
                
            } else {
                sumarimpares = sumarimpares + arreglo[i];
            }

        }

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + "\t");
        }
        
        System.out.println("");

        System.out.println("la suma de los numeros pares es " + sumarpares);
        System.out.println("la suma de los numeros impares es " + sumarimpares);

    }

}
