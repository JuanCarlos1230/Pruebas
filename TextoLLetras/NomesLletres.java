
/* Programa que demana un text a l'usuari i treu tot el text 
de manera que nosmes hi hagi lletres. 
Exemple --> tens 4 pomes? = tenspomes   
*/

// importem la llibreria Scanner
import java.util.Scanner;
// afegim la classe
public class NomesLletres{
    //afegim la main
    public static void main(String[] args){
    //declarem les variable Scanner 
    Scanner entrada = new Scanner(System.in);    
    /* declarem una variable String anomenada resultat on es creara el resultat
    de la variable text però afegint nomes les lletres*/
    String resultat ="";
    // Imprimint per pantalla la paraula text? 
    System.out.println("Text?");
    // declarem la variable text y amb l'objecte Scanner pot introduïr l'usuari el text  
    String text = entrada.nextLine();
    // Si no escriu res el programa imprimira el sytem.out.pirntln y sortira del programa
    if (text.isBlank()){
        System.out.println("El text estar buit. S'ha finalitzat el programa.");
    } else {
        // si per el encotrari s'escriu un text el recorrem amb un for
        for (int i = 0; i <text.length(); i++){
            // obtenim caracter a carater els caracters actuals de tot el text
            char lletre = text.charAt(i);
            // condició si el caracter es una lletra
            if (Character.isLetter(lletre)){        
                // afegim la lletra a la variable resultat    
                resultat += lletre;               
            }    
        }
        // fora del bucle mostren per pantalla el resultat final
        System.out.println(resultat);
    }
    }
} 
