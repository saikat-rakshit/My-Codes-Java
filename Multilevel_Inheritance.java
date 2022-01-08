//Example of Multilavel Inheritance
package Inhreitance;
import java.util.*;

class A
{
	int x,y;
	Scanner ob=new Scanner(System.in);
}
class B extends A
{
	void get_x()
	{
		System.out.print("Enter 1st Number:");
		x=ob.nextInt();
	}
}
class C extends B
{
	void get_y()
	{
		System.out.print("Enter 2nd Number:");
		y=ob.nextInt();
	}
}
class D extends C
{
	void sum()
	{
		System.out.println("The sum of numbers="+(x+y));
	}
}
public class Multilevel_Inheritance 
{
	public static void main(String[] args) 
	{
		D ob1=new D();
		ob1.get_x();
		ob1.get_y();
		ob1.sum();
	}
}
