
public class EndevinaBucle {
    public static void main(String [] args) {
    String text = Entrada.readLine(); // ENTRADA (INPUT)
    int count = 0;
    String textLow = text.toLowerCase();
    
    for (int i = 0; i < textLow.length(); i++) {
        char c = textLow.charAt(i);
        
        if (Character.isLetter(c)) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            continue;
            }
            count++;
        }
        if (c == '.') {
            break;
        }
    }        
    System.out.println("Total: " + count); // SALIDA (OUTPUT)
    }
}
    
