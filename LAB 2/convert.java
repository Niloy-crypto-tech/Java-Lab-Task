import java.util.Scanner;

public class convert {
    public static void main(String[] args) {
        System.out.println("enter string : ");
        Scanner stdin = new Scanner(System.in);
        String str = stdin.nextLine();

        System.out.println("in upper case : " + str.toUpperCase());
        System.out.println("in lower case : " + str.toLowerCase());
    }
}