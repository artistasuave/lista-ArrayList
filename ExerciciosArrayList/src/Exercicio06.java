
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Michelle de Jesus Rogério
 */
public class Exercicio06 {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            while (true) {
                try {
                    numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Digite um número")));
                    break;
                } catch (Exception e) {
                }
                JOptionPane.showMessageDialog(null, "Digite apenas números");
            }
        }
        String apresenta = "";
        for (int i = 0; i < 15; i++) {
            apresenta += numeros.get(i) + "\n";
        }
        JOptionPane.showMessageDialog(null, apresenta);
    }     
}
