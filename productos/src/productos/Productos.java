package productos;

// @author fafev
import java.util.Scanner;

public class Productos {

    public static void main(String[] args) {
        String producto, cont;
        int total, precio = 0;

        cont = "si";
        total = 0;
        producto = "";
        while (cont.equals("si")) {
            Scanner cap = new Scanner(System.in);
            System.out.println("Ingrese el nombre del producto");
            producto = cap.next();
            System.out.println("Ingrese el presio del producto");
            precio = cap.nextInt();
            total = precio + total;
            System.out.println("El producto " + producto+":" + precio);
            

            System.out.println("Desea añadir mas productos si o no");
            cont = cap.next();
        }
        
        System.out.println("El total a pagar es:" + total);

    }

}
