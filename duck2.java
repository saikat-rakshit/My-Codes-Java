//Check Duck number(Atleast 1 zero in the number except first digit is zero)
import java.util.Scanner;
public class duck2 
{
	 public static void main(String[] args)
	 {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter a number");
	   int num=sc.nextInt();
	   int c = 0,r;
	   while(num!=0)
	   {
	    r=num%10;
	    if(r==0)
	     c++;
	    num=num/10;
	   }
	   if(c>0)
	    System.out.println("It is a duck number");
	   else
	    System.out.println("It is not a duck number");
	 }
}