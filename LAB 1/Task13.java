import java.util.Scanner;

public class Task13 {
    public static void main(String[] args)
    {
        Scanner stdin = new Scanner(System.in);

        // Convert degrees to radians
        System.out.printf("Enter angle in degrees: ");
        double degrees = stdin.nextDouble();
        double radians = Math.toRadians(degrees);
        System.out.printf("In radians: %.2f\n", radians);

        // Convert radians to degrees
        System.out.print("Enter angle in radians: ");
        radians = stdin.nextDouble();
        degrees = Math.toDegrees(radians);
        System.out.printf("In degrees: %.2f\n", degrees);

    }
}