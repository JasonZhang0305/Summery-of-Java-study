//break 细节

public class BreakDetail {
	
	public static void main(String[] args) {
		
		label1:
		for( int j = 0; j < 4; j++) { //外层循环
		label2:
			for(int i = 0;i < 10; i++) {		
				if (i == 3) {
					break label1;//满足if条件，就提前结束for循环
				}
				System.out.println("i=" + i);
			}	
		}
	}
}