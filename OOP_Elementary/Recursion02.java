public class Recursion02 {
	//main method
	public static void main(String[] args) {
		T t1 = new T();
		System.out.println(t1.fibonacci(7));
	}
}

class T {
	//1,1,2,3,5,8,13
	//fibonacci数：当n=1,2时它为1， 当n >= 3时，它是前两个数之和
	public int fibonacci(int n) {
		if (n == 1 || n == 2) {
			return 1;
		} else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
}
