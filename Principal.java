/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculos;
import java.util.Scanner;
/**
 *
 * @author VaneyCaroline
 */
public class Principal {
    
    public static void main(String[] args){
        Calculadora vanessa = new Calculadora();
        Scanner entrada;
        Double a, b;
        int opc;
        
        entrada = new Scanner(System.in);
        System.out.println("Ingrese dos números: ");
        a=entrada.nextDouble();
        b=entrada.nextDouble();
        
        do{
            System.out.println("Ingrese la Opción de la operación que desea realizar:");
            System.out.println("1: Sumar");
            System.out.println("2: Restar");
            System.out.println("3: Múltiplicar");
            System.out.println("4: Dividir");
            System.out.println("5: Valor Absoluto");
            System.out.println("6: Raíz cuadrada");
            opc=entrada.nextInt();
            if(opc<=0||opc>6)
                System.out.println("Ingrese una opción válida");
        }while(opc<=0||opc>6);
        switch(opc){
            case 1: System.out.println("La suma es: " +vanessa.sumar(a, b));
            break;
            case 2: System.out.println("La resta es: " +vanessa.restar(a, b));
            break;
            case 3: System.out.println("La Multiplicación es: " +vanessa.multiplicar(a, b));
            break;
            case 4: System.out.println("La División es: " +vanessa.dividir(a, b));
            break;
            case 5: 
                System.out.println("El Valor Absoluto de a es: " +vanessa.valorAbsoluto(a));
                System.out.println("El Valor Absoluto de b es: " +vanessa.valorAbsoluto(b));
            break;
            case 6: 
                System.out.println("La raíz cuadrada de a es: " +vanessa.raizCuadrada(a));
                System.out.println("La raíz cuadrada de b es: " +vanessa.raizCuadrada(b));
            break;
            default:
        }
    
    }    
    
}
