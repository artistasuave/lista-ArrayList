
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author Michelle de Jesus Rogério
 */
public class Exercicio01 {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(29);
        numeros.add(38);
        numeros.add(47);
        numeros.add(56);
        numeros.add(65);
        numeros.add(54);
        numeros.add(63);
        numeros.add(72);
        numeros.add(81);
        numeros.add(90);
        numeros.add(11);
        numeros.add(22);
        numeros.add(33);
        numeros.add(44);

        JOptionPane.showMessageDialog(null,
                "Primeiro número: " + numeros.get(0)
                + "\nSegundo número: " + numeros.get(1)
                + "\nTerceiro número: " + numeros.get(2)
                + "\nQuarto número: " + numeros.get(3)
                + "\nQuinto número: " + numeros.get(4)
                + "\nSexto número: " + numeros.get(5)
                + "\nSétimo número: " + numeros.get(6)
                + "\nOitavo número: " + numeros.get(7)
                + "\nNono número: " + numeros.get(8)
                + "\nDécimo número: " + numeros.get(9)
                + "\nDécimo primeiro número: " + numeros.get(10)
                + "\nDécimo segundo número: " + numeros.get(11)
                + "\nDécimo terceiro número: " + numeros.get(12)
                + "\nDécimo quarto número: " + numeros.get(13)
                + "\nDécimo quinto número: " + numeros.get(14));
    }
}
