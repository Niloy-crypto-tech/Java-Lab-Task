import java.util.Scanner;

public class equality {
    public static void main(String[] args) {
        System.out.println("enter string 1 : ");
        Scanner stdin = new Scanner(System.in);
        String str1 = stdin.nextLine();
        System.out.println("enter string 2 : ");
        String str2 = stdin.nextLine();

        boolean isEqual = str1.equals(str2);
        boolean equal = str2.equalsIgnoreCase(str1);

        System.out.println("case sensitive comparison : " + isEqual);
        System.out.println("case insensitive comparision : " + equal);
    }
}