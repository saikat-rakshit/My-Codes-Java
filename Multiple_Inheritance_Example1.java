package Inhreitance;
import java.util.*;

class numbersq
{
	int n;
	Scanner ob=new Scanner(System.in);
	void get_n()
	{
		System.out.print("Enter any number:");
		n=ob.nextInt();
	}
}
class calculate extends numbersq 
{
	void sqr()
	{
		int sq=n*n;
	}
	void cube()
	{
		int qb=n*n*n;
	}
}
interface display
{
	void show();
}
class d extends calculate implements display
{
	public void show()
	{
		System.out.println(n+"^2="+sq);
		System.out.println(n+"^3="+qb);
	}
}
public class Multiple_Inheritance_Example1 
{
	public static void main(String[] args) 
	{
		d R=new d();
		R.get_n();
		R.sqr();
		R.cube();
		R.show();
	}
}