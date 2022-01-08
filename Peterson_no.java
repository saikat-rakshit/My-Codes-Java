//Check Peterson or Krishnamurty number(145 : 1!+4!+5!=145) 
import java.util.*;
public class Peterson_no
{
	public static void main(String[] args) 
	{
int n,fact,sf=0,a,r,i;
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number:");
n=sc.nextInt();
a=n;
while(n>0)
{
	r=n%10;
	fact=1;
	for(i=1;i<=r;i++)
	{
		fact=fact*i;
	}
	sf=sf+fact;
	n=n/10;
}
if(a==sf)
  System.out.print(a+" is a Peterson Number.");
else
	System.out.print(a+" is not a Peterson Number.");
	}
}
