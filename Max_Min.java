//To find Maximum and Minimum number in an Array
package Array;
import java.util.Scanner;
public class Max_Min 
{
	public static void main(String[] args) 
	{
			 int arr[],max,min,n;
			 Scanner ob=new Scanner(System.in);
			 arr=new int[100];
			 System.out.print("Enter how many elements you want :");
			 n=ob.nextInt();
			 
			 System.out.print("Enter elements one by one :");
			 for(int i=0;i<n;i++)
			 {
				 arr[i]=ob.nextInt();
			 }
			 max=min=arr[0];
		
			 for(int i=1;i<n;i++)
			 {
				 if(arr[i]>max)
					 max=arr[i];
				 if(arr[i]<min)
					 min=arr[i];
			 }
			 System.out.println("The maximum number is:"+max);
			 System.out.println("The minimum number is:"+min);
	 }
}
