package javaPractise;

public class MethodSamples {
	
	public void method1()
	{
		System.out.println("This is sample method - Default method and no return");
	}
	
	public int method2()
	{
		int a = 5;
		return a;
	}
	
	public void method3(int ipt1)
	{
		System.out.println("Parameterized input : " + ipt1);
		
	}

	public char method4(char a)
	{
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodSamples ms = new MethodSamples();
		ms.method1();
		
		int aa = ms.method2();
		System.out.println(aa);
		
		ms.method3(55);
		
		char  cc = ms.method4('n');
		System.out.println(cc);
		
		
	

	}

}
