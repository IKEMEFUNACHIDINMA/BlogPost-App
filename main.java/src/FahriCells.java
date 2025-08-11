import javax.swing.JOptionPane;

public class FahriCells {
    public static void main(String[] args){
        double fahrenheit = Double.parseDouble(JOptionPane.showInputDialog("Enter the fahrenheit value: "));
        double celsius = (5.0 / 9.0) * (fahrenheit - 32);
        JOptionPane.showMessageDialog(null, String.format("The temperature in degree celsius is: %.2f", celsius));

    }
}
