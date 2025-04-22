import java.util.Scanner;
public class rotation {
    public static void main(String[] args)
    {
        Scanner stdin = new Scanner(System.in);
        System.out.println("Enter string1 : ");
        String str1 = stdin.nextLine();

        System.out.println("Enter string2 : ");
        String str2 = stdin.nextLine();

        if((str1.length() == str2.length()) && ((str1 + str1).contains(str2)))
            System.out.println("Rotation");
        else
            System.out.println("Not Rotation");
    }

}