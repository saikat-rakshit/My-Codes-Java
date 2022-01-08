package String_Handling;
import java.util.*;
public class Reverse_String 
{
	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter any string: ");
		String st1=ob.nextLine();
		int stlen=st1.length();
		String revst="";
		for(int i=stlen-1;i>=0;i--)
		{
			revst=revst+st1.charAt(i);
		}
		System.out.println("The reverse string is:"+revst);
		System.out.println("The length of the string is: "+stlen);
	}
}
