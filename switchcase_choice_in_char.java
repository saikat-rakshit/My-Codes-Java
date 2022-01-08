import java.util.Scanner;
public class switchcase_choice_in_char
{
	public static void main(String[] args) 
	{
		Scanner ob =new Scanner(System.in);
		
		System.out.print("What you want to do? Your chhoices are:-");
		System.out.print("\n a.Addition\n b.Subtraction\n c.Multiplication\n d.Divition\n e.Exit.\n");
		System.out.print("Enter your choice:");
		char ch=ob.next().charAt(0);
		
		System.out.print("Enter Two numbers:");
		int a=ob.nextInt();
		int b=ob.nextInt();
		
		switch(ch)
		{
		case 'a':System.out.print(a+"+"+b+"="+(a+b));
		break;
		case 'b':System.out.print(a+"-"+b+"="+(a-b));
		break;
		case 'c':System.out.print(a+"*"+b+"="+(a*b));
		break;
		case 'd':System.out.print(a+"/"+b+"="+(a/b));
		break;
		case 'e':break;
		}
	}
}
