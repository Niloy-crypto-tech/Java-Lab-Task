import java.util.Scanner;

public class charExtract {
    public static void main(String[] args) {
        System.out.println("enter string : ");
        Scanner stdin = new Scanner(System.in);
        String str = stdin.nextLine();
        int pos = stdin.nextInt();

        System.out.println(str.charAt(pos));
    }
}