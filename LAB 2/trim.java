import java.util.Scanner;

public class trim {
    public static void main(String[] args) {
        System.out.println("enter string : ");
        Scanner stdin = new Scanner(System.in);
        String str = stdin.nextLine();

        System.out.println("trimmed string :" + str.trim());

    }
}