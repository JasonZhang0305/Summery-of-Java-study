//练习题

public class Exercise01 {
	public static void main(String[] args) {
	    /*1.需求：假如还有59天放假，问：合几个星期零几天
	      2.思路：
	      （1）用int变量来表示 Days;
	      （2）一个星期是7天，所以Weeks = Days/7; 
	       (3)零几天用Days%7来表示；
	    */

	    int days = 59;
	    int weeks = days/7;
	    int dayleft = days%7;
	    System.out.println("还剩" + weeks + "星期, 零" + dayleft + "天");

	    //需求：定义一个变量保存华氏温度
	    double F = 1234.6;
	    double C = 5.0 / 9 * (F - 100);
	    System.out.println("摄氏度为" + C);
	}
}