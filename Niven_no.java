//Check Niven or Harshad number(18 : 1+8=9 ; 18%9==0)
import java.util.*;
public class Niven_no 
{
	public static void main(String arg[])
	{
	 int n,a,smd=0,d;
	 Scanner ob=new Scanner(System.in);
	 System.out.print("Enter any number : ");
	 n=ob.nextInt();
	 a=n;
	 while(n>0)
	 {
		 d=n%10;
		 smd=smd+d;
		 n=n/10;
	 }
	 if(a%smd==0)
		 System.out.print(a+" is a Niven number.");
	 else
		 System.out.print(a+" is not a Niven number.");
	}
}
