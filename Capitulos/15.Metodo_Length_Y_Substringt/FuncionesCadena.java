
import java.util.Scanner;

public class FuncionesCadena{
    public static void main(String[] args){
        // creamos el objeto Scanner
        Scanner in = new Scanner(System.in);
        // Mostramos por pantalla un mensaje
        System.out.println("Escribe tu texto para calcular su longitud:");
        String cadena = in.nextLine();
        int numCaracteres = cadena.length();
        System.out.println("El texto: " + cadena + " pose " + numCaracteres + " caracteres.");
        System.out.println("Que parte de la cadena deseas obtener?");
        System.out.print("Introduce el numero de inicio de la cadena:");
        int numInicio = in.nextInt();
        if (numInicio < 1){
            System.out.println("El número de inicio no puede ser menor a 1.");
        } else {          
            System.out.print("Introduce el numero final de la cadena:"); 
            int numFinal = in.nextInt();
            if (numFinal <= numInicio) {
                System.out.println("El número final no puede ser ni menor ni igual al numero de inicio.");
            } else {                       
                // al iniciar en -1 en vez de empezar a contra desde 0 cuenta desde 1
                String resultado = cadena.substring(numInicio -1,numFinal);
                System.out.println("La cadena resultante es:" + resultado);
            } 
        }    
    }
}

