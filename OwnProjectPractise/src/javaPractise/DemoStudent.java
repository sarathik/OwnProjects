package javaPractise;

public class DemoStudent {
	
	int a;
	
	public void printline()
	{
		System.out.println("This comment is from the package method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DemoStudent dm = new DemoStudent();
		dm.a = 25;
		System.out.println("This printline is from the main method");
		System.out.println(dm.a);
		dm.printline();
			
		
	}

}
