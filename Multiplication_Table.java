package Loop;
import java.util.*;
public class Multiplication_Table 
{
	public static void main(String[] args) 
	{
		int n,i;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number which table you want:");
		n=s.nextInt();
		for(i=1;i<=10;i++)
			System.out.println(n+" * "+i+" = "+(n*i));
		/*for(i=1;i<=10;i++)
		{
			System.out.print(n+" ");
		}
		System.out.println();
		for(i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		for(i=1;i<=10;i++)
		{
			System.out.print(n*i+" ");
		}*/
    }
}