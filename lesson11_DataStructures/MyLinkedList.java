package lesson11_DataStructures;

public class MyLinkedList implements ListInterface {

	private class Element {
		int value;
		Element previous;
		Element next;

		public Element(int value) {
			this(value, null, null);
		}

		public Element(int value, Element previous, Element next) {
			this.value = value;
			this.previous = previous;
			this.next = next;
		}
	}

	private int count;
	private Element head;
	private Element tail;

	public MyLinkedList() {
		count = 0;
		head = tail = null;
	}

	@Override
	public int popBack() {

		// TODO: if isEmpty - throw an exception

		int returnValue = tail.value;
		if (count > 1) {
			tail = tail.previous;
			tail.next = null;
		} else {
			head = tail = null;
		}
		count--;
		return returnValue;
	}

	@Override
	public int popFront() {

		// TODO: if isEmpty - throw an exception

		int returnValue = head.value;
		if (count > 1) {
			head = head.next;
			head.previous = null;
		} else {
			head = tail = null;
		}
		count--;
		return returnValue;
	}

	@Override
	public void pushBack(int value) {
		if (count > 0) {
			Element newElement = new Element(value, tail, null);
			tail.next = newElement;
			tail = newElement;
		} else {
			head = tail = new Element(value);
		}
		count++;
	}

	@Override
	public void pushFront(int value) {
		if (count > 0) {
			Element newElement = new Element(value, null, head);
			head.previous = newElement;
			head = newElement;
		} else {
			head = tail = new Element(value);
		}
		count++;
	}

	@Override
	public boolean isEmpty() {
		return count == 0;
	}
}
