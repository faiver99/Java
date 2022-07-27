package CicloFor;


import java.util.Scanner;

public class CicloFor {

    public static void main(String[] args) {
        Scanner cap = new Scanner(System.in);
        int tablai, tablaf, inicio, fin;
        System.out.println("Ingrese la tabla inicial");
        tablai = cap.nextInt();
        System.out.println("Ingrese la tabla final");
        tablaf = cap.nextInt();
        System.out.println("Ingrese el incio de la tabla");
        inicio = cap.nextInt();
        System.out.println("Ingrese el final de la tabla");
        fin = cap.nextInt();

        for (int i = tablai; i <= tablaf; i++) {

            for (int j = inicio; j <= fin; j++) {

                int resultado = tablai * j;

                System.out.println(tablai + "*" + i + "=" + resultado);

            }

        }
    }

}

                                                  