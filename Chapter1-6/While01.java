//while循环的案例

public class While01 {
	
	public static void main(String[] args) {
		
		int i = 1;//i的作用域会变大
		while( i<= 10 ) {
			System.out.println("Hello, zzj!");
			i++;
		}
		System.out.println("i=" + i);

	}
}