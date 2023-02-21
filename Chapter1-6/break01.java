//break

public class break01 {
	
	public static void main(String[] args) {
		
		for( int i = 0; i< 10; i++) {
			if (i == 3) {
				break;//满足if条件，就提前结束for循环
			}
			System.out.println("i=" + i);
		}

	}
}