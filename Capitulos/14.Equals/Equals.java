/* Programa que verifica por un lado que los nombres sean igual idependientemente de estar 
escritos en mayuscula o minuscula y verifica que el usuario y contraseña sean correctos.
*/

import java.util.Scanner;

public class Equals{
    public static void main(String[] args){
        // Declaramos los objetos Scanner y String
        Scanner entrada = new Scanner(System.in);  
        String nom1 = "", nom2 = "", nums = "";
       
        // Preguntamos por el número del ejercicio
        System.out.println("\"Ejercicio 1\" o \"Ejercicio 2\"?");
        nums = entrada.nextLine();
        if (nums.equals("1")||nums.equals("Uno")||nums.equals("uno")){
            System.out.println("Comparamos el 1 nombre introducido con el 2 nombre introducido.");    
            // Preguntamos el 1 nombre al usuario
            System.out.println("Ingresa el 1 nombre.");
            nom1 = entrada.nextLine();
            System.out.println("Ingresa el 2 nombre.");
            nom2 = entrada.nextLine();
            // convertimos en minusculas los nombres
            nom1 = nom1.toLowerCase();
            nom2 = nom2.toLowerCase();
            
            if (nom1.equals(nom2)){
                System.out.println("Los nombres son iguales.");
            } else {
                System.out.println("Los nombres son diferentes.");
            } 
        } else if (nums.equals("2")||nums.equals("Dos")||nums.equals("dos")){
            System.out.println("Creamos un login:");
            System.out.println("Solo es correcto si usuario es: Carlos y el password es: karLoS.32");    
            // Preguntamos el nombre al usuario
            System.out.println("Cuál es tu nombre de usuario?");
            // Declaramos la variable String
            String nom = entrada.nextLine();
            System.out.println("Cuál es tu password de usuario?");
            String password = entrada.nextLine();
            if (nom.equals("Carlos") && (password.equals("karLoS.32"))){
                System.out.println("El usuario es correcto.");
            } else {
                System.out.println("El nombre de usuario o la contraseña es incorrecta.");
            }    
        }
    }
}     

