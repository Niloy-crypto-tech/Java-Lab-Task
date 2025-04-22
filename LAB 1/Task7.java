import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        System.out.println("Enter degree: ");
        float x = stdin.nextFloat();

        // Convert degrees to radians
        double radians = Math.toRadians(x);

        System.out.println("sin: " + Math.sin(radians));
        System.out.println("cos: " + Math.cos(radians));
        System.out.println("tan: " + Math.tan(radians));
    }
}