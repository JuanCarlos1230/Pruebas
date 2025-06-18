/* Programa que te permite elegir la operacion que deseas realizar con la variable numUno y numDos 
e imprimir el resultado.*/

import java.util.Scanner;
 
public class CondicionAnidada{
    public static void main(String []args){
        
        int numUno = 15;
        int numDos = 3;
        int resultado = 0;
        Scanner operacion = new Scanner(System.in);       
       
        System.out.println("Que operación deseas hacer: 1(Sumar), 2(Restar), 3(Multimplicar), 4(Dividir)?");
        int numOperacion = operacion.nextInt(); 
        
        if (numOperacion == 1){
            resultado = numUno + numDos;
            System.out.println("El resultado és " + resultado);
        } else if (numOperacion == 2){
            resultado = numUno - numDos;
            System.out.println("El resultado és " + resultado);
        } else if (numOperacion == 3){
            resultado = numUno * numDos;
            System.out.println("El resultado és " + resultado);
        } else if (numOperacion == 4) {
            resultado = numUno / numDos;
            System.out.println("El resultado és " + resultado);   
        } else {
            System.out.println("El número de operación elegido no es correcto");
        }            
    }
}

