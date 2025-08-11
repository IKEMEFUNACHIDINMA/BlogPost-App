import javax.swing.JOptionPane;

public class AreaOfCircle {
    public static void main(String[] args){
        double radius = Double.parseDouble(JOptionPane.showInputDialog("Enter the radius: "));
        double area = Math.PI * radius * radius;

        String output = String.format("The area of the circle is %.2f", area);
        JOptionPane.showMessageDialog(null, output);

    }

}
