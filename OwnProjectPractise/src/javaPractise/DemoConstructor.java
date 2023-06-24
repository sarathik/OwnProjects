package javaPractise;

public class DemoConstructor {
	
	//No Value argument
	public DemoConstructor() {
		int rollNo = 0;
		String rname = "abc";
		System.out.println(rollNo + "+" + rname);
	}
	
	//Parametrized constructor
	public DemoConstructor(int id, String ename)
	{
		this();
		int id1 = id;
		String ename1 = ename;
		System.out.println(id1 + "+" + ename1);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DemoConstructor dc = new DemoConstructor();
		DemoConstructor dc1 = new DemoConstructor(5, "Sarathi");
		//Constructor Overloading 

	}

}
