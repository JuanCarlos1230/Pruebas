/* Programa que calcula la nota media entre las 3 materias e imprime
 * si aprobaste o reprobaste y la nota media que sacaste entre las 3 materias. 
 */

public class Condicionales{
    public static void main(String[] args){
        
        int Matemáticas = 6;
        int Biología = 8;   
        int Química = 7;
        int promedio = 0;
        
        promedio = (Matemáticas + Biología + Química) / 3;

        if (promedio >=5) {
            System.out.println("El alumno aprobó con un " + promedio);
        } else {
            System.out.println("El alumno reprobó con un " + promedio);
        } 
    }
}

