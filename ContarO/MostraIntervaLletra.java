
public class MostraIntervaLletra {
    public static void main(String [] args) {
    
    System.out.println("Text?");
    String text = Entrada.readLine();
    System.out.println("inici?");
    int inici = Integer.parseInt(Entrada.readLine());
    System.out.println("final?");
    int fi = Integer.parseInt(Entrada.readLine());
    
    if (inici < fi) { 
        for (int i = inici; i <= fi; i++) {
            char carac = text.charAt(i);
            System.out.println(carac);
            if (fi > (text.length()-1)) {  
                fi = (text.length()-1);          
            }        
        }
    } else {
        if (inici < 0 && fi < 0) {        
            for (int i = 0; i >= 0; i--) {         
                char carac = text.charAt(i);
                System.out.println(text.charAt(0));
            }
        } else {
                for (int i = inici; i >= fi; i--) {         
                    char carac = text.charAt(i);
                    System.out.println(carac);           
                }
        }     
    }      
    }
}
    
