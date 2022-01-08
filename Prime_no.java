//Check Prime number (5 : 5 is divisible by 5 & 1 ; So,it is a Prime number)
import java.util.*;
public class Prime_no 
{
public static void main(String args[])
{
int n,i,k=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
n=sc.nextInt();
for(i=1;i<=n;i++)
{
	if(n%i==0)
		k++;
}
if(k<=2)
	System.out.printf("%d is a Prime Number.",n);
else
	System.out.printf("%d is not a Prime Number.",n);
}
}
