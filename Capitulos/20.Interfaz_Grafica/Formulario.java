
import javax.swing.*;

public class Formulario extends JFrame{
    private JLabel label1;
    
    public Formulario(){
        setLayout(null);
        label1 = new JLabel("La Geekipedia de Juanka");
        label1.setBounds(10,20,200,300);
        add(label1); 
    }
    
    public static void main(String[] args){
        Formulario Formulario1 = new Formulario();
        Formulario1.setBounds(0,0,400,300);
        Formulario1.setVisible(true);
        Formulario1.setLocationRelativeTo(null);
    }
}


