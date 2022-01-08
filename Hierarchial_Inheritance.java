//Example of Hierarchical Inheritance
package Inhreitance;
import java.util.*;

class number
{
	int a,b;
	Scanner ob=new Scanner(System.in);
	void get_num()
	{
		System.out.print("Enter two numbers:");
		a=ob.nextInt();
		b=ob.nextInt();
	}
}
class Addition extends number
{
	void jog()
	{
		System.out.println("The sum of the numbres="+(a+b));
	}
}
class Subtraction extends number
{
	void biog()
	{
		System.out.println("The subtraction of the numbers="+(a-b));
	}
}
public class Hierarchial_Inheritance 
{
	public static void main(String[] args) 
	{
		Addition add=new Addition();
		add.get_num();
		add.jog();
		Subtraction sub=new Subtraction();
		sub.get_num();
		sub.biog();
	}
}
