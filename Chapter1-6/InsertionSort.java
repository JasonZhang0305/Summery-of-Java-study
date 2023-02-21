//InsertionSort: 

public class InsertionSort {
	
	public static void main(String[] args) {
		int[] arr = {24, 69, 80, 345, -230, 323, 52, 57, 13, -1, 30, 200};
		int len = arr.length;
		int temp = 0;
		if(arr == null || arr.length < 2) {
			return;
		}
		for (int i = 1; i < len-1; i++) { 	
			for(int j = i - 1; j >= 0 && arr[j] > arr[j+1]; j--) { 
					swap(arr, j, j+1);
			}	
		}
		for(int j = 0; j < arr.length; j++) {
				System.out.println(arr[j] + "\t");
			}			
	}
	public static void swap(int[] arr, int i, int j) {
		arr[i] = arr[i] ^ arr[j];
		arr[j] = arr[i] ^ arr[j];
		arr[i] = arr[i] ^ arr[j];
	}
}