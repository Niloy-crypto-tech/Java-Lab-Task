import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        System.out.println("Enter an ingteger : ");
        int x = stdin.nextInt();

        System.out.println("natural logarithm : " + Math.log(x));
        System.out.println("base-10 logarithm : " + Math.log10(x));
    }
}