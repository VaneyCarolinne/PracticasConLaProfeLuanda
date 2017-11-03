
package trabajo;

import java.util.GregorianCalendar;


/**
 *
 * @author Vaney
 */
public class DemoInstanceOf {
    
     public static void main(String[] args){
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.set(2017, 10, 3);
        Empleado miEmpleado = new Empleado("Vanessa", 400.87, calendar, "Sistemas");
        Gerente miGerente = new Gerente("AAEE02", 215000, "CHEO", 8000000, calendar, "Sistemas");
        Empleado polimorfismo = new Gerente("AAAEER4", 89923, "Susana", 7000, calendar, "Sistemas");
        
        System.out.println("miEmpleado: \n"+miEmpleado.getDetalles());
        System.out.println("miGerente: \n"+miGerente.getDetalles());
        System.out.println("polimorfismo: \n"+polimorfismo.getDetalles());
     
     
     }
    
}
