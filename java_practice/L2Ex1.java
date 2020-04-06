import java.util.Scanner;
public class L2Ex1
{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter a string:");
        String str1 = scan.next();
        if(str1.length()%2==0)
        {
            System.out.println(str1.charAt(0));
        }
        else{
            System.out.println(str1.charAt(str1.length()-1));
        }
        
        
        
    }

}
