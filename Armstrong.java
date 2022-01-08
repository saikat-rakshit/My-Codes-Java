//Check Armstrong number(153 : 1^3 + 5^3 + 3^3 =153)(till 3 digits in this program)
import java.util.*;
public class Armstrong 
{
    public static void main(String[] args) 
    {
        int n,r,a,s=0;
        Scanner ob=new Scanner(System.in);
      	System.out.print("Enter any number : ");
      	n=ob.nextInt();
      	a=n;
      	while(n>0)
      	{
      		r=n%10;
      		s=s+(r*r*r);
      		n=n/10;
      	}
    	if(a==s)
            System.out.println(a+ " is an Armstrong number.");
        else
            System.out.println(a+ " is not an Armstrong number.");
    }
}
