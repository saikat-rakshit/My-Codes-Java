package String_Handling;
import java.util.Scanner;
public class String_Palindrome
{
	  public static void main(String[] arg)
	    {
	        Scanner ob=new Scanner(System.in);
	        System.out.print("Enter a string :");
	        String str1=ob.nextLine();
	        String str2= new String();
	       for(int i= str1.length()-1;i>=0;i--)
	       {
	            str2=str2+str1.charAt(i);
	           // System.out.println(i+" "+str2);
	       }
	        if(str2.equals(str1))
	            System.out.println("This is a Palindrome.");
	        else
	            System.out.println("This is not a Palindrome.");
	    }
}