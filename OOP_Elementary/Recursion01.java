//递归

public class Recursion01 {
	//main method
	public static void main(String[] args) {

		T t1 = new T();
		t1.test(4);
		int res = t1.factorial(5);
		System.out.println("5的阶乘为" + res);
	}
}

class T {
	public void test(int n) {
		if(n > 2) {
			test(n - 1);//方法的执行里再次调用方法，递归出现
		} else {
			System.out.println("n= " + n);
		}
	}

	public int factorial(int n) {
		if(n == 1) {
			return 1;
		} else {
			return factorial(n - 1)*n;
		}
	}
}