
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author Michelle de Jesus Rogério
 */
public class Exercicio02 {
    public static void main (String[]args){
        
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Rodrigo");
        nomes.add("Michelle");
        nomes.add("Luele");
        nomes.add("Matheus");
        nomes.add("Francisco");
        nomes.add("Maria");
        nomes.add("Tainara");
        nomes.add("Marcos");
        nomes.add("Samuel");
        nomes.add("Fábio");
        
        JOptionPane.showMessageDialog(null,
                "Primeiro nome: " + nomes.get(0)
                + "\nSegundo nome: " + nomes.get(1)
                +"\nTerceiro nome: " + nomes.get(2)
                +"\nQuarto nome: " + nomes.get(3)
                +"\nQuinto nome: " + nomes.get(4)
                +"\nSexto nome: " + nomes.get(5)
                +"\nSétimo nome: " + nomes.get(6)
                +"\nOitavo nome: " + nomes.get(7)
                +"\nNono nome: " + nomes.get(8)
                );
        
    }
}
