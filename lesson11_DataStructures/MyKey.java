package lesson11_DataStructures;

public class MyKey {
	
	int x;
	int y;
	
	@Override
	public boolean equals(Object o) {
		MyKey other = (MyKey)o;
		
		return this.x+other.y == this.y+other.x;
	}
}
