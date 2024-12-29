public class Mitjana {
    public static void main(String [] args) {
        
        System.out.println("Introdueix valors per fer mitja");
        int valors = Integer.parseInt(Entrada.readLine());
        
        int suma = 0;
        double mitjana = 0;
        int comptador = 0;
        
        while (valors >= 0 && valors <= 10) {  
        valors = Integer.parseInt(Entrada.readLine());
        suma = valors + suma;
        comptador++;
        }
        
        mitjana = suma / comptador; 
        System.out.println("La mitjana de les notes es " + mitjana);
    }
}             
         
