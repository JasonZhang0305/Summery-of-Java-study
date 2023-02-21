//do while循环的案例2
/*打印1-100
  计算1-100之和
  统计1-200之间能被5整除但不能被3整除的个数
  如果张三不还钱，则老韩将一直使用五连鞭，直到李三还钱为止
*/

public class DoWhile02 {
	
	public static void main(String[] args) {
		
		int i = 1; //循环变量初始化
		int end = 200;
		int count = 0;
		do {
			if(i % 5 == 0 && i % 3 != 0) {
			//循环执行
			System.out.println("i=" + i);
			//循环迭代
			count++;  
			}
			i++;			
		} while( i <= 200 ); 		
		System.out.println( "count= " + count );
	}
}