import java.util.Scanner;
class Grade
{
    private String Name;
    private int Roll;
    private double Mark;
    private char Grade;

    public Grade(String Name,int Roll,double Mark)
    {
        this.Name = Name;
        this.Roll = Roll;
        this.Mark = Mark;
        this.Grade = GradeCalculation();
    }

    private char GradeCalculation()
    {
        if(Mark >= 80)
            return 'A';
        else if(Mark >= 70)
            return 'B';
        else if(Mark >= 60)
            return 'C';
        else if(Mark >= 50)
            return 'D';
        else
            return 'F';

    }

    public void display()
    {
        System.out.println("Name : " + Name);
        System.out.println("Roll : " + Roll);
        System.out.println("Mark : " + Mark);
        System.out.println("Grade : " + Grade);
    }

    public static void main(String[] args)
    {
        Scanner stdin = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = stdin.nextLine();

        System.out.println("Enter roll: ");
        int roll = stdin.nextInt();

        System.out.println("Enter mark: ");
        double mark = stdin.nextDouble();

        Grade g = new Grade(name,roll,mark);

        g.display();
    }
}