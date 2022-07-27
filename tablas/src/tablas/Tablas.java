package tablas;

// @author fafev
import java.util.Scanner;

public class Tablas {

    public static void main(String[] args) {
        Scanner cap = new Scanner(System.in);
        int tablai, tablaf, inicial, fin, res;
        System.out.println("Digite la tabla que desea calcular");
        tablai = cap.nextInt();
        System.out.println("Digite la ultima tabla que desea calcular");
        tablaf = cap.nextInt();
        System.out.println("Digite desde que numero quiere iniciar su tabla");
        inicial = cap.nextInt();
        System.out.println("Digite el numero final hasta donde quiere multiplicar su tabla");
        fin = cap.nextInt();
        while (tablai <= tablaf) {
            int aux=inicial;
            while (aux <= fin) {
                res = tablai * aux;
                System.out.println(tablai + "x" + aux + "=" + res);
                aux = aux + 1;
            }
            tablai=tablai+1;
            System.out.println("");
        }

    }

}
