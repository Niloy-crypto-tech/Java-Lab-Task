import java.util.Scanner;

public class calaculateString {
    public static void main(String[] args) {
        System.out.println("enter string : ");
        Scanner stdin = new Scanner(System.in);
        String info = stdin.nextLine();

        System.out.println(info.length());
    }
}