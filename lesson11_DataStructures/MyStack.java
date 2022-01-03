package lesson11_DataStructures;

public class MyStack implements StackInterface {

	private ListInterface data;
	
	public MyStack() {
		data = new MyArrayList();
	}
	
	@Override
	public boolean isEmpty() {
		return data.isEmpty();
	}

	@Override
	public int pop() {
		return data.popBack();
	}

	@Override
	public void push(int value) {
		data.pushBack(value);
	}

}
