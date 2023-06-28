package javaPractise;

public class ChildSuperMethodDemo extends ParentSuperMethodDemo{
	
	public void method1() {
		System.out.println("This is child method 1");
		super.meth1();
	}

	public void method2() {
		System.out.println("This is child method 2");
		super.meth2();
	}
	
	public static void main(String[] args) {
		ChildSuperMethodDemo cm = new ChildSuperMethodDemo();
		cm.method1();
	}
}
