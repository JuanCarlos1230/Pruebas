/* Programa que pregunta por 5 numeros los guarda en un array y luego los imprime */

import java.util.Scanner;

public class Arrays{
    public static void main(String[] args){
        // Declaramos objeto Scanner
        Scanner num = new Scanner(System.in);
        int nums[] = new int[5];
        System.out.print("Introduce el 1 numero: ");
        int num1 = num.nextInt(); 
        nums[0] = num1; 
        System.out.print("Introduce el 2 numero: ");
        int num2 = num.nextInt(); 
        nums[1] = num2; 
        System.out.print("Introduce el 3 numero: ");
        int num3 = num.nextInt(); 
        nums[2] = num3; 
        System.out.print("Introduce el 4 numero: ");
        int num4 = num.nextInt(); 
        nums[3] = num4;
        System.out.print("Introduce el 5 numero: "); 
        int num5 = num.nextInt(); 
        nums[4] = num5; 
        System.out.print("Estos son los numeros guardados: ");
        int i = 0;
        for (i = 0; i<nums.length - 1; i++){
            System.out.print(nums[i] + ",");             
        }
        System.out.print(nums[i]);
        System.out.println(); 
    } 
}
