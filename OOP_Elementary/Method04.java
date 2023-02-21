public class Method04 {
	//main method
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		AA Object = new AA();
		Object.swap(a, b); // 20, 10
		System.out.println("a= " + a + "b" + b); //10, 20
	}
}
class AA {

	public void swap(int a, int b) {
		
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a= " + a + "b= " + b);//20, 10		
	}
}