import java.util.Scanner;

public class substring {
    public static void main(String[] args) {
        System.out.println("enter string : ");
        Scanner stdin = new Scanner(System.in);
        String str = stdin.nextLine();

        System.out.println("where to end the string : ");
        int pos = stdin.nextInt();
        System.out.println("substring : " + str.substring(0,pos));

    }
}