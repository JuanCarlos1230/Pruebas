
public class TablasMultiplicar{
    public static void main(String[] args){
        // Preguntamos al usuario que tabla quiere
        System.out.println("Que tabla de multiplicar quieres?");
        // Declaramos la variable tabla
        int tabla = Integer.parseInt(Entrada.readLine());
        while (tabla >= 0){
            System.out.println("Aqui tiene tu tabla de multiplicar.");
            for (int i = 0; i <= 10; i ++){
                int resultado = tabla * i;
                System.out.println(tabla + " x " + i + " = " + resultado);                           
            }
            System.out.println("Que tabla de multiplicar quieres?");
            // Declaramos la variable tabla
            tabla = Integer.parseInt(Entrada.readLine()); 
        }
        System.out.println("Hasta la proxima");
    }
}

