/**
 * 演示逻辑运算符的使用
 */


public class Log_Op01 {
	public static void main(String[] args) {
		//&&短路与
        int age = 50;
        if(age > 20 && age < 90) {
        	System.out.println("ok");
        } 
        //&逻辑与
        if(age > 20 & age < 90) {
        	System.out.println("ok");
        }
        //区别 对于&&来说，第一个为假的话后面就不会执行
        //对于&而言，如果第一个条件为false，后面的条件仍然会判断
        int a = 4;
        int b = 9;
        if(a > 10 & ++b < 90) {
        	System.out.println("okk");
        }
        	System.out.println("a=" + a + "b=" + b);

        /* ||短路或：如果第一个条件为true，则第二个条件不会判断，
           直接输出true；
           |逻辑或：无论第一个结果为何，前后都会执行
        */
	}
}
