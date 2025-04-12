
public class CondicionAnidada{
    public static void main(String []args){
        
        int numUno = 15;
        int numDos = 3;
        int resultado = 0;     
       
        System.out.println("Que operación deseas hacer: 1(Sumar), 2(Restar), 3(Multimplicar), 4(Dividir)?");
        int operacion = Integer.parseInt(Entrada.readLine()); //Usamos readLine para introducir datos.
        
        if (operacion == 1){
            resultado = numUno + numDos;
            System.out.println("El resultado és " + resultado);
        } else if (operacion == 2){
            resultado = numUno - numDos;
            System.out.println("El resultado és " + resultado);
        } else if (operacion == 3){
            resultado = numUno * numDos;
            System.out.println("El resultado és " + resultado);
        } else if (operacion == 4) {
            resultado = numUno / numDos;
            System.out.println("El resultado és " + resultado);   
        } else {
            System.out.println("El número de operación elegido no es correcto");
        }            
    }
}

