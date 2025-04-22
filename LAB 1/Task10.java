import java.util.Scanner;
public class Task10 {
    public static void main(String[] args)
    {
        Scanner stdin = new Scanner(System.in);

        System.out.println("Enter lengths of two sides of a right triangle : ");
        int x = stdin.nextInt();
        int y = stdin.nextInt();

        System.out.println("hypotenuse : " + (int)Math.hypot(x, y));

    }

}