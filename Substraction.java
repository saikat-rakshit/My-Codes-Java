package data_Input_Stream;
import java.io.*;

public class Substraction 
{
	public static void main(String[] args)throws IOException
	{
		int x=0,y=0;
		DataInputStream ob=new DataInputStream(System.in);
		
		System.out.print("Enter 1st number:");
		System.out.flush();
		String str1=ob.readLine();
		
		System.out.print("Enter 2nd number:");
		System.out.flush();
		String str2=ob.readLine();
		
		x=Integer.parseInt(str1);
		y=Integer.parseInt(str2);
		
		System.out.println(x+"-"+y+"="+(x-y));
	}
}
