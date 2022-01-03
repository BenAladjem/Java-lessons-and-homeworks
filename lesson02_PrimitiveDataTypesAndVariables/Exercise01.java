package lesson02_PrimitiveDataTypesAndVariables;

public class Exercise01 {

	/** 
	 * @author Orliin
	 * 
	 * Task:
	 * Declare five variables choosing for each of
	 * them the most appropriate of the types byte,
	 * sbyte, short, ushort, int, uint, long, ulong to
	 * represent the following values: 52130, -115,
	 * 4825932, 97, -10000
	 **/
	
	public static void main(String[] args) {
		int var1;
		byte var2;
		int var3;
		byte var4;
		short var5;
		
		var1 = 52130;
		var2 = -115;
		var3 = 4825932;
		var4 = 97;
		var5 = -10000;
		
		System.out.printf("%d\n%d\n%d\n%d\n%d\n", var1, var2, var3, var4, var5);
	}

}
