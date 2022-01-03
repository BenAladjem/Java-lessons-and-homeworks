package lesson11_DataStructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public class Tester {

	public static void main(String[] args) {
		ListInterface list1 = new MyArrayList();
		ListInterface list2 = new MyLinkedList();

		ArrayList<String> al = new ArrayList<String>();

		Collections.sort(al);
		
		Stack js = new Stack();
		js.push(5);
		js.pop();
		
		System.out.println("Maps:");
		//MyMap<String, Integer> map = new MyMap<String, Integer>();
		//HashMap<String, Integer> map = new HashMap<String, Integer>();
		Map<String, Integer> map = new TreeMap<String, Integer>();
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		
		
		
		MyKey key = new MyKey();
		
		
		map.put("Ivan", new Integer(6));
		map.put("Eli", new Integer(3));
		map.put("Gosho", new Integer(5));
		
		System.out.println(map.get("eli"));
		
		map.remove("Ivan");
		
		
		
		
		System.out.println("end maps");
		al.add(new Human());
		System.out.println(al.get(0));

		System.out.println("The stack:");
		StackInterface s = new MyStack();

		s.push(5);
		s.push(6);
		System.out.println(s.pop());
		System.out.println(s.pop());

		System.out.println("The queue:");
		QueueInterface q = new MyQueue();

		q.push(5);
		q.push(6);
		System.out.println(q.pop());
		System.out.println(q.pop());

		System.out.println("others:");
		LinkedList ll = new LinkedList();

		ll.add(5);
		System.out.println(ll.get(0));

		// for(int i = 1; i<100; i*=2) {
		// list1.pushBack(i);
		// list1.pushFront(i+1);
		// }
		//
		// while(!list1.isEmpty()) {
		// System.out.println(list1.popFront());
		// }
		
		System.out.println("map" + map.hashCode());
		System.out.println("ll" + ll.hashCode());
		
	}

}
