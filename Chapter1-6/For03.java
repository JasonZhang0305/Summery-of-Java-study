//打印1～100之间所有是9的倍数的整数，统计个数及总和
public class For03 {
	
	public static void main(String[] args) {
		/* 编程思想：
		   化繁为简：将复杂需求拆解成简单需求，逐步完成
		   先死后活：先考虑固定值，然后转成可以灵活变化的值
		*/

		int count = 0;//统计变量
		int sum = 0;
		int start = 10;
		int end = 200;
		int t = 9; 
		for(int i = start; i<= end; i++) {
			if(i % t == 0) {
				System.out.println("i=" + i);
				count++;
				sum += i;
			}
		}
		System.out.println("count=" + count);
		System.out.println("sum=" + sum);

	}
}