public class fecha {
    public static void main (String[] args);

        System.out.print("Text?");
        String text = Entrada.readLine();
       
        int posicio = 0;
        char caracter = text.charAt(posicio);
        
        if (Character.isDigit(caracter)) {    
            for (posicio = 0; posicio < text.length(); posicio++) { 
                caracter = text.charAt(posicio);
                    if (Character.isDigit(caracter)) { 
                        System.out.print(caracter);                         
                    
                    } else {
                        System.out.println("No hay digitos");
                    }        
        }
    }
}
    
