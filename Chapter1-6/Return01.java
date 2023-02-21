//return 的使用

public class Return01 {
	
	public static void main(String[] args) {
		
		for(int i = 1; i <= 5; i++) {	
			if (i == 3) {
				System.out.println("zzj" + i);
				return; /*当return用在方法时，表示跳出方法，
				如果用在main中，则跳出程序
				*/				
			} 
			System.out.println("Hello, zzj.");
		}
		System.out.println("go on...");			
	}
}