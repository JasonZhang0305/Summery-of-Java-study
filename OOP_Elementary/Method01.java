//Method

public class Method01 {
	//main method
	public static void main(String[] args) {
		//方法的使用
		//1. 方法写好后，如果不去调用，不会输出
		//2. 先创建对象，然后调用方法即可
		Person p1 = new Person();
		p1.speak();
		p1.cal01();
		p1.cal02(10);
		p1.cal02(20);
		
		//调用getSum方法，然后将蛋会值赋给returnRes
		int returnRes = p1.getSum(10, 20);
		System.out.println("返回值为" + returnRes);
		
		//传输数组
		Person a = new Person();
		int[] res = a.getSumSub(1, 4);
		System.out.println("Sum= " + res[0]); 
		System.out.println("Sub= " + res[1]); 

	}
}

class Person { //这是一个类
	//属性：
 	String name;
 	int age;

 	//方法：
 	//1. public：表示方法是公开的
 	//2. void：表示方法没有返回值
 	//3. speak（）：speak方法名，（）形参列表
 	//4. {}：方法体
 	//5. System.out.println("zzj"); 表示我们的方法就是输出一句话
 	public void speak() {
 		System.out.println("zzj");
 	}
 	public void cal01() {
 		int res = 0;
 		for (int i = 1; i <= 1000; i++) {
 			res += i;
 		}
 		System.out.println("结果为" + res);
 	}
 	public void cal02(int n) {
 		int res = 0;
 		for (int i = 1; i <= n; i++) {
 			res += i;
 		}
 		System.out.println("结果为" + res);	
 	}
 	//1.public 表示方法是公开的
 	//2. int 表示方法执行后，返回一个int值
 	//3. getSum 方法名
 	//4. (int n1, int n2) 表示两个形参，可以接受用户传入的两个数
 	//5. return res 表示返回res
 	public int getSum(int n1, int n2) {
		int res = n1 + n2;
		return res;//方法名前面写了数据类型，说明需要返回
 	}
 	/*细节：
 	  1.返回值可以是任意数据类型，包含基本类型或引用类型（数组，对象）；
 	  2.如果方法要求返回数据类型，则方法体总最后的执行语句必须为return值；
 	  3.并且返回值类型需要和return值的类型一致或兼容；
 	  4.如果方法是void，则方法体中可以没有return或者止血return
 	*/
 	 public int[] getSumSub(int n1, int n2) {
		int[] resArr = new int[2];
		resArr[0] = n1 + n2;
		resArr[1] = n1 - n2;
		return resArr;//细节1
 	}	
	public void f1() {
		System.out.println("...");
		return;//细节4
 	}
}