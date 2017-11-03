/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo;

import java.util.GregorianCalendar;

/**
 *
 * @author Vaney
 */
public class Gerente extends Empleado {
    
    public String placaVehicCorpo;
    public double bonoProduc;

    public Gerente(String placaVehicCorpo, double bonoProduc, String nombre, double sueldo, GregorianCalendar fechaIngreso, String departamento) {
        super(nombre, sueldo, fechaIngreso, departamento);
        this.placaVehicCorpo = placaVehicCorpo;
        this.bonoProduc = bonoProduc;
    }
    
    /**
     * *
     * @return Sobreescribiendo el metodo getDetalles de la clase Padre Empleado... 
     */
    @Override 
    public String getDetalles(){
        String Detalles;
        Detalles=super.getDetalles();
        Detalles+=placaVehicCorpo+" "+bonoProduc+"\n";
        return Detalles;
    
    }
    
}
