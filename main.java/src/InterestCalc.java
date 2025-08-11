import javax.swing.JOptionPane;

public class InterestCalc {
    public static void main(String[] args){
double accountBalance = Double.parseDouble(JOptionPane.showInputDialog("Enter the account balance: "));
double interestRate = Double.parseDouble(JOptionPane.showInputDialog("Enter the annual Interest rate as a percentage: "));

double interestPayment = accountBalance * (interestRate / 100);
double newBalance = accountBalance + interestPayment;

String output = String.format("The new balance after one year is %.3f", newBalance);
JOptionPane.showMessageDialog(null, output);


    }
}
