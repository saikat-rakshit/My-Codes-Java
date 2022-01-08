//Check Perfect number(6 : 6 is divisible by 1,2,3 ; 1+2+3=6 ; 6=6) Ex:28
import java.util.*;
public class Perfect_no
{
public static void main(String args[]) 
	{
		int n,i,x=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
	    n=sc.nextInt();
	    for(i=1;i<n;i++)
	    {
	    	if(n%i==0)
	    		x=x+i;
	    	else
	    		continue;
	    }
	    if(n==x)
         System.out.print(n+" is a Perfect Number.");
	    else
	     System.out.print(n+" is not a Perfect Number.");
	}
}