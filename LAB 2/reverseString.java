import java.util.Scanner;


public class reverseString {
    public static void main(String[] args)
    {
        Scanner stdin = new Scanner(System.in);

        System.out.println("Enter string : ");
        String info = stdin.nextLine();

        StringBuilder sb = new StringBuilder(info);
        System.out.println("reverse string : " + sb.reverse());

    }

}