package javaProgram;

import java.io.IOException;
import java.lang.Exception.*;

public class Exception {

	public static void main(String[] args) throws IOException {
		int a=5,b=0;
		try
		{
			System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("i catched the error");
		}
		finally
		{
		System.out.println("Block executes irrespective of thrown exception");
		//ex:connection close
		}
	}
/*one try can followed by many catch blocks
 * every catch should preceeded by try block
 *  try+finally can possible -without catch*/
}