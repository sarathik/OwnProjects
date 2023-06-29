package CollectionsDemo;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> lhs = new LinkedList<Integer>();
		lhs.add(56);
		lhs.add(12);
		lhs.add(7000);
		lhs.add(1);
		lhs.add(56);
		
		System.out.println("Linked List :::");
		
		for (Integer integer : lhs) {
			
			System.out.println(lhs);
		}
	}


}
