
/*
Programa que dibuja una E con astericos (*) usando bluces for.

******************   (1-18) 3 filas 18 columnas (1 Parte)
******************
******************
****   (1-4) 3 filas y 4 columnas (2 Parte)
****
****
************   (1-12) 3 filas y 12 columnas (3 Parte) 
************
************
****   (1-4) 3 filas y 4 columnas   (4 Parte)
****
****
******************   (1-18) 3 filas 18 columnas (5 Parte)
******************
******************  
*/

public class LetraE {
    public static void main (String [] args) {
    
        // ya tenemos la primera parte    
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 18; j++) {
            System.out.print("*");
            }     
            System.out.println();
        } 
        // ya tenemos la segunda parte    
        for (int linia1 = 1; linia1 <= 3; linia1++) {
            for (int col1 = 1; col1 <= 4; col1++) {
            System.out.print("*");
            }
            System.out.println();  
        }               
        // ya tenemos la tercera parte    
        for (int linia2 = 1; linia2 <= 3; linia2++) {
            for (int col2 = 1; col2 <= 12; col2++) {
            System.out.print("*");
            }
        System.out.println();
        }         
        // ya tenemos la cuarta parte    
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 4; j++) {
            System.out.print("*");
            
            }
        System.out.println();
        }
        // ya tenemos la quinta parte    
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 18; j++) {
            System.out.print("*");    
            }
        System.out.println(); 
        } 
    }
}    
