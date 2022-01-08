package String_Handling;
import java.util.*;
public class String_Palindrome2 
{
	public static void main(String[] args) 
	{
		int f=1;
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter a string:");
		String st1=ob.nextLine();
		char arr[]=st1.toCharArray();
		int len=st1.length();
		for(int i=0;i<len/2;i++)
		{
			if(arr[i]!=arr[len-i-1])
			{
				f=0;
				break;
			}
		}
		if(f==1)
			System.out.println("It is a Palindrome.");
		else
			System.out.println("It is not a Palindrome.");
	}
}