import java.util.Scanner;

public class checkSubstr {
    public static void main(String[] args) {
        System.out.println("enter string  : ");
        Scanner stdin = new Scanner(System.in);
        String str1 = stdin.nextLine();
        System.out.println("enter substring : ");
        String str2 = stdin.nextLine();

        System.out.println("if main string contains substring : " + str1.contains(str2));
    }
}