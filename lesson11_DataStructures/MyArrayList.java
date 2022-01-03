package lesson11_DataStructures;

public class MyArrayList implements ListInterface {

	private int[] data;
	private int count;

	public MyArrayList() {
		data = new int[10];
		count = 0;
	}

	@Override
	public int popBack() {
		
		//TODO: if isEmpty - throw an exception
		
		if(isTooBig()) {
			shortenArray(); 
		}
		count--;
		
		return data[count];
	}

	@Override
	public int popFront() {
		
		//TODO: if isEmpty - throw an exception
		
		if(isTooBig()) {
			shortenArray(); 
		}
		int returnValue = data[0];
		count--;
		
		for(int i=0; i<count; i++) {
			data[i] = data[i+1];
		}
		
		return returnValue;
	}

	@Override
	public void pushBack(int value) {
		if (isFull()) {
			enlargeArray();
		}
		data[count] = value;
		count++;
	}

	@Override
	public void pushFront(int value) {
		if (isFull()) {
			enlargeArray();
		}
		for (int i = count; i > 0; i--) {
			data[i] = data[i - 1];
		}
		data[0] = value;
		count++;
	}

	private void enlargeArray() {
		int[] newData = new int[count * 2];

		for (int i = 0; i < count; i++) {
			newData[i] = data[i];
		}

		data = newData;
	}	
	
	private void shortenArray() {
		int[] newData = new int[data.length / 2];

		for (int i = 0; i < count; i++) {
			newData[i] = data[i];
		}

		data = newData;
	}
	
	private boolean isTooBig() {
		return count <= data.length / 3;
	}

	private boolean isFull() {
		return count == data.length;
	}
	
	@Override
	public boolean isEmpty() {
		return count==0;
	}

}
