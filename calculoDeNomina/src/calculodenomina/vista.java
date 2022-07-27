package calculodenomina;

import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

public class vista {

    private String nombreEmpledo;
    private int salarioBasico;
    private int horasExtrasDiurnas;
    private int horasExtrasNocturnas;
    private int horasExtrasFestivas;
    private int horasExtrasDominicales;
    private int DiasNoTrabajados;
    private String cargo;
    private int bonificacion;



    public void datos() {
        cargo = JOptionPane.showInputDialog("Ingrese el cargo");
        if (cargo.equals("ope")) {
            nombreEmpledo = JOptionPane.showInputDialog("Digite el nonbre del empleado");
            salarioBasico = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su salario"));
            horasExtrasDiurnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas diurnas"));
            horasExtrasNocturnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas nocturnas"));
            horasExtrasFestivas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de horas festivas"));
            horasExtrasDominicales = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de horasa dominicales"));
            DiasNoTrabajados = Integer.parseInt(JOptionPane.showInputDialog("Digite numero de dias no trabajados"));

            nomina nm = new nomina(nombreEmpledo, salarioBasico, horasExtrasDiurnas, horasExtrasNocturnas, horasExtrasFestivas, horasExtrasDominicales, DiasNoTrabajados);

            nm.totalHorasExtras();
            nm.ingresos();
            nm.diasNoTrabajados();
            nm.TotalDescuentos();
            nm.totalPagar();
            System.out.println(nm.toString());

        } else if (cargo.equals("admin")) {
            nombreEmpledo = JOptionPane.showInputDialog("Digite el nonbre del empleado");
            cargo = JOptionPane.showInputDialog("Ingrese el cargo");
            salarioBasico = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su salario"));
            bonificacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la bonificacion"));

            NominaAdmin nadmin = new NominaAdmin(cargo, bonificacion, nombreEmpledo, salarioBasico, DiasNoTrabajados);

            nadmin.diasNoTrabajados();
            nadmin.ingresos();
            nadmin.TotalDescuentos();
            nadmin.totalPagar();
            System.out.println("nombre "+ nadmin.getNombreEmpledo());
            System.out.println("cargo " + nadmin.getCargo());
            System.out.println("bonificacion "+ nadmin.getBonificacion());
            System.out.println("salario " + nadmin.getSalarioBasico());
            System.out.println("descuento " + nadmin.getDescuentos());
            System.out.println("total pago "+ nadmin.getTotalPago());
            

        }

    }
}
