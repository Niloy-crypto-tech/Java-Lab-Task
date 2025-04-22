import java.util.Scanner;


public class palindrome {
    public static void main(String[] args)
    {
        Scanner stdin = new Scanner(System.in);

        System.out.println("Enter string : ");
        String info = stdin.nextLine();

        StringBuilder sb = new StringBuilder(info);


        if(info.equals(sb.reverse().toString()))
            System.out.println("The string is a palindrome.");
        else
            System.out.println("The string is not a palindrome.");

    }

}