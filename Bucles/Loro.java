public class Loro {
    public static void main(String[] args) {
        
        System.out.println("El lloro pregunta paraula que comenci amb vocal en minúscules");  
        String paraula = Entrada.readLine();         
               
        while (!paraula.isBlank()) { 
                
            char primeraLletra = paraula.charAt(0);
            boolean esMinuscula = Character.isLowerCase(primeraLletra);
        
            if (primeraLletra == 'a' || primeraLletra == 'e' || primeraLletra == 'i' ||
                primeraLletra == 'o' || primeraLletra == 'u' && esMinuscula) {
                System.out.println("El lloro diu: " + paraula);                                 
                System.out.println("El lloro pregunta paraula que comenci amb vocal en minúscules");
                paraula = Entrada.readLine();
                              
            } else {                
                System.out.println("El lloro pregunta paraula que comenci amb vocal en minúscules");                
                paraula = Entrada.readLine();                   
            }
                        
        } System.out.println("Adéu");          
    
    }
}
    
