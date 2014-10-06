package sorting;

public class InsertionSort {
	public static void main(String args[]) {
		int inputArray[] = {20, 3, -1, 16, 33, 8};
		InsertionSort is = new InsertionSort();
		is.sort(inputArray);
	}

	private void sort(int[] inputArray) {
		// TODO Auto-generated method stub
		for(int i=1;i<inputArray.length;i++) {
			int key = inputArray[i];
			int j = i-1;
			while(j>=0 && inputArray[j]>key) {
				inputArray[j+1] = inputArray[j];
				j--;
			}
			inputArray[j+1] = key;
			System.out.println("Pass: " + i);
			for(int k=0;k<inputArray.length;k++) {
				System.out.print(inputArray[k] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Arry in Ascending order is:");
		for(int i=0;i<inputArray.length;i++) {
			System.out.print(inputArray[i] + "\t");
		}
	}

}
