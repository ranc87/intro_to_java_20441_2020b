import java.util.Scanner;

public class Question4
{
    public static void main (String[]args)
    {
        Scanner scan=new Scanner(System.in);

        System.out.println("Please enter 4 numbers");
        int firstNum=scan.nextInt();
        int secondNum=scan.nextInt();
        int thirdNum=scan.nextInt();
        int forthNum=scan.nextInt();

        if (firstNum>secondNum && firstNum>thirdNum && firstNum>forthNum)
            System.out.println("The number "+firstNum+", is the largest of the numbers");
        else
            if (secondNum>firstNum && secondNum>thirdNum && secondNum>forthNum)
                System.out.println("The number "+secondNum+", is the largest of the numbers");
            else
                if (thirdNum>firstNum && thirdNum>secondNum && thirdNum>forthNum)
                    System.out.println("The number "+thirdNum+", is the largest of the numbers");
                else
                    if( forthNum>firstNum && forthNum>secondNum && forthNum>thirdNum)
                        System.out.println("The number "+forthNum+", is the largest of the numbers");
                    else
                        System.out.println("all numbers are equal");
    }
}

