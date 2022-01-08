//To Print Fibonacci Series
import java.util.Scanner;
public class Fibonacci_series {

	public static void main(String[] args) 
	{
		int n,n1=0,n2=0,n3=1,i=1;
		Scanner ob =new Scanner(System.in);
		System.out.println("Enter how many digits you want in Fibonacci Series: ");
		n=ob.nextInt();
		System.out.print("Fibonacci Series : ");
		/*for(i=1;i<=n;i++)
		{
			n1=n2;
			n2=n3;
			n3=n1+n2;
			System.out.print(n1+" ");
		}*/
		while(i<=n)
		{
			n1=n2;
			n2=n3;
			n3=n1+n2;
			System.out.print(n1+" ");
			i++;
		}
    }
}
