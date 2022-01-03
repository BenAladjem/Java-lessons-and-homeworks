package lesson11_DataStructures;

public class MyQueue implements QueueInterface {

	private ListInterface data;

	public MyQueue() {
		data = new MyLinkedList();
	}

	@Override
	public int pop() {
		return data.popFront();
	}

	@Override
	public void push(int value) {
		data.pushBack(value);
	}

	public boolean isEmpty() {
		return data.isEmpty();
	}

}
