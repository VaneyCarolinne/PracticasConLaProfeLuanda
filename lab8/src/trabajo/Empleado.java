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
public class Empleado {
    public String nombre;
    public double sueldo;
    public GregorianCalendar fechaIngreso;
    public String departamento;
    
    
    

    public Empleado(String nombre, double sueldo, GregorianCalendar fechaIngreso, String departamento) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.fechaIngreso = fechaIngreso;
        this.departamento = departamento;
    }
    
    public String getDetalles(){
        String Detalles, fecha;
        fecha=fechaIngreso.getTime().toString();
        Detalles = nombre+" "+sueldo+" "+fecha+" "+departamento+"\n";
        return Detalles;
    }
    
    
    
}
