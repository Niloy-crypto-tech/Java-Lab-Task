import java.util.Scanner;
public class Task5 {
    public static void main(String[] args)
    {
        Scanner stdin = new Scanner(System.in);

        System.out.println("Enter a floating number : ");
        float x = stdin.nextFloat();

        System.out.println("ceiling : " + Math.ceil(x));
        System.out.println("floor : " + Math.floor(x));
        System.out.println("round : " + Math.round(x));
    }
}