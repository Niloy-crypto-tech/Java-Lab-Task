import java.util.Scanner;

public class split {
    public static void main(String[] args) {
        System.out.println("enter string 1 : ");
        Scanner stdin = new Scanner(System.in);
        String str1 = stdin.nextLine();
        System.out.println("enter string 2 : ");
        String str2 = stdin.nextLine();

        System.out.println("using concat: " + str1.concat(str2));
        System.out.println("using + : " + str1 + str2);
    }
}