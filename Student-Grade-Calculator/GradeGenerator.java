import java.util.Scanner;

public class GradeGenerator
{
    static Scanner in = new Scanner(System.in);
    static public void MarksGetter()
    {
        System.out.println("_______________________________");
        System.out.println("Enter the number of subjects u have : ");
        int count = Integer.parseInt(in.nextLine());
        double[] marks = new double[count];

        for(int i = 1 ; i <= count ; i++)
        {
            System.out.println("Enter the score of the subject " + i + ":");
            marks[i-1] = Integer.parseInt(in.nextLine());
        }

        double total = sumGenerator(marks);
        double percentage = percentageGenerator(total , count);
        char grade = gradeGenerator(percentage);

        System.out.println("Your total is : " + total);
        System.out.println("Your percentage is : " + percentage);
        System.out.println("Your grade is : " +  grade);

    }

    static private double sumGenerator(double[] marks)
    {
        double sum = 0 ;
        for(double temp : marks)
        {
            sum += temp;
        }
        return sum ;
    }

    static private double percentageGenerator(double total , int count)
    {
        return total / count;
    }

    static private char gradeGenerator(double percentage)
    {
        if(percentage >=90)
        {
            return 'A';
        }
        else if(percentage >=70)
        {
            return 'B';
        }
        else if (percentage >=40)
        {
            return 'C';
        }
        else
        {
            return 'F';
        }
    }
}
