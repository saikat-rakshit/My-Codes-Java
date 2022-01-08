/* Program to extract a portion of a character string and print the extracted string */
package String_Handling;

import java.io.DataInputStream;     // to load DataInputStream class        

public class extract_string 
{	
	    public static void main(String[] args)
	    {
	        String str1 = new String();
	        String str2 = new String();
	        int m=0,n=0;
	        DataInputStream in = new DataInputStream(System.in);

	        try
	        {
	            System.out.print("Enter String : ");
	            str1 = in.readLine();
	            System.out.println(" String is : "+str1);
	            System.out.print("Enter no. of chracters to be extracted from string : ");
	            m = Integer.parseInt(in.readLine());
	            System.out.print("Enter starting index : ");
	            n = Integer.parseInt(in.readLine());
	        }
	        catch(Exception e) {  System.out.println("I/O Error");   }

	       
	        str2=str1.substring(n,(m+n));
	        System.out.println(" Extracted String is : "+str2);
	    }
}

