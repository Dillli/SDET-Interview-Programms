package javaProgram;

public class Calculator {

	public static void main(String[] args) {
CalculatorMethods c= new CalculatorMethods();
System.out.println(c.add(3, 6)); //Arguments
System.out.println(c.sub(5, 8));
System.out.println(c.mul(8,9));
System.out.println(c.div(3, 5));
System.out.println(Math.random());
System.out.println((int)(Math.random()*100));//type casting-losing some data -*100 generates random numbers between 0-100
	}

}
