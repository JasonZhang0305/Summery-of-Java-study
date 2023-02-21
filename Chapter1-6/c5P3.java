//判断一个整数是否为水仙花数
//水仙花数是指一个3位数，其各个位上数字立方和等于其本身

import java.util.Scanner;
public class c5P3 {
	
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);

		do {
			System.out.println("请输入一个三位数的整数:");
			int n = myScanner.nextInt();
			int n1 = n / 100;
			int n2 = (n % 100) / 10;
			int n3 = n % 10;
			if(n1*n1*n1 + n2*n2*n2 + n3*n3*n3 == n) {
				System.out.println(n + "是水仙花数");
			} else {
				System.out.println(n + "不是水仙花数");
			}
		} while(true); 
	}
}