import java.util.Scanner;

public class Question5 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        final int MIN_LENGTH = 6;
        final int MAX_LENGTH = 10;

        System.out.println("Please enter a password:");
        String password = scan.next();
        char firstChar = password.charAt(0);

        if ((password.length() >= MIN_LENGTH && password.length() <= MAX_LENGTH) &&
                ((firstChar>='a'&& firstChar<='z')||(firstChar>='A'&& firstChar<='Z')))
        {
            System.out.println("Please enter the password again:");
            String passwordAgain = scan.next();

            if (password.equals(passwordAgain))
                System.out.println("Password was typed again correctly");
            else
                System.out.println("Passwords do not match!");
        }
        else
            System.out.println("Invalid password!");
    }
}