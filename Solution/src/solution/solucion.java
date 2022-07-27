
package solution;


public class solucion {
    
    public static int[] reporte( ){
        int[] participantes ={12,23,45,78,78,25};
        int timeMax = paticipantes[i], timeMin = participantes[i], numPar = 0;
        numPar = participantes.length;

        for (int i = 0; i <= participantes.length; i++) {

            if (participantes[i] > timeMax) {
                timeMax = participantes[i];

            }
            if (participantes[i] < timeMin) {
                timeMin = participantes[i];

            }

        }
        int[] arreglo = {numPar, timeMin, timeMax};
        return arreglo;
    } 
}
