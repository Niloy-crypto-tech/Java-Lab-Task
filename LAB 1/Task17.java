import java.util.Random;

public class Task17 {
    public static void main(String[] args)
    {
        Random random = new Random();
        int[] sumCounts = new int[13]; // Array to count occurrences of each sum (indices 2–12 used)

        int rolls = 1000; // Number of rolls
        for (int i = 0; i < rolls; i++)
        {
            // Roll two dice
            int die1 = random.nextInt(6) + 1; // Random number between 1 and 6
            int die2 = random.nextInt(6) + 1; // Random number between 1 and 6
            int sum = die1 + die2;

            // Increment the count for this sum
            sumCounts[sum]++;
        }

        // Calculate and display the percentages
        System.out.println("Sum\tOccurrences\tPercentage");
        for (int sum = 2; sum <= 12; sum++)
        {
            double percentage = (sumCounts[sum] * 100.0) / rolls;
            System.out.printf("%d\t%d\t\t%.2f%%%n", sum, sumCounts[sum], percentage);
        }
    }
}