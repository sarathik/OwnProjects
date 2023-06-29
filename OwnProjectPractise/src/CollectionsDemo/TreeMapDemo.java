package CollectionsDemo;

import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> hm = new TreeMap<Integer, String>();
		hm.put(1, "Sarathi");
		hm.put(2, "Viki");
		hm.put(3, "Saru");
		hm.put(2, "Vicky");
		hm.put(5, "Paapu");
		hm.put(4, "Sasi");
		
		Set<Integer> sm = hm.keySet();
		System.out.println("Output below: ");
		
		for (Integer integer : sm) {
			System.out.println("Key : "+ integer + " and Value is : "+ hm.get(integer));
			
		}
	}

}
