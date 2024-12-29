
public class WhileNaturals {
    public static void main(String[] args) {
        
        System.out.println("Cual es el primer numero?");
        int primero = Integer.parseInt(Entrada.readLine());
        
        System.out.println("Cual es el ultimo numero?");
        int ultimo = Integer.parseInt(Entrada.readLine());
        
        System.out.println("Valor que va desede el " + primero + " numero hasta el " + ultimo);
            
            if (primero == ultimo) {
            System.out.println("No hay recorrido para numero iguales.");
            
            } else if (primero <= ultimo) {
            
                while (primero <= ultimo) {            
                      System.out.println(primero);
                      primero = primero + 3;
            }    
                } else {                            
                                 
                while (primero >= ultimo) {
                       System.out.println(primero);
                       primero = primero - 2;
                }               
                }
    }                   
}
          
