package ejeercicio1;

import java.util.Scanner;

public class EJEERCICIO1 {

    public static void main(String[] args) {
        Scanner cap = new Scanner(System.in);
        int horas, minutos;
        var valor = 1500;

        System.out.println("Digite la cantidad de horas : ");
        horas = cap.nextInt();
        System.out.println("Digite la cantidad de minutos entre 0    y 60: ");
        minutos = cap.nextInt();
        if (minutos > 0) {
            horas = horas + 1;

        }
        int total = valor * horas;
        System.out.println("Usted debe pagar"+" "+ horas +" "+ "horas y el total a pagar es"+" "+ + total);
    }

}
