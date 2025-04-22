import java.util.Scanner;
public class capitalize  {
    public static void main(String[] args)
    {
        Scanner stdin = new Scanner(System.in);
        System.out.println("Enter a sentence : ");
        String sentence = stdin.nextLine();

        String[] arr = sentence.split(" ");

        StringBuilder newStr = new StringBuilder();

        for(String words : arr)
        {
            String s = words.substring(0, 1).toUpperCase() + words.substring(1);
            newStr.append(s).append(" ");
        }
        System.out.println(newStr.toString());
    }

}