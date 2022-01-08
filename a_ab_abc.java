package Loop;
import java.util.*;
public class a_ab_abc 
{
	public static void main(String [] args)
	{
		int i,j,n;
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter the no of lines :");
		 n=sc.nextInt();
		 for(i=1;i<=5;i++)
		   {
		   int alphabet=65;                          //ASCII value of A
		   for(j=1;j<=i;j++)
		   {
		   System.out.print((char)alphabet);
		   alphabet++;
		   }
		   System.out.println();
		   }
	}
}