// Programa que cuenta las o que tiene un texto.

import java.util.Scanner;

public class ContarO{
    public static void main(String[] args){
        //Declaramos el objeto Scanner
        Scanner texto = new Scanner(System.in);
        // Pedimos al usuario que introduzca un texto
        System.out.println("Introduce una palabra o un texto.");
        // Declaramos la variable text
        String text = texto.nextLine();
        // Declaramos la variable contador y la inicializamos a 0
        int contador = 0;
        // Sí no introduce ni una palabra ni un texto salimos del programa
        if (text.isEmpty()){
            System.out.println("Error el texto no puede estar vacio.");
            return;
        } else {
            // sí no esta vacio recorremos el texto en busca de o
            for (int i = 0; i < text.length(); i++){
                // echo el recorrido obtenemos los caracteres de la cadena
                char contarO = text.charAt(i);
                // sí contarO es = a "o" incrementamos en contador en 1
                if (contarO == 'o'){
                    contador++;   
                }                                       
            }
            System.out.println("El texto " + text + " tiene " + contador + " os.");                 
        }   
    }
}
