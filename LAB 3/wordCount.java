import java.util.Scanner;
public class wordCount {
    public static void main(String[] args)
    {
        Scanner stdin = new Scanner(System.in);
        System.out.println("Enter a sentence : ");
        String sentence = stdin.nextLine();

        String[] arr = sentence.split(" ");

        System.out.println("number of words : " + arr.length);
    }

}