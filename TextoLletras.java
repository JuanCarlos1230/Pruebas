
public class TextoLletras {
    public static void main(String []args) {
    
        System.out.println("Text?");
        String text = Entrada.readLine();
        String resultat = "";
        
        int i = 0;
        char carac = text.charAt(i);
        boolean ultim = false;
        
        for ( i = 0; i < text.length(); i++) {
            carac = text.charAt(i);
            if (Character.isLetter(carac)) {                
                System.out.print(carac + ", ");                
            }
        }             
        ultim = true;
        if (ultim && Character.isLetter(carac)) {
            resultat += carac;
            System.out.print(resultat);            
        } System.out.println();
    } 
}                    

