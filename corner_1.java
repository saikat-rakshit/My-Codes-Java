package patterns;
import java.util.Scanner;
public class corner_1 
{
	public static void main(String[] args) 
	{
     int n;
     Scanner ob=new Scanner(System.in);
     System.out.print("Enter hoe many rows you want to print: ");
     n=ob.nextInt();
     int arr[][]=new int[n][n];
     for(int i=1;i<n;i++)
     {
    	 for(int j=1;j<n;j++)
    	 {
    		 if(i==j)
    			 arr[i][j]=1;
    		 else
    			 arr[i][j]=0;
    	 }
     }
     for(int i=1;i<n;i++)
     {
    	 for(int j=1;j<n;j++)
    	 {
    		System.out.print(arr[i][j]+" ");
    	 }
    	 System.out.println();
     }
	}
}
