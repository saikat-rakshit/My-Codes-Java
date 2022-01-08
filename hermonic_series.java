//Hermonic Series-->1+1/2+1/3+1/4+.........+1/n
package Loop;
import java.util.*;
public class hermonic_series {

	public static void main(String[] args) 
	{
	    float i,n;
		double sum=0.0;
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter no of digits: ");
		n=ob.nextInt();
		for(i=1;i<=n;i++)
		{
			sum=sum+1/i;
		}
		System.out.println("The sum of hremonic series is = "+sum);
	}
}
