package javaProgram;

public class ThisDemo {
	
	int a=2;
	public void getData(){
		int a=3;
		int b = a+this.a;
	System.out.println(a);//first peference is local varialbe
	System.out.println(this.a);//scope is class level
	System.out.println(b);
	}
		
	public static void main(String[] args) {
		
		ThisDemo td = new ThisDemo();
		System.out.println(td.a);//can use without this keyword
		td.getData();
	}

}
