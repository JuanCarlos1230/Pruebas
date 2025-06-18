
/* Programa que forma un bucle decreciente desde el 1000 al 200
 *disminuyendo cada vez 200. 
 */ 
 
public class CuentAtras{
    public static void main(String[] args){
        int i = 1000;        
        do {  
            if (i > 200){
                System.out.print(i + ", ");
                i-=200;
            }
            if (i == 200){
                System.out.println(i);  
            }         
        } while(i>200);    
    }
}

