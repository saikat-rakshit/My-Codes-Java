import java.util.*;
public class Switch_case
{
	public static void main(String[] args) 
	{
		Scanner ob =new Scanner(System.in);
		
		System.out.print("What you want to do? Your chhoices are:-");
		System.out.print("\n 1.Addition\n 2.Subtraction\n 3.Multiplication\n 4.Divition\n 5.Exit.\n");
		System.out.print("Enter your choice:");
		int ch=ob.nextInt();
		
		System.out.print("Enter Two numbers:");
		int a=ob.nextInt();
		int b=ob.nextInt();
		
		switch(ch)
		{
		case 1:System.out.print(a+"+"+b+"="+(a+b));
		break;
		case 2:System.out.print(a+"-"+b+"="+(a-b));
		break;
		case 3:System.out.print(a+"*"+b+"="+(a*b));
		break;
		case 4:System.out.print(a+"/"+b+"="+(a/b));
		break;
		case 5:break;
		}
	}
}
