import java.util.Scanner;
public class Task11 {
    public static void main(String[] args)
    {
        Scanner stdin = new Scanner(System.in);

        System.out.println("Enter radius : ");
        int r = stdin.nextInt();

        System.out.println("Area : " + (Math.PI * r * r));
        System.out.println("Circumference : " + (2 * Math.PI * r));
    }
}