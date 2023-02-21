//数组的反转，添加，缩简

public class Array05 {
	
	public static void main(String[] args) {
		int[] arr = {11, 22, 33, 44, 55, 66};
		/* //数组反转方法一：
		int temp = 0;
		int len = arr.length;//
		for (int i = 0; i < len / 2; i++) { //循环交换
			temp = arr[len - 1 - i]; //为了不销毁新数组中的数据，需要中间媒介进行交换
			arr[len - 1 - i] = arr[i];
			arr[i] = temp;
		}
		for (int i = 0; i < len; i++) { //循环输出
			System.out.print(arr[i] + "\t");
		}
		*/
		/* //数组反转方法二：
		int[] arr2 = new int[arr.length];//重新定义一个数组
		for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) { 
		//逆向将arr的元素填充给arr2
			arr2[j] = arr[i];
		}
		arr = arr2;//在将arr原来的数据替换成arr2的
		for (int i = 0; i < arr.length; i++) { //循环输出
			System.out.print(arr[i] + "\t");
		}
		*/
		
		//数组元素的添加 = 建一个扩充好的，然后把原来的替换掉; 数组的缩简同理
		/* //数组添加：
		int[] arrNew = new int[arr.length + 1];
		for (int i = 0; i < arr.length; i++) {
			arrNew[i] = arr[i];
		}
		arrNew[arrNew.length - 1] = 77;
		arr = arrNew;
		for (int i = 0; i < arr.length; i++) { //循环输出 
			System.out.print(arr[i] + "\t");
		}
		*/

		//数组缩减：
		int[] arrNew = new int[arr.length - 1];
		for (int i = 0; i < arr.length - 1; i++) {
			arrNew[i] = arr[i];
		}
		arr = arrNew;
		for (int i = 0; i < arr.length; i++) { //循环输出 
			System.out.print(arr[i] + "\t");
		}
	}
}