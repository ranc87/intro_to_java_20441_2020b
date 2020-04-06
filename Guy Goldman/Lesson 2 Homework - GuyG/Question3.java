import java.util.Scanner;

public class Question3
{
    public static void main (String[]args)
    {
        Scanner scan=new Scanner(System.in);
        final int BUS_SPACE=40;
        int numberOfBuses;
        int numberOfStudents;

        System.out.println("How many students will participate in the field trip?");
        numberOfStudents=scan.nextInt();
        numberOfBuses=numberOfStudents/BUS_SPACE;

        if (numberOfStudents%BUS_SPACE!=0)
            numberOfBuses++;

        System.out.println("You will need "+numberOfBuses+" for this trip.");
    }
}