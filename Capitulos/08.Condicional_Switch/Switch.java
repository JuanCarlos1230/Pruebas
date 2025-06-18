// Escribe los dos numeros que desas operar y luego escoje la operacion.

import java.util.Scanner;

public class Switch{
    public static void main(String[] args){
        
        int numUno = 0, numDos = 0, resultado = 0, operacion = 0;
        Scanner num = new Scanner(System.in);
        
        System.out.println("Cuál es el primer número que deseas?");
        numUno = num.nextInt();
        
        System.out.println("Cuál es el segundo número que deseas?");
        numDos = num.nextInt();
        
        System.out.println("Que operación deseas realizar?");
        System.out.println("1-Sumar, 2-Restar, 3-Multiplicar, 4-Dividir");
        operacion = num.nextInt();
        
        switch(operacion){
        
            case 1: resultado = numUno + numDos;
                System.out.println("El resultado de la suma es: " + resultado);
                break;
                
            case 2: resultado = numUno - numDos;
                System.out.println("El resultado de la resta es: " + resultado);
                break;
                
            case 3: resultado = numUno * numDos;
                System.out.println("El resultado de la multiplicación es: " + resultado);
                break;
                
            case 4: resultado = numUno / numDos;
                System.out.println("El resultado de la división es: " + resultado);
                break;
                
            default: System.out.println("Error, la operación no existe");
                break;   
        }    
    }
}

