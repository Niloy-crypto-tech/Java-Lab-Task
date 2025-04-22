import java.util.Scanner;

public class stringCompression {
    public static void main(String[] args)
    {
        Scanner stdin = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = stdin.nextLine();

        StringBuilder compressedStr = new StringBuilder();
        int count = 1;


        for (int i = 0; i < str.length(); i++) {
            if (i < str.length()-1 && str.charAt(i) == str.charAt(i+1))
                count++;
            else
            {
                compressedStr.append(str.charAt(i)); // Append the character
                compressedStr.append(count); // Append the count
                count = 1; // Reset count for the next character
            }
        }
        System.out.println("Compressed string: " + compressedStr.toString());
    }
}