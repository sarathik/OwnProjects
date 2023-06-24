package javaPractise;

public class vmobilesTypes extends VivoPhones{
	
	public void vtype() {
		System.out.println("I am Vivo V7");
	}
	
	public static void main(String[] args) {
		
		vmobilesTypes vtm =new vmobilesTypes();
		System.out.println(vtm.mobile);
		System.out.println(vtm.model);
		vtm.smMethod();
		vtm.vivoMethod();
		vtm.vtype();
		
	}

}
