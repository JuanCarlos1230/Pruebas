/*
public class Repeteix {
    public static void main (String [] args){
    
        //String VOCALS = "aeiouàèéíïòóúü";
        //boolean teVocals = false;
            
        for (int i = 0; i < 4; i++) {
            char c = text.charAt(i); 
            System.out.println(i + " --> " + c);
            // mirar si es vocal
            // versio avançada
            boolean esVocal = false;
            //for (int j = 0; j <VOCALS.length(); j++) {
                    if (c==VOCALS.charAt(j)) {
                      //      esVocal = true;
                        //    break;                  
                    }            
            }   
        if (!esVocal) {
            System.out.print(text.charAt(i));
        }    
        /* versió bàsica if ( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c = 'u') {
                teVocals = true;
                break;   */
                                                   
               /* if (teVocals) {
                    System.out.println("El text té vocals");      
                } else {    
                    System.out.println("El text no té vocals");
                }
             }    
        }
    }     
//}
*/

public class Repeteix {
    public static void main (String [] args){
        //String VOCALS = "aeiouàèéíïòóúü";
        //boolean teVocals = false;
        System.out.println("Introduïu un text?");
        String text = Entrada.readLine(); 
        String acumula = "";
                 
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == ' ' || c == '\t') {
                if (dinsparaula) {
                    System.out.println();
                    dinsparaula = false;                    
                }
                continue;   
            }
            System.out.print(c);
            dinsparaula = true;
        }
        if (dinsparaula) {
            System.out.println();
        }
    }
}
    
                    
