import java.util.Scanner;

class NegativeNumberException extends Exception
{
    public NegativeNumberException(String message)
    {
        super(message);
    }
}

class SmallerFirstNumberException extends Exception
{

    public SmallerFirstNumberException(String message)
    {
        super(message);
    }
}

class DivideByZeroException extends Exception
{

    public DivideByZeroException(String message)
    {
        super(message);
    }
}

public class NumberCheck {

    public static void checkMultiple(int num1, int num2) throws NegativeNumberException, SmallerFirstNumberException, DivideByZeroException
    {
        if (num1 < 0 || num2 < 0)
        {
            throw new NegativeNumberException("Negative numbers are not allowed.");
        }
        if (num1 < num2)
        {
            throw new SmallerFirstNumberException("First number is smaller than the second number.");
        }
        if (num2 == 0)
        {
            throw new DivideByZeroException("Second number cannot be zero.");
        }

        if (num1 % num2 == 0)
        {
            System.out.println(num1 + " is a multiple of " + num2);
        }
        else
        {
            System.out.println(num1 + " is not a multiple of " + num2);
        }
    }

    public static void main(String[] args)
    {
        Scanner stdin = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = stdin.nextInt();
        System.out.print("Enter second number: ");
        int num2 = stdin.nextInt();

        try
        {
            checkMultiple(num1, num2);
        }
        catch (Exception e)
        {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}