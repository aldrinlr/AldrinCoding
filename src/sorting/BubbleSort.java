package sorting;

public class BubbleSort {
	public static void main(String arg[]) {
		int inputArray[] = {20, 3, -1, 16, 33, 8};
		BubbleSort bs = new BubbleSort();
		bs.sort(inputArray);
	}

	private void sort(int[] inputArray) {
		// TODO Auto-generated method stub
		int temp;
		for(int i=0;i<inputArray.length;i++) {
			for(int j=0;j<inputArray.length-1-i;j++) {
				if(inputArray[j]>inputArray[j+1]) { // if(inputArray[j]<inputArray[j+1]) for descending
					temp = inputArray[j];
					inputArray[j] = inputArray[j+1];
					inputArray[j+1] = temp;
				}
			}
			System.out.println("Pass: " + (i+1));
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
