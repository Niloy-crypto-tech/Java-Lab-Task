import javax.swing.JOptionPane;

public class CircleApp {

    public static void main(String[] args) {

        String circleBox = JOptionPane.showInputDialog("Enter radius : ");
        int radius = Integer.parseInt(circleBox);

        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        String message = "Area is : " + area + " and circumference is : " + circumference;
        JOptionPane.showMessageDialog(null, message);
    }

}