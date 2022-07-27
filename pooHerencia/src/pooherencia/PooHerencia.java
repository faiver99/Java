package pooherencia;

 // @author fafev

public class PooHerencia {

   
    public static void main(String[] args) {
        perro pr=new perro("snaucer", "largo", "macho", "canino", "concentrado", 12);
        
        pr.comer();
        System.out.println("Datos del perro "+ pr.toString());
    }

}
