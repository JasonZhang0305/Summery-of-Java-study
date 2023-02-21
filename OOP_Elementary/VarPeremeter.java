//可变参数

public class VarPeremeter {
	public static void main(String[] args) {
		Method m = new Method();
		System.out.println(m.sum(1, 5, 100));
		//可变实参也可以是数组
		int[] arr = {1, 2, 3};
		System.out.println(m.sum(arr));
	}
}

class Method {
	
	//可变参数可以和普通参数放在一起，但可变参数必须放在最后
	//一个形参列表只能有一个可变参数
	public int sum(int... nums){ //nums是一个数组
		int res = 0;
		for(int i = 0; i < nums.length; i++) {
			res += nums[i];
		}
		return res;
	}
}