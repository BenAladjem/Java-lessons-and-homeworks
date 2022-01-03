package lesson11_DataStructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Exercise05 {

	static class Empty {
		
	}
	public static void main(String[] args) {
		
		Empty x = new Empty();
		x.toString();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(2);
		list.add(2);
		list.add(5);
		list.add(3);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(5);
		list.add(2);
		list.toString();
		Map<Integer, Integer> count = new HashMap<Integer, Integer>();

		// broene:
		for (Integer integer : list) {
			int currentCount = 0;
			if (count.containsKey(integer))
				currentCount = count.get(integer);
			
			count.put(integer, currentCount + 1);
		}

		// premahvane
		for (int i = 0; i < list.size(); i++) {
			int element = list.get(i);
			int elemCount = count.get(element);
			if (elemCount % 2 == 1) {
				list.remove(i--);
			}
		}
// taka ne stava:		
//		for (Integer integer : list) {
//			if(count.get(integer) %2 == 1) {
//				list.remove(integer);
//			}
//		}
		
		
		// izvejdane
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}

}
