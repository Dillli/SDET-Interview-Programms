package javaProgram;

public class SingletonClass {

	//in OOP, a Singleton class is a class that can have only one object (instance of the class) at a time.
	//How to design singleton class
	//1. make constructor as private
	//2. write a public static method that has return type of object of this singleton class (Lazy Initialization)
	
	private static SingletonClass singleton_instance = null;
	public String str;
	
	private SingletonClass() {
		str = "Hey i am using singleton class pattern";
		}
	public static SingletonClass getInstance() {
		if(singleton_instance==null)
			singleton_instance = new SingletonClass();
		return singleton_instance;
	}
	
	public static void main(String args[]) {
		SingletonClass x = SingletonClass.getInstance();
		SingletonClass y = SingletonClass.getInstance();
		SingletonClass z = SingletonClass.getInstance();
		
		x.str = (x.str).toUpperCase();
		
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
	
		z.str = (z.str).toLowerCase();
		
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		
		
	}
	
	
	
}
