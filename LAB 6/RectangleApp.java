import javax.swing.JOptionPane;

public class RectangleApp {

    public static void main(String[] args) {

        String breadthBox = JOptionPane.showInputDialog("Enter breadth : ");
        int b = Integer.parseInt(breadthBox);

        String heightBox = JOptionPane.showInputDialog("Enter height : ");
        int h = Integer.parseInt(heightBox);

        double area = b * h;

        JOptionPane.showMessageDialog(null, area);
    }

}