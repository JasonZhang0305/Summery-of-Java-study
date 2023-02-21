//演示赋值运算符的使用

public class Ass_Op {
	
	public static void main(String[]args) {

		int n1 = 10;
		n1 += 4;
		System.out.println(n1);
		n1 /= 4;
		System.out.println(n1);

		//复合赋值运算会进行类型转换
		byte b = 3;
		b += 2;
		System.out.println(b);
		b++;
		System.out.println(b);

		//三元运算 true 1; false 2
		int a = 10;
		int c = 99;
		int result = a > c ? a++ : c--;
		System.out.println("result=" + result);
		System.out.println("a=" + a);
		System.out.println("c=" + c);
	}
}