import java.util.Arrays;
import java.util.Scanner;
public class anagram {
    public static void main(String[] args)
    {
        Scanner stdin = new Scanner(System.in);
        System.out.println("Enter string1 : ");
        String str1 = stdin.nextLine();

        System.out.println("Enter string2 : ");
        String str2 = stdin.nextLine();

        char[] arr1 = str1.toCharArray();
        Arrays.sort(arr1);

        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr2);

        if(Arrays.equals(arr1, arr2))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }

}