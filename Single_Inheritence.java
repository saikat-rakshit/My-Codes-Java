//Example of Single Inheritence
class base
{
	int len,bred;
	base(int a, int b)
	{
		len=a;
		bred=b;
	}
	int area()
	{
		return(len*bred);
	}
}
class derived extends base
{
	int height;
	derived(int a,int b,int c)
	{
		super(a,b);
		height=c;
	}
	int volume()
	{
		return(len*bred*height);
	}
}
public class Single_Inheritence 
{
	public static void main(String[] args) 
	{
		derived ob=new derived(11,20,5);
		System.out.println("The area of the Rectangle is:"+ob.area());
		System.out.println("The volume of the Rectangle is:"+ob.volume());
	}
}
