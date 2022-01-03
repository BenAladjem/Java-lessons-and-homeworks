package lesson08_Methods;

public class MergeSortExample {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 2, 4, 6 };

		mergeSort(array);
		print(array);
	}

	private static void print(int[] array) {
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
		
	}

	private static void mergeSort(int[] array) {
		mergeSort(array, 0, array.length);
	}

	private static void mergeSort(int[] array, int i, int length) {
		if(length<=1) return;
		
		mergeSort(array, i, length/2);
		mergeSort(array, i+length/2, length - length/2);
		merge(array, i, length);
	}

	private static void merge(int[] array, int i, int length) {
		int index = i;
		int[] merged = new int[length];
		
		int[] arr1 = new int[length/2];
		int[] arr2 = new int[length - length/2];
		
		for(int i1 = 0; i1< arr1.length; i1++) {
			arr1[i1] = array[i++];
		}
		for(int i2 = 0; i2< arr2.length; i2++) {
			arr2[i2] = array[i++];
		}
		merge(arr1, arr2, merged);
		
		for(int ix = 0; ix<merged.length; ix++)
		{
			array[index++] = merged[ix];
		}
	}

	private static void merge(int[] arr1, int[] arr2, int[] merged) {
		int i1 = 0;
		int i2 = 0;
		int im = 0;
		
		while(im < merged.length) {
			if(i1 == arr1.length) {
				while(i2<arr2.length)
					merged[im++] = arr2[i2++];
			} else if(i2 == arr2.length) {
				while(i1<arr1.length)
					merged[im++] = arr1[i1++];
			} else if(arr1[i1] < arr2[i2]) {
				merged[im++] = arr1[i1++];
			} else {
				merged[im++] = arr2[i2++];
			}
		}
	}

}
