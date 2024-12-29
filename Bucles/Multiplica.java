public class Multiplica {
    public static void main(String [] args) {
    
        int nombre = Integer.parseInt(args[0]); 
         
        for (int contador = 1; contador <= 10; contador++){
                int resultat = contador * nombre; 
                System.out.println(contador + " X " + nombre + " =  " + resultat);           
          
        }
    } 
}
