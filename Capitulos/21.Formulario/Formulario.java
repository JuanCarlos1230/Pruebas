
import javax.swing.*;

public class Formulario extends JFrame{
    
    public Formulario(){
        setLayout(null);
    }
    public static void main(String[] args){
        Formulario formulario1 = new Formulario();
        formulario1.setBounds(0,0,400,550);  
        formulario1.setLocationRelativeTo(null);
        formulario1.setResizable(false);
        formulario1.setVisible(true);  
    }
}

