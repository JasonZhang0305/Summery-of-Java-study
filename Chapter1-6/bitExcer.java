//按位运算

public class bitExcer {
	public static void main(String[] args){
		byte num1 = ~-2;
		byte num2 = ~2;
		byte num3 = 2|3;
		byte num4 = 2^3;
		System.out.println(num1); //1
		System.out.println(num2); //-3
		System.out.println(num3); //3
		System.out.println(num4); //1
	}

}