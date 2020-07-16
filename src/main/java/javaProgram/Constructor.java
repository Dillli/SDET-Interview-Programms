package javaProgram;

public class Constructor {
	
	public Constructor(){
		System.out.println("I am from constructor");
	}
	public Constructor(int a,int b){
		System.out.println("I am from parameterized constructor "+(a+b));
	}
	public Constructor(String str){
		System.out.println("Welcome "+str);
	}
	
	public void getData(){
		System.out.println("i am a method");
	}
	public static void main(String[] args) {
	
		Constructor cd = new Constructor();
		Constructor cd2 = new Constructor(7,8);
		Constructor cd3 = new Constructor("SRINIVAS");
	}
/* Will not return any value
Whenever you created an object for a class constructor is called automatically.(without calling its methods.
All the variables created in constructor can be used in object created class
 */
}
