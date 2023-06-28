package javaPractise;

public class ConstSuperSampleChild extends ConstSuperSample{

	public ConstSuperSampleChild() {
		System.out.println("This is child Default Constructor");
	}
	
	public ConstSuperSampleChild(int a) {
		System.out.println("This is child one Constructor");
	}
	
	public ConstSuperSampleChild(int a, int b) {
		System.out.println("This is child Two Constructor");
	}
	
	public ConstSuperSampleChild(int a, int b,int c) {
		super(54,12,11);
		System.out.println("This is child three Constructor");
	}
	
	public static void main(String[] args) {
		ConstSuperSampleChild cstChild = new ConstSuperSampleChild(1,2,3);
		
	}
}
