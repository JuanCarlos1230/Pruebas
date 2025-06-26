
public class MostraInterval {
    public static void main(String [] args) {
    
    System.out.println("inici?");
    int inici = Integer.parseInt(Entrada.readLine());
    System.out.println("final?");
    int fi = Integer.parseInt(Entrada.readLine());
    
    if (inici < fi) { 
        for (int i = inici; i <= fi; i++) {
            System.out.println(i);
        }
         
    } else {
        for (int i = inici; i >= fi; i--) {
            System.out.println(i);
        } 
    }
    }
}

