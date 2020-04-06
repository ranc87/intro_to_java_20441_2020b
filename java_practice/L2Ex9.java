public class L2_Ex9
{
	public static void main(String[] args) {
	int a=7 , b=2,c=2 , max = 0, min= 0 ,mid= 0;
	max = Math.max(Math.max(a,b),c);
	min = Math.min(Math.min(a,b),c);

	if (max>=a && a>=min) mid = a;
	if (max>=b && b>=min) mid = b;
    	if (max>=c && c>=min) mid = c;	
	
    System.out.println( "" + min +  mid + max    );


	}
}
