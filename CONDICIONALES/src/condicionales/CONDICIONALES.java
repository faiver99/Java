package condicionales;

import java.util.Scanner;

public class CONDICIONALES {

    public static void main(String[] args) {
        Scanner cap = new Scanner(System.in);
        int edad;
        System.out.println("Digite su edad : ");
        edad=cap.nextInt();
            if (edad>0 && edad<18) {
                System.out.println("Usted es menor de edad");
            }
            else{
                System.out.println("Usted es mayor de edad");
            }
            
            
          
    }
    
}
