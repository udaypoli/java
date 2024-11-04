package day4;

public class Methods {
	static {
		System.out.println("static block");
	}
	{
		System.out.println("non static block");
	}
	public Methods() {
		System.out.println("constructor..");
	}
	
	public static void method1() {
		System.out.println("Static method");
		Methods m= new Methods();
		Methods m1= new Methods();
		m.method2();
	}
	
	public void method2() {
		System.out.println("non static method");
		
	}

	public static void main(String[] args) {
		
		method1();
		
		
	}

}
