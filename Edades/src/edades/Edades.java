package edades;

import java.util.Scanner;

public class Edades {

    public static void main(String[] args) {
        /* 0 a 5 niños pequeños
        6 a 12 niños grandes
        13 a 17 adolecentes 
        18 a 65 adultos 
        66 a 100 adultos mayores 
         */
        
        String op="si";
        while (op.equals("si")){
                

        Scanner opc = new Scanner(System.in);
        int edad;
        System.out.println("Ingrese su edad: ");
        edad = opc.nextInt();
        if (edad >= 0) {
            if (edad > 0 && edad <= 5) {
                System.out.println("Es un niño pequeño");
            } else if (edad <= 12) {
                System.out.println("Es un niño grande");

            } else if (edad <= 17) {
                System.out.println("Es un adolecente");

            } else if (edad <= 65) {
                System.out.println("Es un adulto");

            } else if (edad <= 100) {
                System.out.println("Es un adulto mayor");
            } else {
                System.out.println("Usted ingreso una edad fuera de rango el rango es de 0 a 100 años");

            }
        }
        else{
            System.out.println("Digito una edad negativa");
        } 
        
        System.out.println("si desea ingresar mas info dijite si de lo contrario dijite no");
        op=opc.next() ;  
      }
            
    }

}
                            