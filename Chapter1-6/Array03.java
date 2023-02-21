//找出一个数组中的最大值。

public class Array03 {
	
	public static void main(String[] args) {
		int arr[] = {4, 56, 34, 57, 23, 56, 67, -20, -39, 64,100};//设置数组
		int max = arr[0]; //把数组中第一个数设成最大值
		int maxIndex = 0;
		for(int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				maxIndex = i;
			}
		}
		System.out.println("max=" + max + ", maxIndex=" + maxIndex);		
	}
}