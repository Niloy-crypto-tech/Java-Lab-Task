import java.util.Arrays;
import java.util.Scanner;
public class sortChar {
    public static void main(String[] args)
    {
        Scanner stdin = new Scanner(System.in);

        System.out.println("Enter a sentence : ");
        String str = stdin.nextLine();

        char[] arr = str.toCharArray();
        Arrays.sort(arr);

        for(char sorted : arr)
        {
            System.out.printf("%c", sorted);
        }
    }
}