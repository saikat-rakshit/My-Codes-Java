//To calculate GCD and LCM
import java.util.*;
public class GCD_and_LCM {

	public static void main(String[] args) 
	{
		int n1,n2,i,gcd=1,lcm;
		Scanner ob =new Scanner(System.in);
		System.out.print("Enter any two number: ");
		n1=ob.nextInt();
		n2=ob.nextInt();
		for(i=1;i<=n1 && i<=n2;i++)
		{
			if(n1%i==0 && n2%i==0)
			{
				gcd=i;
			}
		}
		lcm=(n1*n2)/gcd;
		System.out.println("GCD of "+n1+" and "+n2+" is "+gcd);
		System.out.printf("LCM of %d and %d is %d",n1,n2,lcm);
	}
}
