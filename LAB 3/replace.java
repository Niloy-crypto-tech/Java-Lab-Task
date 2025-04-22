import java.util.Scanner;
public class replace {
    public static void main(String[] args)
    {
        Scanner stdin = new Scanner(System.in);

        System.out.println("Enter a sentence : ");
        String str = stdin.nextLine();

        System.out.println("after replaceing  all spaces with a specified character : " + str.replace(" ", "/"));

    }
}