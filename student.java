import java.util.*;
class studentdata
{
	int roll,marks;
	String name;
	void getdata()
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter Student Roll:");
		roll=ob.nextInt();
		System.out.println("Enter Student Name:");
		name=ob.nextLine();
		System.out.print("Enter Student Marks:");
		marks=ob.nextInt();
	}
	void display()
	{
		System.out.println("ROLL: "+roll);
		System.out.println("Name: "+name);
		System.out.println("Marks: "+marks);
	}
}
public class student 
{
	public static void main(String[] args) 
	{
		studentdata ab=new studentdata();
		ab.getdata();
		ab.display();
	}
}
