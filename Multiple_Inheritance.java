//Example of Multiple Inheritance
//Basically Java does not support Multiple Inheritance concept.But we can achieve Multiple Inheritance by using Interface Concept.
package Inhreitance;

class X
{
	int a;
	void get_a(int avalue)
	{
		a=avalue;
	}
	void display_a()
	{
		System.out.println("The value of A is:"+a);
	}
}
class Y extends X
{
	int b,c;
	void get_b_c(int bvalue,int cvalue)
	{
		b=bvalue;
		c=cvalue;
	}
	void dispaly_b_c()
	{
		System.out.println("The value of B is:"+b);
		System.out.println("The value of C is:"+c);
	}
}
interface Z
{
	final int d=100;
	void display_d(); //Abstruct Method
}
class result extends Y implements Z
{
	public void display_d()
	{
		System.out.println("The value of D is:"+d);
	}
	int result;
	void display()
	{
		result=a+b+c+d;
		display_a();
		dispaly_b_c();
		display_d();
		System.out.println("A+B+C+D= "+result);
	}
}

public class Multiple_Inheritance 
{
	public static void main(String[] args) 
	{
		result R=new result();
		R.get_a(10);
		R.get_b_c(20,50);
		R.display();
	}
}
