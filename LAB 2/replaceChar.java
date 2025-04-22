import java.util.Scanner;

public class replaceChar {
    public static void main(String[] args) {
        System.out.println("enter string : ");
        Scanner stdin = new Scanner(System.in);
        String str = stdin.nextLine();

        System.out.println("after replacing : " + str.replace("c", "x"));
    }
}