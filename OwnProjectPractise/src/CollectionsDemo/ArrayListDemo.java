package CollectionsDemo;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> lhs = new ArrayList<Integer>();
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
