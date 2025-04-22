import java.util.Scanner;

public class concat {
    public static void main(String[] args) {
        System.out.println("enter string : ");
        Scanner stdin = new Scanner(System.in);
        String str = stdin.nextLine();

        String arr[] = str.split(" ");

        for(String words : arr)
        {
            System.out.println(words);
        }
    }
}