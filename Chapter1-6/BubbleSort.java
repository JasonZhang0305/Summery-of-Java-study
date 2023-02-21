//冒泡排序: 按照从左到右的顺序两两比较，把大的放到后面，循环多次

public class BubbleSort {
	
	public static void main(String[] args) {
		int[] arr = {24, 69, 80, 345, -230, 323, 52, 57, 13, -1, 30, 200};
		int len = arr.length;
		int temp = 0;
		if(arr == null || arr.length < 2) {
			return;
		}
		for (int i = 0; i < len-1; i++) { 	
			for(int j = 0; j < len-1-i; j++) { /*每排一次都能确定一个最大值的位置，
			于是元组中需要排序的元素就会减少一个*/
				if (arr[j] > arr[j+1]) { /* 顺序的话就是把大的放到后面去，
				逆序的话就是把小的放到后面*/
					// temp = arr[j];
					// arr[j] = arr[j+1];
					// arr[j+1] = temp;
					arr[j] = arr[j] ^ arr[j+1];
					arr[j+1] = arr[j] ^ arr[j+1];	
					arr[j] = arr[j] ^ arr[j+1];
				}
			}
			System.out.println("===第" + (i+1) + " 轮排序===");
			for(int j = 0; j < arr.length; j++) {
				System.out.println(arr[j] + "\t");
			}
		}	
	}
}