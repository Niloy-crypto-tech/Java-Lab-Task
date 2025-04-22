import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        System.out.print("Enter the coefficients a, b, c: ");
        double a = stdin.nextDouble();
        double b = stdin.nextDouble();
        double c = stdin.nextDouble();

        if (a == 0)
            System.out.println("Not a quadratic equation");
        else {
            double d = Math.pow(b, 2) - (4 * a * c);

            if (d > 0) {
                // Two distinct real roots
                double r1 = (-b + Math.sqrt(d)) / (2 * a);
                double r2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.printf("Roots are real and distinct: %.2f and %.2f\n", r1, r2);
            } else if (d == 0) {
                // One repeated real root
                double r3 = -b / (2 * a);
                System.out.printf("Root is real and repeated: %.2f\n", r3);
            } else {
                // Complex roots
                double real = -b / (2 * a);
                double imaginary = Math.sqrt(-d) / (2 * a);
                System.out.printf("Roots are complex: %.2f + %.2fi and %.2f - %.2fi%n",
                        real, imaginary, real, imaginary);
            }
        }
    }
}