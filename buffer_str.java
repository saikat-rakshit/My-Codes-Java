package buffer_String;

public class buffer_str 
{
	public static void main(String[] args) 
	{
		StringBuffer str=new StringBuffer("Welcome Java");
		System.out.println("The original String is : "+str);
		int len=str.length();
		System.out.println("The length of the string is:"+len);
		for(int i=0;i<len;i++)
		{
			System.out.println("In position "+(i+1)+" is "+str.charAt(i));
		}
		//Inserting new String in middle
		String str1=new String(str.toString());
		int p=str1.indexOf("java");
		str.insert(p," to the ");
		System.out.println("The modified string is: "+str);
		
		//Inserting a Character
		str.setCharAt(7,'-');
		System.out.println("The new string is: "+str);
		
		//Append a String at last
		str.append(" World..");
		System.out.println("After final modification the string is: "+str);
	}
} 