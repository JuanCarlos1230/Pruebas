import java.util.Scanner;

public class IntroArrays{
    public static void main(String[] args){
        // Declaramos el objeto Scanner
        Scanner num = new Scanner(System.in);
        // Preguntamos al usuario cuantos numeros desea guardar en el array
        System.out.print("Cuantos números deseas guardar en el array? ");   
        int quants = num.nextInt();   
        int nums[] = new int[quants]; 
        int i = 0;
        int numeros = nums[i];       
        for (i = 0; i < nums.length; i++){ 
            System.out.print("Introduzca el número " + (i + 1) + ": ");    
            nums[i] = num.nextInt();
            numeros = nums[i];
        }    
        System.out.print("Los numero guardados son: ");
        for (int j = 0; j < nums.length; j++){
            System.out.print("[" + nums[j] + "]");              
        }
        System.out.println();              
    }
}
  
