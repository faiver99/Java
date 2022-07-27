package reto4;

//LA IMPORTACIÓN SIGUIENTE ES
//NECESARIA PARA MANIPULAR EL
//PARÁMETRO DE ENTRADA DE SU
//PROPUESTA DE SOLUCIÓN. NO LA
//DESCARTE
import java.security.ProtectionDomain;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

    public static Object[] reporte(ArrayList<Corredor> carrera) {

        //ESCRIBA LA LÓGICA DE SU PROPUESTA
        //DE SOLUCIÓN. NO OLVIDE INDICAR EL
        //OBJETO QUE ESTA VA A RETORNAR
        double numeros = 0;
        double prom;
        double timeMin = Double.MAX_VALUE;
        double timeMax = Double.MIN_VALUE;
        String correMinTime = "";
        String correMaxTime = "";

        for (Corredor corredor : carrera) {
            numeros = numeros + corredor.getTiempoMeta();
            if (corredor.getTiempoMeta() < timeMin) {
                timeMin = corredor.getTiempoMeta();
                correMinTime = corredor.getNombreCompleto();

            }

            if (corredor.getTiempoMeta() > timeMax) {
                timeMax = corredor.getTiempoMeta();
                correMaxTime = corredor.getNombreCompleto();

            }

        }

        prom = numeros / carrera.size();
        
        Object[] salidas={prom,correMinTime,timeMin,correMaxTime,timeMax};
        return salidas;

    }
    
    public static void main (String[] args){
        ArrayList<Corredor> carrera = new ArrayList<>();
        carrera.add(new Corredor("Luis Gomez", "12", 1.68, 20, 22));
        carrera.add(new Corredor("Juan Corredor", "28", 1.75, 24, 21));
        carrera.add(new Corredor("Carlos Perez", "19", 1.71, 28, 24));
        carrera.add(new Corredor("Maria Cadavid", "13", 1.80, 32, 22));
        
        System.out.println(Arrays.toString(Solution.reporte(carrera)));
        
        
        
        
        
        print los que son mas impor tantes por caminar por lo que es necesario caminar por 
                
                
                if (var int comer) {
        ProtectionDomain 
                
                
                por los cual no es posible como lo cual son mas conocidos por lo cual no se p
        
            
        }
        
        

    
    }
}



