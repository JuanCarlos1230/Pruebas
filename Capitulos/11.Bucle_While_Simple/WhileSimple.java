import java.util.Scanner;

public class WhileSimple{
    public static void main(String[] args){
        
        // Declaramos variable Scanner y la de los numeros
        Scanner num = new Scanner(System.in);
        int numInici = 0, numFi = 0;
        // Creamos la entrada de los números
        System.out.println("Introduce el primer número");
        numInici = num.nextInt();
        System.out.println("Introduce el segundo número");
        numFi = num.nextInt();     
        /* hacemos un recorrido de los números de entrada ya sea incrementadon o decrementando*/
        if (numInici < numFi) {
            while (numInici <= numFi -1){        
                System.out.print(numInici + ", ");
                numInici++; 
            }
            System.out.println(numInici);
        } else if (numInici > numFi){
            while (numInici >= numFi + 1){        
                System.out.print(numInici + ", ");
                numInici--;
            }
            System.out.println(numFi);
        } else {
            System.out.println("Los número no pueden ser iguales");
        }
    }
}
