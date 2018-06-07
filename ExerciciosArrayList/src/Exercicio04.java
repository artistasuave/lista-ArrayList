
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class Exercicio04 {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            while (true) {
                try {
                    numeros.add(Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Digite o número: ")));
                    break;
                } catch (Exception e) {
                }
                JOptionPane.showMessageDialog(null, "Digite apenas números");
            }
        }
        String apresenta1 = "", apresenta2 = "", apresenta3 = "";
        for (int i = 0; i < numeros.size(); i++) {
            apresenta1 += numeros.get(i) + "\n";
        }

        JOptionPane.showMessageDialog(null, apresenta1);
        numeros.remove(3);
        for (int i = 0; i < numeros.size(); i++) {
            apresenta2 += numeros.get(i) + "\n";
        }
        JOptionPane.showMessageDialog(null,
                "Apresentação dos números inseridos, exceto o quarto número: " + "\n" + apresenta2);

        numeros.remove(4);
        for (int i = 0; i < numeros.size(); i++) {
            apresenta3 += numeros.get(i) + "\n";
        }
        JOptionPane.showMessageDialog(null,
                "Apresentação dos números inseridos, exceto o quarto e o quinto número: "
                + "\n" + apresenta3
                + "\nA quantidade de números restantes após as remoções: " + numeros.size());
    }

}
