
/* Programa que pregunta al usuario cuantas filas y columnas desea y despues 
imprime el resultado por cada número incrementara en uno.
por ejemplo si pida 3 filas y 3 columnas obtendra --> 
[1,2,3]
[4,5,6]
[7,8,9]
Sí el número de filas o columnas es mas pequeño o es 0 dara un error y saldra del programa.
*/

// importamos la libreria Scanner
import java.util.Scanner;

public class ArrayAuto{
    public static void main(String[] args){
        // declaramos las variables Scanner para que el usuario pueda introducir los datos    
        Scanner nums = new Scanner(System.in);
        // Pedimos al usuario el numero de filas que desea y declaramos la variable filas 
        System.out.println("Que número de filas deseas?");
        int filas = nums.nextInt();
        // sí filas es 0 o menor imprimimos el error y salimos del programa con return
        if (filas <=0) {
            System.out.println("no puede haber 0 filas.");
            return;
        } else {
            /* si filas es mayor a 0 escribimos el número de columnas que deseamos y 
            Pedimos al usuario el numero de columnas que desea y declaramos la variable columnas */ 
            System.out.println("Que número de columnas deseas?");
            int columnas = nums.nextInt();
            // sí columnas es 0 o menor imprimimos el error y salimos del programa con return 
            if (columnas <=0){
                System.out.println("no puede haber 0 columnas.");
                return;
            }               
            // si filas y columnas son mayor a 0 las guardamos en una array llamada numeros    
            int numeros[][] = new int[filas][columnas];
            // declaramos la variable contador y la inicializamos con 1
            int contador = 1;
            // recorremos con for las filas
            for (int i = 0; i < filas; i++){
                // recorremos con for las columnas
                for (int j = 0; j < columnas; j++){ 
                    numeros [i][j] = contador;         
                    System.out.print("[" + numeros[i][j] + "]");
                    contador ++;
                }
                System.out.println();
            }            
        }    
    }
}

