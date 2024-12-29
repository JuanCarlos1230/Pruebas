
public class Comand {
    public static void main (String [] args) {
/*   //programa que troba VOCALS
 
    System.out.println("comprova cadena");
    String cadena = Entrada.readLine();
    String VOCALS = "AEIOUaeiou";
    
    for (int i = 0; i < cadena.length(); i++) {
        char c1 = cadena.charAt(i);
        for (int j = 0; j < VOCALS.length(); j++) {
            char c2 = VOCALS.charAt(j);                    
            if (c1 == c2 ) {
            System.out.print(c1 + " ");    
                                
            }          
        }
    }System.out.println(); 
    }
}
*/
         





   
        // Solicitar al usuario el DNI
        System.out.println("DNI?");
        String dni = Entrada.readLine();

        // Verificar si el DNI tiene exactamente 10 caracteres
        if (dni.length() != 10) {
            System.out.println("DNI no válido");
        } else {
            boolean esValido = true; // Asumimos que es válido al principio

            // Verificar que los primeros 8 caracteres sean números
            for (int i = 0; i < 8; i++) {
                if (!Character.isDigit(dni.charAt(i))) {
                    esValido = false; // Si encontramos un no dígito, el DNI es inválido
                    break;  // Salimos del bucle porque no necesitamos seguir verificando más
                }
            }

            // Si es válido hasta aquí, verificamos el guion y la letra final
            if (esValido) {
                // Verificar que el noveno carácter sea un guion '-'
                if (dni.charAt(8) == '-') {
                    // Verificar que el décimo carácter sea una letra y convertirla a mayúsculas
                    char letra = Character.toUpperCase(dni.charAt(9));
                    if (Character.isLetter(letra)) {
                        System.out.println("DNI válido");
                    } else {
                        System.out.println("DNI no válido");
                    }
                } else {
                    System.out.println("DNI no válido");
                }
            } else {
                System.out.println("DNI no válido");
            }
        }
    }
}

