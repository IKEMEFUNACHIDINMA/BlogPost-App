import javax.swing.JOptionPane;
public class main1 {
public static void main(String[] args){
    //Declare and initialize variables
    String name, prog;

    //Get your user input
    name = JOptionPane.showInputDialog("Enter your name: ");
    prog = JOptionPane.showInputDialog("What is your program of study? ");

    //Create output string
    String output = String.format("Hello %s, you study %s", name, prog);

    //Display output
    JOptionPane.showMessageDialog(null, output);

    //Exit with success status(0)
    System.exit(0);
}
}
