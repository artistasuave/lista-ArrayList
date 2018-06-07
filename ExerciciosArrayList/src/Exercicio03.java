
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Michelle de Jesus Rogério
 */
public class Exercicio03 {

    public static void main(String[] args) {
        ArrayList<Character> letras = new ArrayList<>();

        letras.add('T');
        letras.add('M');
        letras.add('o');
        letras.add('f');
        letras.add('C');
        letras.add('C');
        letras.add('k');
        letras.add('p');
        letras.add('f');
        letras.add('a');
        letras.add('R');
        letras.add('a');
        letras.add('m');
        letras.add('r');
        letras.add('L');

        JOptionPane.showMessageDialog(null,
                "Primeira letra: " + letras.get(0)
                + "\nSegunda letra: " + letras.get(1)
                + "\nTerceira letra: " + letras.get(2)
                + "\nQuarta letra: " + letras.get(3)
                + "\nQuinta letra: " + letras.get(4)
                + "\nSexta letra: " + letras.get(5)
                + "\nSétima letra: " + letras.get(6)
                + "\nOitava letra: " + letras.get(7)
                + "\nNona letra: " + letras.get(8)
                + "\nDécima letra: " + letras.get(9)
                + "\nDécima primeira letra: " + letras.get(10)
                + "\nDécima segunda letra: " + letras.get(11)
                + "\nDécima terceira letra: " + letras.get(12)
                + "\nDécima quarta letra: " + letras.get(13)
                + "\nDécima quinta letra: " + letras.get(14));
    }

}
