package Loop;

import java.util.Scanner;

public class Multiplication_Table_1_to_Infinite 
{
	public static void main(String args[])
	{
		int x,y,i,j;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number how far will table you want:");
		x=s.nextInt();
		System.out.print("Enter the number how far will the multiplication you want:");
		y=s.nextInt();
		System.out.format("      ");
		for(i=1;i<=x;i++)
		{
			System.out.format("%4d",i);
		}
		System.out.println();
		System.out.println("---------------------------------------------------------------------------------------");
	    for(i=1;i<=y;i++)
	    {
	    	System.out.format("%5d |",i);
	    for(j=1;j<=x;j++)
	    {
	    	System.out.format("%4d",i*j);
	    }
	    System.out.println();
	    }
	}
}
