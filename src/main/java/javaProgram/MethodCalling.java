package javaProgram;

public class MethodCalling {

	public static void main(String[] args) {
		//To call all the methods we have to create object to MethodCalling class
		MethodCalling cal = new MethodCalling();
		//cal.Go();
		//cal.Go1();
		//cal.Go2();
		//otherwise,non static methods can'b called from static methods(main)
		cal.Go1();
		System.out.println("after calling Go1() method");
		//static --> static
		//Go1(); -allowed if we make it to static ---Opposite to OOPS concept
		//non static --> non static, static
		
	}

	public void Go() {
		System.out.println("Inside Go Method");
		Go2();
		System.out.println("after calling go2() Method");
	}
	public void Go1() {
		System.out.println("Inside Go1 Method");
		Go();
		System.out.println("after calling go Method");
	}
	public void Go2() {
		System.out.println("Inside Go2 Method");
		
	}
}
