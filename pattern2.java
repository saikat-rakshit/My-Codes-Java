package patterns;
import java.util.*;
public class pattern2 
{
	public static void main(String[] args) 
	{
		int n,i,j;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter how many rows you want to print:");
		n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" * ");
			}
			System.out.println("");
		}
	}
}
/*
*****
****
***
**
*
*/