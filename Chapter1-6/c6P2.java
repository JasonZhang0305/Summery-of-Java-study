/* 随机生成10个整数（1-100）保存到数组，
并倒叙打印以及求平均值，最大值和最大值的下标
并查找里面是否有8。
*/

public class c6P2 {
	
	public static void main(String[] args) {

		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			//随机生成1-100的数
			arr[i] = (int)(Math.random()*100) + 1;
		}
		System.out.println("==========");
		for (int i = 0; i < 10; i++) {
			if (arr[i] == 23) {
				System.out.println("8的下标为" + i);
				break;
			} 
			System.out.print(arr[i] + " ");
		}
		double sum = 0;
		int max = arr[0];
		int maxIndex = 0;
		
		for (int i = 1; i < 10; i++) {
			sum += arr[1];
			if(max <arr[i]){
				max = arr[i];
				maxIndex = i;
			}
		}
		System.out.println();
		System.out.println("最大值= " + max + ", 下标= " + maxIndex);
		System.out.println("平均值= " + (sum/10));
	}
}