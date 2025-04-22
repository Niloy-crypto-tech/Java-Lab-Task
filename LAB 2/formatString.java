import java.util.Scanner;


public class formatString {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        System.out.println("Enter name : ");
        String name = stdin.nextLine();

        System.out.println("Enter no of messages : ");
        int messages = stdin.nextInt();

        String formattedString = String.format("Hello, %s! You have %d new messages.", name, messages);
        System.out.println(formattedString);

    }

}