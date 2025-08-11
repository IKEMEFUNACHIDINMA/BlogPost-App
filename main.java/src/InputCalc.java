import javax.swing.JOptionPane;

public class InputCalc {
    public static void main(String[] args){
double num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the first number: "));
double num2 = Double.parseDouble(JOptionPane.showInputDialog("Enter the second number: "));
double addition = num1 + num2;
double subtraction = num1 - num2;
double multiple = num1 * num2;
double division = num1/num2;
double average = addition/2;

//next practice, make sure num2 is not = to 0 to avoid zero error division

        JOptionPane.showMessageDialog(null, String.format("The addition of %.1f and %.1f is %.2f.\n The subtraction of %.1f and %.1f is %.2f. ", num1, num2, addition, num1, num2, subtraction));
        //JOptionPane.showMessageDialog(null, String.format("The subtraction of %.1f and %.1f is %.2f ", num1, num2, subtraction));
        JOptionPane.showMessageDialog(null, String.format("The multiplication of %.1f and %.1f is %.2f ", num1, num2, multiple));
        JOptionPane.showMessageDialog(null, String.format("The division of %.1f and %.1f is %.2f ", num1, num2, division));
        JOptionPane.showMessageDialog(null, String.format("The average is: %.2f", average));

    }
}
