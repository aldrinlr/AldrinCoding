package searching;

public class LinearSearch {
	public static void main(String arg[]) throws Exception {
		int inputArray[] = {56, -3, 32, 12, -15, 29};
		int key = 0;
		LinearSearch ls = new LinearSearch();
		int index = ls.search(inputArray, key);
		if(index<=-1) {
			System.out.println("Key not found in the array");
		}
		else {
			System.out.println("Key found at index:" + index);
		}
	}

	private int search(int[] inputArray, int key) {
		// TODO Auto-generated method stub
		for(int i=0;i<inputArray.length;i++) {
			if(inputArray[i]==key) {
				return i;
			}
		}
		return -1;
	}

}
