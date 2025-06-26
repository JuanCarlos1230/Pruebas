// importem la llibreria Scanner
import java.util.Scanner;

public class TrobaProxim{
    public static void main(String[] args){
        // Declarem l'objecte Scanner
        Scanner entrada = new Scanner(System.in);        
        // declarem les variables 
        int valorMesProxim = 0;
        int distanciaMesProxim = 0;
        int valorsValids = 0;
        // mostrem aquest missatge per pantalla
        System.out.println("Intodueix l'àncora");
        // variable objectiu que es l'ancora (el primer valor que introduïm i no es repeteix)
        int objectiu = entrada.nextInt(); 
        // Condició si l'objectiu (l'ancora) es negatiu
        if (objectiu > 0){            
            System.out.println("Introdueix un valor");
            int valor = entrada.nextInt();
            if (valor < 0){
                System.out.println("No s'ha introduït cap valor positiu");
            } else {
                valorMesProxim = valor;                
                if (valor > objectiu) {                
                    distanciaMesProxim = valor - objectiu;    
                } else {  
                    distanciaMesProxim = objectiu - valor;
                }
                valorsValids++;
                System.out.println("Introdueix un valor");
                valor = entrada.nextInt();                      
                
                while (valor >=0){
                    int distanciaActual;
                    if (valor > objectiu){
                        distanciaActual = valor - objectiu;
                    } else {
                        distanciaActual = objectiu - valor;
                    } if (distanciaActual < distanciaMesProxim){
                        valorMesProxim = valor;
                        distanciaMesProxim = distanciaActual;
                    } else if (distanciaActual == distanciaMesProxim && valor < valorMesProxim){
                        valorMesProxim = valor;
                    }
                    valorsValids++;
                    System.out.println("Introdueix un valor");
                    valor = entrada.nextInt();
                    }
                if (valorsValids > 0){
                    System.out.println("El valor introduït més pròxim es a " + objectiu + " és " + valorMesProxim);        
                }
            }                           
        } else {
            System.out.println("Àncora no vàlida");
        }                     
    } 
}

/*import java.util.Scanner;



System.out.println("Àncora no es valida");    
        } else {



public class TrobaProxim{
    public static void main(String[] args){
        // Declarem l'objecte Scanner
        Scanner entrada = new Scanner(System.in);
        // mostrem aquest missatge per pantalla
        System.out.println("Intodueix valors");
        int valor = 0;
        int maxim = 0;
        while (valor >= 0){
            valor = entrada.nextInt();
            if (valor > maxim){
                maxim = valor;
            }                
        }
        System.out.println("El valor maximo es " + maxim);
    }
}
    */
