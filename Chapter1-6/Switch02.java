//输出成绩是否合格，60以上合格。用switch来完成。

import java.util.Scanner;  
public class Switch02 {
	public static void main(String[] args) {
		/*Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入你的分数");
		double score = myScanner.nextDouble();
		if(score >= 0 && score <= 100) {
			switch((int)(score / 60)) {
				case 1 :
					System.out.println("恭喜合格🎉");
					break;
				case 0 :
					System.out.println("非常遗憾，本次考试不合格");
					break;
			}
		} else {
			System.out.println("成绩输入不正确");
		}
	    System.out.println("退出switch，continue...");
	    */

	    //根据月份输出季节
	    Scanner myScanner = new Scanner(System.in);
		System.out.println("输入月份");
		int month = myScanner.nextInt();
		switch(month) {
			case 3: 
			case 4: 
			case 5:
				System.out.println("春季");
				break;			
			case 6: 
			case 7: 
			case 8:
				System.out.println("夏季");
				break;			
			case 9 : 
			case 10 : 
			case 11 : 
				System.out.println("秋季");	
				break;		
			case 12: 
			case 1: 
			case 2:
				System.out.println("冬季");
				break;
			default :
				System.out.println("输入月份不对。");
		}
	}
}