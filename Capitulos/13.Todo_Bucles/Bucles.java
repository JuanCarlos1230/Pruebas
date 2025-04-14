
import java.util.Scanner;

public class Bucles{
    public static void main(String[] args){
        // Crear variable Scanner y la variable int
        Scanner num = new Scanner(System.in);
        int numBucle = 0;
        int i = 1, j = 16, k = 50;
        // preguntamos que bucle desea reproducir
        System.out.println("Introduce el bucle que deseas reproducir: 1, 2 o 3.");
        numBucle = num.nextInt(); /* entrada para escribir el tipo de bucle
        que deseamos reproducir de los 3 que hay */
        if (numBucle == 1){
            System.out.println("Seleccionaste el bucle 1.");
            while (i <= 9){
                System.out.print(i + ", ");
                i++;
            }
            System.out.println(i);
        } else if (numBucle == 2){
            System.out.println("Seleccionaste el bucle 2.");
            // bucle que suma la j de 2 en 2 y resta de 3 en 3
            for(j = 16; j<= 26; j = j+2){
                if (j < 26){
                    System.out.print(j + ",");
                    System.out.print(k + ",");
                } else {
                    System.out.print(j + ",");
                    System.out.print(k);
                }
                k = k-3; 
            }
            System.out.println(); 
        // Fibonacci con for            
        } else if (numBucle == 3){
            System.out.println("Seleccionaste el bucle 3: \"Fibonacci\".");
            int primer = 0, segon = 1, resultat = 0; 
            for (primer = 0; primer <= 34; primer = primer+segon){
                segon = primer + segon;
                resultat = segon;
                if (resultat < 34) {        
                    System.out.print(primer + ", " + segon + ", ");        
                } else {
                    System.out.print(primer + ", " + segon);                 
                }
            }
            System.out.println();
        } else {
            System.out.println("Solo puedes seleccionar los bucles del 1 al 3.");
        }        
    }
}
