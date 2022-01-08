package Try_User_Defined_Packages;

import Mypack1.*;
import Mypack2.*;
//Mypack1 and Mypack2 are two different user defined packages.

public class try_Mypack_1_2 
{
	public static void main(String args[])
	{
		my_pack1 ob1=new my_pack1();
		my_pack2 ob2=new my_pack2();
	    ob1.display1();
	    ob2.display2();
	}
}
