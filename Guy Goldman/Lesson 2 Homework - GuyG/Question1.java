import java.util.Scanner;

public class Question1
{
    public static void main (String[]args)
    {
        Scanner scan=new Scanner(System.in);

        System.out.println("Please write something: ");
        String someInput=scan.next();

        int inputLength = someInput.length();
        char firstChar=someInput.charAt(0);
        char lastChar=someInput.charAt(inputLength-1);

        if (inputLength%2==0)
            System.out.println("Your input is EVEN, First char is: "+firstChar);
        else
            System.out.println("Your input is ODD, Last char is: "+lastChar);
    }
}
