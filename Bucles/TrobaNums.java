/*
Programa que troba els nombres del text 
*/

public class TrobaNums {
     public static void main (String [] args) {
        
        String text = "Helo 689375";
        String NUM = "1234567890";
        String lletras = "Salto";
          
       for (int i = 0; i < text.length(); i++) {
        char c1 = text.charAt(i);
            for (int j = 0; j < NUM.length(); j++) {
            char c2 = NUM.charAt(j);
                if (c1 == c2) {      
                    System.out.print("Estos son todos los numeros --> ");
                    System.out.println(c2);
                }
            }
        }       
        for (int paraula = 0; paraula < text.length(); paraula++) {
            char c1 = text.charAt(paraula);
            for (int letras = 0; letras < lletras.length(); letras++) {
                char c3 = lletras.charAt(letras);
                if (c1 == c3) {
                    System.out.print("Estas son todas las letras --> ");
                    System.out.println(c3);
                         
                }
            }
        }
    }
}                       
