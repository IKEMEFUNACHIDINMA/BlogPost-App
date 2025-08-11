import javax.swing.JOptionPane;
public class Conversion {
    public static void main(String[] args){
        double val = Double.parseDouble(JOptionPane.showInputDialog("Enter a numeric value: "));
        double val2 = Double.parseDouble(JOptionPane.showInputDialog("Enter another numeric value: "));
        double product = val * val2;
        String output = String.format("The product of %.1f and %.1f is %.2f .", val, val2, product);
        JOptionPane.showMessageDialog(null, output);
        System.exit(0);

    }
}

