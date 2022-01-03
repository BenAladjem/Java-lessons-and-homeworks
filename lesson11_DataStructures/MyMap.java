package lesson11_DataStructures;

import java.util.ArrayList;

public class MyMap<KeyType, ValueType> {
	private class Pair {
		KeyType key;
		ValueType value;

		public Pair(KeyType key, ValueType value) {
			this.key = key;
			this.value = value;
		}
	}

	private ArrayList<Pair> map;

	public MyMap() {
		map = new ArrayList<Pair>();
	}

	public void put(KeyType key, ValueType value) {
		if (get(key) == null) {
			map.add(new Pair(key, value));
		}
	}
	
	public void update(KeyType key, ValueType value) {
		for (Pair p : map) {
			if (p.key.equals(key)) {
				p.value = value;
			}
		}
		
	}

	public ValueType get(KeyType key) {
		for (Pair p : map) {
			if (p.key.equals(key)) {
				return p.value;
			}
		}
		return null;
	}
}
