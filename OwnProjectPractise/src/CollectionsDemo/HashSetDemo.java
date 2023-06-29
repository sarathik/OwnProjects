package CollectionsDemo;

import java.util.HashSet;

public class HashSetDemo {
	
	public static void main(String[] args) {
		
		// HashSet will not maintain the order and only unique will be added
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(1);
		hs.add(321);
		hs.add(120);
		hs.add(1);
		hs.add(300);
		
		System.out.println("HashSet Set Sample: ");
		
		for (Integer integer : hs) {
			System.out.println(integer);
		}
		
		
	}

}
