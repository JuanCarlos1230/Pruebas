public class Preu {
    public static void main(String[] args) {
    
     //int preu = Integer.parseInt(args [0]);
     int descompte = 0;
     
     System.out.println("Quin es l'import?");
     int preu = Integer.parseInt(Entrada.readLine());
     
     if (preu < 50) { 
        System.out.println("No té descompte");       
     }    
     else if (preu >= 50 && preu <= 100) {
        System.out.println("Descompte aplicat de 5€");
        descompte = 5;
        preu = preu - descompte;
     }   
     else if (preu >= 100 && preu <= 200) {
        System.out.println("Descompte aplicat de 10€");
        descompte = 10;
        preu = preu - descompte;
     
     } else {
        System.out.println("Descompte aplicat de 15€");
        descompte = 15;
        preu = preu - descompte;
     }
     
        System.out.println("Descompte aplicat " + descompte + "€ preu final " + preu + "€");
     }      
}
