
import java.util.Scanner;

public class CondicionalesLogicos{
    public static void main(String[] args){
        
        String nombre = "";
        int departamento = 0, antiguedad = 0;
        Scanner clave = new Scanner(System.in);
        System.out.println("Bienvenido al sistema vacacional de Coca-Cola Company.");
        System.out.println("Cuál es el nombre del trabajador?");
        /* con Scanner podemos ingresar numero o textos solo tendremos que 
        indicar nextLine para texto o nextInt para números*/
        nombre = clave.nextLine(); // guarda el nombre con el metodo nextLine        
        System.out.println("A que departamento perteneces?");       
        departamento = clave.nextInt(); //guarda números el metodo nextInt
         
        if (departamento == 1){
            System.out.println("Tu departamento pertenece a la Aténción del cliente.");    
            System.out.println("Cuántos años de servicio tiene el trabajador?");
            antiguedad = clave.nextInt(); //guarda números el metodo nextInt
            if (antiguedad < 0){
                System.out.println("No puede haber años negativos.");
            } else if (antiguedad < 1){
                System.out.println("No recibes vacaciones.");
            } else if (antiguedad == 1){
                System.out.println("Recibes 6 dias de vacaciones.");
            } else if (antiguedad >= 2 && antiguedad <= 6){
                System.out.println("Recibes 14 dias de vacaciones.");
            } else {
                System.out.println("Recibes 20 dias de vacaciones.");
            }
        } else if (departamento == 2){
            System.out.println("Tu departamento pertenece a la Logística.");    
            System.out.println("Cuántos años de servicio tiene el trabajador?");
            antiguedad = clave.nextInt(); //guarda números el metodo nextInt
            if (antiguedad < 0){
                System.out.println("No puede haber años negativos.");
            } else if (antiguedad < 1){
                System.out.println("No recibes vacaciones.");
            } else if (antiguedad == 1){
                System.out.println("Recibes 7 dias de vacaciones.");
            } else if (antiguedad >= 2 && antiguedad <= 6){
                System.out.println("Recibes 15 dias de vacaciones.");
            } else {
                System.out.println("Recibes 22 dias de vacaciones.");
            }
        } else if (departamento == 3){
            System.out.println("Tu departamento pertenece a la Gerencia.");    
            System.out.println("Cuántos años de servicio tiene el trabajador?");
            antiguedad = clave.nextInt(); //guarda números el metodo nextInt
            if (antiguedad < 0){
                System.out.println("No puede haber años negativos.");
            } else if (antiguedad < 1){
                System.out.println("No recibes vacaciones.");
            } else if (antiguedad == 1){
                System.out.println("Recibes 10 dias de vacaciones.");
            } else if (antiguedad >= 2 && antiguedad <= 6){
                System.out.println("Recibes 20 dias de vacaciones.");
            } else {
                System.out.println("Recibes 30 dias de vacaciones.");
            }
        } else {
            System.out.println("Solo hay tres departamentos.");
        } 
    }
}
    
