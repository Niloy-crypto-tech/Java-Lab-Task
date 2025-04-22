import java.util.Scanner;


public class countVowel {
    public static void main(String[] args)
    {
        Scanner stdin = new Scanner(System.in);

        System.out.println("Enter string : ");
        String INFO = stdin.nextLine();

        String info = INFO.toLowerCase();

        int vowel = 0, constant = 0;

        for(int i=0; i<info.length(); i++)
        {
            char ch = info.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                vowel++;
            else
                constant++;
        }
        System.out.println("number of vowels " + vowel);
        System.out.println("number of constants " + constant);

    }

}