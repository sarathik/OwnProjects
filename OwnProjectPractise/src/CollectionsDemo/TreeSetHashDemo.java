package CollectionsDemo;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetHashDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		//will store in ascending order
		
		TreeSet<Integer> trs = new TreeSet<Integer>();
		trs.add(56);
		trs.add(12);
		trs.add(7000);
		trs.add(1);
		trs.add(56);
		
		System.out.println("Linked Hash Set :::");
		
		for (Integer integer : trs) {
			
			System.out.println(trs);
		}
	}

}
