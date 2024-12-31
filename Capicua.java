
/*
 * Programa que comprova si el text introduït és capicua es a dir 
 * es llegeix igual de esquerra a dreta que de dreta a esquerra. 
 */

public class Capicua {
    public static void main(String [] args) {
    
        // imprimint la paraula text
        System.out.println("Text");
        // entada per introduïr el text
        String text = Entrada.readLine();
        /* convertim el text en majúscules de manera que 
        no distingueixi entre majúscules i minúscules */
        text = text.toUpperCase();       
        
        // variable per guardar el primer text
        String text1= "";
        // recorrem el primer text de esquerra a dreta 
        for (int i = 0; i < text.length(); i++) {
            // construim el text de esquerra a dreta
            text1 += text.charAt(i);
        }
        String text2= ""; 
        for (int j = (text.length()-1); j >= 0; j--) {
            // construim el text de dreta a esuqerra
            text2 += text.charAt(j);
        }
        // condició si el text es buit
        if (text.isBlank()) {
            // imprimint que No és capicua
            System.out.println("No és capicua");
        // condició perque sigui capicua    
        } else if (text1.equals(text2)){
            System.out.println("És capicua");
        // condició per tota la resta    
        } else { 
            System.out.println("No és capicua");
        }
    }
}      
            
