//Check Duck number(Atleast 1 zero in the number except first digit is zero)
import java.util.*;
public class Duck_no 
{
public static void main(String arg[])
{
	int n,r,f=0,a;
	Scanner ob =new Scanner(System.in);
	System.out.println("Enter any number: ");
	n=ob.nextInt();
	a=n;
	while(n>0)
	{ 
		r=n%10;
		if(r==0)
		{
			f=1;
			break;
		}
		else
		{
			n=n/10;
		}
	}
	if(f==1)
	{
		System.out.println(+a+" is a Duck Number.");
	}
	else
	{
		System.out.println(+a+" is not a Duck Number.");
	}
}
}
