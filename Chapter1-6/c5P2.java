//判断一个整数的类型

import java.util.Scanner;
public class c5P2 {
	
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		do {
			System.out.println("请输入一个整数:");
			int num = myScanner.nextInt();
			if(num > 0) {
					System.out.println(num + "为正数");
				} else if(num == 0) {
					System.out.println(num + "为零");
				} else {
					System.out.println(num + "为负数");
				}
		} while(true); 
	}
}