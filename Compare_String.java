package String_Handling;

public class Compare_String 
{
	static String arr[]= {"Java","Python","Kotlin","C"};
	public static void main(String[] args) 
	{
		int len=arr.length;
		System.out.println(len);
		String t=null;
		for(int i=0;i<len-1;i++)
		{
			for(int j=0;j<len-i-1;j++)
			{
				System.out.println(arr[i]+" "+arr[j+1]);
				if(arr[j].compareTo(arr[j+1])>0)
				{
					t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
				}
			}
		}
		System.out.println("After Sorting:");
		for(int i=0;i<len;i++)
			System.out.println(arr[i]);
	}
}
