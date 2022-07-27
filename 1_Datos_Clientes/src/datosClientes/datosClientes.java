package datosClientes;

 // @author fafev
import java.util.Scanner;



public class datosClientes {

   
    public static void main(String[] args) {
        
        
        String nombre,apellido,correo,telefono;
        
        
        Scanner cap = new Scanner(System.in);
        System.out.println("Ingresa tu nombres");
        nombre=cap.next();
        System.out.println("Ingrese su apellido");
        apellido=cap.next();
        System.out.println("Ingrese su correo");
        correo=cap.next();
        System.out.println("Ingrese su numero de telefono");
        telefono=cap.next();
        
        System.out.println("Su nombre es: "+ nombre);
        System.out.println("Su apellido es: "+ apellido);
        System.out.println("Su correo es: "+ correo);
        System.out.println("Su telefono es: "+ telefono);
        
    }

}
