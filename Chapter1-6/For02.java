//For的使用细节
public class For02 {
	
	public static void main(String[] args) {
		
		int i = 1;//i的作用域会变大
		for( ; i<= 6; ) {
			System.out.println("Hello, zzj!");
			i++;
		}
		System.out.println("i=" + i);

	}
}