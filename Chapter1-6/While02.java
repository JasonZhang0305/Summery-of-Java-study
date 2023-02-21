//打印1-100之间所有能被3整除的数
//打印40-200之间所有的偶数

public class While02 {
	
	public static void main(String[] args) {
		
		int i = 40;
		int start = 40;
		int end = 200;
		int div = 2;
		while( i >= start && i <= end ) {
			if(i % div == 0) {
				System.out.println("i=" + i);
			}	
			i++;
		}
	}
}