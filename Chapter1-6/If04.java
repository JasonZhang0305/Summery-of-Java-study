/* 案例2
 * 出票系统：根据淡旺季的月份和年龄，打印票价
 * 旺季：成人（18-60）：60； 儿童（<18）：半价；老人（>60）：15
 * 淡季：成人：20；其他：10
 */

import java.util.Scanner;
public class If04 {

	public static void main(String[] arge) {   	
    	Scanner myScanner = new Scanner(System.in);
    	System.out.println("请输入当前季节(淡季输0，旺季输1):");
    	int season = myScanner.nextInt();
    	if(season == 1) {
    		System.out.println("请输入年龄：");
    		int age = myScanner.nextInt();
    		if(age >= 18 && age <= 60) {
    			System.out.println("您的票价为60");
    		} else if (age < 18) {
    			System.out.println("您的票价为30");   			
    		} else {
    			System.out.println("您的票价为15");
    		}
    	} else {
    		System.out.println("请输入您的年龄：");
    		int age1 = myScanner.nextInt();
    		if (age1 >= 18 && age1 <= 60) {
    			System.out.println("您的票价为40");
    		} else {
    			System.out.println("您的票价为15");
    		}		
    	}
	}
}