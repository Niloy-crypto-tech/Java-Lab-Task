import java.util.Scanner;


public class frequencyCount {
    public static void main(String[] args)
    {
        Scanner stdin = new Scanner(System.in);

        System.out.println("Enter string : ");
        String info = stdin.nextLine();

        int[] frequency = new int[256];

        for(int i=0; i<info.length(); i++)
        {
            char ch = info.charAt(i);
            frequency[ch]++;         // Increment the frequency of the character
        }

        System.out.println("Character Frequency Table:");
        System.out.println("--------------------------");

        for(int i=0; i<frequency.length; i++)
        {
            if(frequency[i] > 0)
                System.out.println((char) i + " : " + frequency[i]);

        }


    }

}