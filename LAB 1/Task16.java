import java.util.Scanner;

public class Task16 {
    public static void main(String[] args)
    {
        Scanner stdin = new Scanner(System.in);

        System.out.printf("Enter the coordinates of the first point (x1 y1): ");
        int x1 = stdin.nextInt();
        int y1 = stdin.nextInt();

        System.out.printf("Enter the coordinates of the second point (x2 y2): ");
        int x2 = stdin.nextInt();
        int y2 = stdin.nextInt();


        double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.printf("Euclidean distance: %.2f\n", d);

    }
}