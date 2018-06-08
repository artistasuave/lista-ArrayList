
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Michelle de Jesus Rogério
 */
public class Exercicio05 {
    
    public static void main (String[]args){
        ArrayList<String> nomes = new ArrayList<>();
        
        nomes.add(JOptionPane.showInputDialog("Digite um nome"));
        nomes.add(JOptionPane.showInputDialog("Digite um nome"));
        nomes.add(JOptionPane.showInputDialog("Digite um nome"));
        nomes.add(JOptionPane.showInputDialog("Digite um nome"));
        
        String nomeCinco = JOptionPane.showInputDialog("Digite mais um nome");
        
        
            if (nomes.contains(nomeCinco)){
                JOptionPane.showMessageDialog(null,"O quinto nome está contido no ArrayList");
            }else{
                JOptionPane.showMessageDialog(null, "O quinto nome NÃO está contido no ArrayList");
            }
        
        
        
        
        
        
    }
    
}
