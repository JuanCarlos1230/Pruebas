
import java.util.Scanner;

public class Equals{
    public static void main(String[] args){
        // Declaramos los objetos Scanner e int y String
        Scanner entradanum = new Scanner(System.in);
        Scanner entradanom = new Scanner(System.in);
        Scanner entradapass = new Scanner(System.in); 
        String nom1 = "", nom2 = "";
       
        // Preguntamos por el número del ejercicio
        System.out.println("\"Ejercicio 1\" o \"Ejercicio 2\"?");
        int num = entradanum.nextInt();
        if (num == 1){
            System.out.println("Comparamos el 1 nombre introducido con el 2 nombre introducido.");    
            // Preguntamos el 1 nombre al usuario
            System.out.println("Ingresa el 1 nombre.");
            nom1 = entradanom.nextLine();
            System.out.println("Ingresa el 2 nombre.");
            nom2 = entradanom.nextLine();
            // convertimos ambos nombres a minuscula 
            nom1 = nom1.toLowerCase();
            nom2 = nom2.toLowerCase();
            
            if (nom1.equals(nom2)){
                System.out.println("Los nombres son iguales.");
            } else {
                System.out.println("Los nombres son diferentes.");
            } 
        } else if (num == 2) {
            System.out.println("Creamos un login:");
            System.out.println("Solo es correcto si usuario es: Carlos y el password es: karLoS.32");    
            // Preguntamos el nombre al usuario
            System.out.println("Cuál es tu nombre de usuario?");
            // Declaramos la variable String
            String nom = entradanom.nextLine();
            System.out.println("Cuál es tu password de usuario?");
            String password = entradapass.nextLine();
            if (nom.equals("Carlos") && (password.equals("karLoS.32"))){
                System.out.println("El usuario es correcto.");
            } else {
                System.out.println("El nombre de usuario o la contraseña es incorrecta.");
            }    
        }
    }
}     

