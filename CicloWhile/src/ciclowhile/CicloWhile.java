package ciclowhile;

import java.util.Scanner;


public class CicloWhile {

    public static void main(String[] args) {
        Scanner info= new Scanner(System.in);
        String user;
        String contraseña;
        
        
        int x=1;
        
        while (x<=3){
            System.out.println("Ingrese su usuario");
            user=info.next();
            System.out.println("Ingrese su contraseña");
            contraseña=info.next();
            
            if (user.equals("faiver") && contraseña.equals("1234") ){
                System.out.println("Bienvenido al sistema ");
                x=5;
            }
            else{  
                x=x+1;
                int b=3;
               
                System.out.println("Usuario o contraseña incorecto, le quedan "+ (b=b-1) +
                "intentos");
                
            }
            
            if (x==4){
                System.out.println("Su cuenta ha sido bloqueada contactarse con el admin");
            }
        }  
        
    
    }
    
}
