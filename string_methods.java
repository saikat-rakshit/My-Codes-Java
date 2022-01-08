package String_Handling;

public class string_methods
{
	public static void main(String[] args) 
	{
		String st1=new String(" SAIKAT ");
		
		System.out.println("The length of ' SAIKAT ' is: "+st1.length());
		
		String st6=st1.trim();
		System.out.println("The length of ' SAIKAT ' is after trimming: "+st6.length());
		
		String st2=st1.toLowerCase();
		System.out.println("The lower case string is: "+st2);
		String st3=st2.toUpperCase();
		System.out.println("The upper case string is: "+st3);
		
		String st4=new String("Sonu");
		String st5=st4.replace('S','M');
		System.out.println("After replaceing the new string is: "+st5);
		
		if(st1.equals(st2))
			System.out.println(st1+" and "+st2+" are equal.");
		else
			System.out.println(st1+" and "+st2+" are not equal.");
		
		if(st1.equalsIgnoreCase(st2))
			System.out.println(st1+" and "+st2+" are equal if ignore the casing.");
		else
			System.out.println(st1+" and "+st2+" are not equal.");


	}
}
