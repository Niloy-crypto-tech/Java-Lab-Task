import javax.swing.JOptionPane;

public class AdditionApp {

    public static void main(String[] args)
    {
        String num1Box = JOptionPane.showInputDialog("Enter first integer : ");
        int num1 = Integer.parseInt(num1Box);

        String num2Box = JOptionPane.showInputDialog("Enter second integer : ");
        int num2 = Integer.parseInt(num2Box);

        int sum = num1 + num2;
        JOptionPane.showMessageDialog(null, sum);
    }

}