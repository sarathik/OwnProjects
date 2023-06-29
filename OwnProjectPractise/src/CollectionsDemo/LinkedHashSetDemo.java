package CollectionsDemo;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	
	public static void main(String[] args) {
		
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(56);
		lhs.add(12);
		lhs.add(7000);
		lhs.add(1);
		lhs.add(56);
		
		System.out.println("Linked Hash Set :::");
		
		for (Integer integer : lhs) {
			
			System.out.println(lhs);
		}
		
	}

}
