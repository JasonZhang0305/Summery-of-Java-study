//方法重载

public class OverLoad {
	public static void main(String[] args) {
		Methods methods = new Methods();
		int max2 = methods.max(1, 3);
		int max3 = methods.max(1, 3, 6);
		System.out.println("最大值为" + max2);
		System.out.println("最大值为" + max3);
	}
}

class Methods {
	//两个数比大小
	public int max(int n1, int n2){
		return n1 > n2 ? n1 : n2; 		
	}	
	//同一个方法，三个数比大小
	public int max(int n1, int n2, int n3){
		int max = n1 > n2 ? n1 : n2;
		return n3 > max ? n3 : max; 		
	}

}