
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author Michelle de Jesus Rogério
 */
public class Exercicio07 {

    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            nomes.add(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º nome").trim().toUpperCase());
        }

        String apresentaNomes = "";
        for (int i = 0; i < nomes.size(); i++) {
            apresentaNomes += nomes.get(i) + "\n";
        }

        String maiorNome = "";
        String menorNome = "";
        int contadorPaulo = 0, contadorAna = 0, contadorVogal = 0;

        for (int i = 0; i < nomes.size(); i++) {
            if (nomes.get(i).length() > maiorNome.length()) {
                maiorNome = nomes.get(i);
            }
            if (nomes.get(i).length() < maiorNome.length()) {
                menorNome = nomes.get(i);
            }
            if (nomes.get(i).equals("PAULO")) {
                contadorPaulo++;
            }
            if (nomes.get(i).equals("ANA")) {
                contadorAna++;
            }
            /*
            char vogal = nomes.get(i).charAt(0);
            if ((vogal == 'a') || (vogal == 'e') || (vogal == 'i') || (vogal == 'o') || (vogal == 'u')) {
                contadorVogal++;
            }*/
        }

        JOptionPane.showMessageDialog(null,
                "Os nomes cadastrados são: " + apresentaNomes
                + "\nO maior nome é: " + maiorNome
                + "\nO menor nome é: " + menorNome
                + "\nA quantidade de \"Paulo's\" cadastrados é: " + contadorPaulo
                + "\nA quantidade de \"Ana's\" cadastradas é: " + contadorAna
                + "\nA quantidade de nomes cadastrados que iniciam-se com vogal é: " + contadorVogal);

    }
}
