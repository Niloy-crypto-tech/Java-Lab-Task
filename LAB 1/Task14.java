import java.util.Scanner;

public class Task14 {

    public static int getRandom(int min,int max)
    {
        int r = (int) (Math.random() * (max-min+1)) + min;  //Math.random()*(max - min + 1) Scales the random value to the range [0, max - min + 1). To shift this range to [min, max], you add min.

        return r;
    }
    public static void main(String[] args)
    {
        Scanner stdin = new Scanner(System.in);

        System.out.print("Enter the minimum value: ");
        int min = stdin.nextInt();

        System.out.print("Enter the maximum value: ");
        int max = stdin.nextInt();

        int res = getRandom(min,max);
        System.out.println("random number in range [" + min + "," + max + "] : " + res);
    }
}