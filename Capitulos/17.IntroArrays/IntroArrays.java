
/* Programa quwe pregunta al usuario cuantos numeros desea guardar en el array y 
despues le muestra los numero guardados.
*/

import java.util.Scanner;

public class IntroArrays{
    public static void main(String[] args){
        // Declaramos el objeto Scanner
        Scanner num = new Scanner(System.in);
        // Preguntamos al usuario cuantos numeros desea guardar en el array
        System.out.print("Cuantos números deseas guardar en el array? ");   
        int quants = num.nextInt();
        
        if (quants <= 0) {
            System.out.println("Cuantos números deseas guardar en el array debe ser mayor a 0."); 
            return;   
        }
           
        int nums[] = new int[quants]; 
        int i = 0;
        int numeros = nums[i];
               
        for (i = 0; i < nums.length; i++){ 
            System.out.print("Introduzca el número " + (i + 1) + ": ");    
            nums[i] = num.nextInt();
            numeros = nums[i];
        }
            
        System.out.print("Los numero guardados son: ");
        System.out.print("[");
        int j = 0;
        for (j = 0; j < nums.length-1; j++){
            System.out.print(nums[j] + ",");              
        }
            
        System.out.print(nums[j] + "]");
        System.out.println();              
    }
}
  
