
import java.util.Scanner;

public class EstacionAnual{
    public static void main(String[] args){
        
        int mes = 0;
        Scanner numMes = new Scanner(System.in);
        
        System.out.println("Introduce el número del més");
        mes = numMes.nextInt(); // entrada para introfucir el número del més     
 
        switch(mes){
            case 1,2,12  -> System.out.println("Invierno");
            case 3,4,5   -> System.out.println("Primavera");
            case 6,7,8   -> System.out.println("Verano");
            case 9,10,11 -> System.out.println("Otoño");
            default      -> System.out.println("Los meses van del 1 al 12"); 
        }    
    }
}

