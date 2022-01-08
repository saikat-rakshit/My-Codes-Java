package patterns;
import java.util.*;
public class pyramid_pattern 
{
	public static void main(String[] args) 
	{
		int i,j,k,n;
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter how many rows you want to print:");
		n=ob.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=i;j<=n-i;j++)
			{
				System.out.println(" ");
				for(k=1;k<=i;k++)
				{
					System.out.println(" * ");
				}
			}
			System.out.println("");
		}
	}
}