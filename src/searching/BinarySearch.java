package searching;

public class BinarySearch {
	public static void main(String arg[]) {
		int inputArray[] = {-10, -6, 0, 3, 6, 21, 40};
		int key = 40;
		BinarySearch bs = new BinarySearch();
		System.out.println("Key not found in the array");
		int index = bs.search(inputArray,0,inputArray.length,key);
		if(index<=-1) {
			System.out.println("Key not found in the array");
		}
		else {
			System.out.println("Key found at index:" + index);
		}
	}

	private int search(int[] inputArray, int low, int high, int key) {
		if(high<=low) {
			return -1;
		}
		int mid = low + (high - low)/2;
		if(inputArray[mid]==key) {
			return mid;
		}
		else {
			if(inputArray[mid]>=key) {
				return search(inputArray, low, mid, key);
			}
			else {
				return search(inputArray, mid+1, high, key);
			}
		}
	}
}
