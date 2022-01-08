//Check Armstrong number(153 : 1^3 + 5^3 + 3^3 =153 (power is total no of digits in the number))
import java.util.Scanner;
public class ArmstrongNumber 
{
	public static void main(String[] args) 
	{
     int n,a,r,d=0,s=0;
     Scanner ob=new Scanner(System.in);
   	 System.out.print("Enter any number : ");
   	 n=ob.nextInt();
     a=n;
   	 while(a>0)
   	 {
   		 a=a/10;
   		 d++;
   	 }
     a=n;
   	 while(a>0)
   	 {
   		 r=a%10;
   		 s+=Math.pow(r,d);
   		 a=a/10;
   	 }
   	 if(n==s)
   		System.out.println(n+" is an Armstrong Number.");
     else
        System.out.println(n+" is not an Armstrong Number.");
    }
}
