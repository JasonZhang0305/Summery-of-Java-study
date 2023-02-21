//数组的使用

public class Array01 {
	
	public static void main(String[] args) {
	double hens[] = {3, 5, 1, 3.4, 2, 50, 7.8, 88};
	//遍历数组的得到数组的所有元素的和，用for
	double totalWeight = 0;
	int num = hens.length;
		for(int i = 0; i < num; i++) {
		    System.out.println("第" +(i+1) + "只🐔的值为" + hens[i]);
		    totalWeight += hens[i];
		}
		System.out.println("平均体重为" + (totalWeight / num) 
			+ "，🐔King体重为" + hens[(num - 1)] + "kg");
	}
}