import java.util.Scanner;

public class BuscarNombres{
    public static void main(String[] args){
        
        //Declaramos el objeto Scanner
        Scanner entrada = new Scanner(System.in);
        
        //Declaramos la array de arrays de String nombres
        String nombres[][] =
        // Estos son los nombres
        {{"Juan","Luis","Guillermo","Pedro"},
        {"Gerardo","Esteban","Mario","Ana"},
        {"Fernando","Carlos","Ernesto","Carmen"},
        {"Eduardo","Santiago","Noemí","Maria"}};
        
        //Pedimos al usuario ingresar la fila del 1 al 4
        System.out.println("Ingresa la fila del nombre que deseas del 1 al 4:");
        //Entrada para que el usuario introduzca la fila        
        int fila = entrada.nextInt();
        
        // comprobamos que sea realmente del 1 al 4 la fila
        if (fila <=0 || fila > 4) {
            // Sino ingresa el numero del 1 al 4. Salimos del programa
            return;
        
        } else {
            // si ingreso un numero del 1 al 4 le pedimos la columna
            System.out.println("Ingresa la columna del nombre que deseas del 1 al 4:");   
        }
        //Entrada para que el usuario introduzca la columna
        int columna = Integer.parseInt(Entrada.readLine());
        
        // comprobamos que sea realmente del 1 al 4 la columna
        if (columna <=0 || columna > 4) {
            // Sino ingresa el numero del 1 al 4. Salimos del programa
            return;
        
        } else {
            //Recorremos la fila del array 
            for (int i  = fila; i <= nombres.length; i++){
                //Recorremos la columna del arry de arrays              
                for (int j  = columna; j <= nombres.length; j++){
                }            
            }
            //Mostramos por pantalla el numero de la fila y de la columna y por ultimo el nombe que hay en esa posicion.  
            System.out.println("Este es el nombre de la fila " + fila + " y de la columna " + columna + ": " + nombres[fila -1][columna - 1] + ".");    
        }      
    }  
}
