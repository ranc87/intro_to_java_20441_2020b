import java.util.Scanner;

public class Question2
{
    public static void main (String[]args)
    {
        Scanner scan=new Scanner(System.in);

        System.out.println("Please enter some input: ");
        String input=scan.next();

        if (input.length()==3)
            if (input.contains("@"))
                System.out.println("YES");
            else
                System.out.println("no");
        else
            System.out.println("Invalid input");
    }
}