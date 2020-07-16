package Patterns;

import java.text.DecimalFormat;

public class Patteren_00to10 {

	public static void main(String[] args) {

//		DecimalFormat format = new DecimalFormat("0000");
//
//
//		for (int i = 0; i <= 1000; i++) {
//
//			if (i != 10) {
//
//				System.out.println(format.format(i)+ " , ");
//
//			} else {
//				System.out.println((format.format(i)));
//			}
//
//		}

		for (int i = 1; i <= 1000; i++)

		{

			if (i <=10)

			{
				System.out.println("0" + i);
			}

			else if (i<=100)

			{
				System.out.println("0" + i);
			}
			else if (i<=999)
			{
				System.out.println("0" + i);
			}
			
			else {
				
				System.out.println(" "+ i);
			}

		}

	}

}
