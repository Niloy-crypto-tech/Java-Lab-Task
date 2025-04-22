import java.util.Scanner;
public class Task1 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an integer : ");
        int x = scan.nextInt();

        System.out.println("absolute value : " + Math.abs(x));
    }

}