import java.util.Scanner;

public class longestWords {
    public static void main(String[] args)
    {
        Scanner stdin = new Scanner(System.in);

        System.out.println("Enter sentence : ");
        String s = stdin.nextLine();

        String[] str = s.split(" ");

        String LongestWord = str[0];

        for(int i=0; i<str.length; i++)
        {
            if(str[i].length() > LongestWord.length())
                LongestWord = str[i];
        }

        System.out.println(LongestWord);
    }
}