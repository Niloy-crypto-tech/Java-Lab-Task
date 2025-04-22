import javax.swing.JOptionPane;

public class TriangleApp {

    public static void main(String[] args)
    {

        String side1 = JOptionPane.showInputDialog("Enter length of side a:");
        double a = Double.parseDouble(side1);

        String side2 = JOptionPane.showInputDialog("Enter length of side b:");
        double b = Double.parseDouble(side2);

        String side3 = JOptionPane.showInputDialog("Enter length of side c:");
        double c = Double.parseDouble(side3);

        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        JOptionPane.showMessageDialog(null,area);
    }
}

