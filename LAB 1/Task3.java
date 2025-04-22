import java.util.Scanner;
public class Task3 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an integer : ");
        double x = scan.nextDouble();

        if(x >= 0)
            System.out.println("root value : " + Math.sqrt(x));
        else
            System.out.println("Error!!!");
    }
}