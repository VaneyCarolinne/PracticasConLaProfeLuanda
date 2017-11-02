/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculos;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

/**
 *
 * @author VaneyCaroline
 */
public class Calculadora {
    
/**
 * *
 * @param a número de tipo double para realizar la operación
 * @param b número de tipo double para realizar la operación
 * @return: El resultado según la operación que especifique el método que llame. 
 */    
    //Operaciones que puede realizar la Calculadora    
    public double sumar(double a, double b){ return a + b;}
    public double restar(double a, double b){ return a - b;}
    public double multiplicar(double a, double b){ return a * b;}
    public double dividir(double a, double b){
        double division;
        try{
          division=a/b; //Devuelve el valor de la división...
        }catch(Exception e){
           division=Double.MAX_VALUE; //Devuelve infinito...
        }
        return division;    
    }
    public double valorAbsoluto(double a){ return abs(a);}
    public double raizCuadrada(double a){ return sqrt(a);}
}
