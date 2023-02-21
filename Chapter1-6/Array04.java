//数组的赋值和拷贝

public class Array04 {
	
	public static void main(String[] args) {
		int arr1[] = {10,20,30};
		//int arr2[] = arr1[];  -> 值拷贝地址
		int arr2[] = new int[arr1.length];//开辟一个新空间
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];//把arr1里元素的值赋给arr2。
		}
		arr2[0] = 100; //改变arr2的值，看看arr1是否发生变化
		System.out.println(arr1[0]);//结果是10，没有发生变化		
	}
}