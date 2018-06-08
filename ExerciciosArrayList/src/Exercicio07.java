
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author Michelle de Jesus Rogério
 */
public class Exercicio07 {

    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        for (int i = 0; i < 25; i++) {
            nomes.add(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º nome"));
        }

        String apresentaNomes = "";
        for (int i = 0; i < 25; i++) {
            apresentaNomes += nomes.get(i) + "\n";
        }
        JOptionPane.showMessageDialog(null, "Os nomes cadastrados são: " + apresentaNomes);

        String maiorNome = "";
        String menorNome = "";

        for (int i = 0; i < 25; i++) {
            if (nomes.get(i).length() > maiorNome.length()) {
                maiorNome = nomes(i);
            }
        }
//maior nome
        //menor nome
        //qtd paulo
        //qtd ana
        //qtd pessoas primeira letra vogal

    }
}
