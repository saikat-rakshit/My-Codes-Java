//Check Neon number (9 : 9^2=81 ; 8+1=9 ; 9=9)
import java.util.*;
public class Neon_no
{
	public static void main(String arg [])
	{
		int n,sq,smd=0,d;
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter any number : ");
		n= ob.nextInt();
		sq=n*n;
		while(sq>0)
		{
			d=sq%10;
			smd=smd+d;
			sq=sq/10;
		}
		if(n==smd)
			System.out.print(n+" is a Neon number.");
		else
		    System.out.print( n+" is not a Neon number.");
	}
}
