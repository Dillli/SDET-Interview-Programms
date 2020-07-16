package javaProgram;

public class ChildSuper extends ParentSuper{
	String name ="ChildString";//same variable name-redundant:if this is not present in child class .then it refers to the parent
	public void getData(){
		System.out.println(name);
		System.out.println(super.name);//gives parent class string-should be outside of static method
	}
	public void get(){
		System.out.println("i am from childsuper");
		super.get();//calls for parent method
	}
	public ChildSuper(){
		super();//calls Parentclass constructor-must be in first line
		System.out.println("i am child Constructor");
	}
	public static void main(String[] args) {
		ChildSuper cs = new ChildSuper();//constructor call automatically without calling them
		cs.getData();//calls local string
		cs.get();
		
	}

}
