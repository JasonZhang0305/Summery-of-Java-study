//判断一个年份是否是闰年
//闰年的条件：年份能被4整除，但不能被100整除；能被400整除
import java.util.Scanner;
public class If02 {

	public static void main(String[]arge){
    	
    	Scanner myScanner = new Scanner(System.in);
    	System.out.println("请输入年份:");
    	int year = myScanner.nextInt();
    	int yearD4 = year % 4;
    	int yearD100 = year %100;
    	int yearD400 = year %400;
    	if((yearD4 == 0 && yearD100 != 0) || yearD400 == 0) {
    		System.out.println(year + "是闰年。");
    	} else {
    		System.out.println(year + "不是闰年！");
    	}
	}
}