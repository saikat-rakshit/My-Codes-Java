//Calculate Factorial(5!=5*4*3*2*1=120)
import java.util.*;
public class Factorial
{
public static void main(String arg[])
{
	int n,i,fact=1;
	Scanner ob =new Scanner(System.in);
	System.out.println("Enter any number: ");
	n=ob.nextInt();
	for(i=1;i<=n;i++)
	{
		fact=fact*i;
	}
	System.out.println(+n+"!="+fact);
}
}