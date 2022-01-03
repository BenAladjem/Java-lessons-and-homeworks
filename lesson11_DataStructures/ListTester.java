package lesson11_DataStructures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class ListTester {

	public static void main(String[] args) {
		//MyArrayList list = new MyArrayList();
		//MyLinkedList list = new MyLinkedList();
//		ListInterface list = new MyLinkedList();
//		ListInterface list1 = new MyArrayList();
		
		//List list = new ArrayList();
		List<String> list = new LinkedList<String>();
		
		Stack<String> stack = new Stack<String>();
		
		System.out.println("Stack:");
		stack.push("1");
		stack.push("2");
		stack.push("3");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		
		list.add("10");
		list.add("12");
		list.add("4");
		
		System.out.println(list.get(0));
		System.out.println(list.get(list.size()-1));
	}

}
