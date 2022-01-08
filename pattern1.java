package patterns;
import java.util.Scanner;
public class pattern1 
{
	public static void main(String[] args) 
	{
		int i,j,n;
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter how many rows you want to print:");
		n=ob.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.printf(" * ");
			}
			System.out.println(" ");
		}
	}

}
/*
*
**
***
****
*****
*/
