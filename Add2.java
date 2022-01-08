package data_Input_Stream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.*;
public class Add2 
{
	public static void main(String[] args) 
	{
		int x=0,y=0;
		try
		{
			DataInputStream in=new DataInputStream(System.in);
			System.out.print("Enter first number:");
			System.out.flush();
			String str1=in.readLine();
			System.out.print("Enter second number:");
			System.out.flush();
			String str2=in.readLine();
			
			x=Integer.parseInt(str1);
			y=Integer.parseInt(str2);
		}
		catch(IOException e)
		{
			System.out.println("I/O Error.");
		}
		int z=x+y;
		System.out.print(x+"+"+y+"="+z);
	}
}
