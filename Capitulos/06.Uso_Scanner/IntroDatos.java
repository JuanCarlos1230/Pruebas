// Programa al cual le dices tu nombre y dos numneros para que te los sume.

import java.util.Scanner;

public class IntroDatos{
    public static void main(String[] args){
        
        Scanner texto = new Scanner(System.in);
        String nombre = "";
        int numUno = 0, numDos = 0, resultado = 0;
        
        System.out.println("Cual és tu nombre?");
        nombre = texto.nextLine(); //guarda texto el metodo nextLine
        
        System.out.println("Dame el primer valor para tu suma:");
        numUno = texto.nextInt(); //guarda números el metodo nextInt         
        
        System.out.println("Dame el segundo valor para tu suma:");
        numDos = texto.nextInt(); //guarda números el metodo nextInt
        
        resultado = numUno + numDos;
        
        System.out.println("Hola " + nombre + " el resultado de tu suma és " + resultado);  
    }
}

