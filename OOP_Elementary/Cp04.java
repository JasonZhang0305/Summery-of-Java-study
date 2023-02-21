
public class Cp04 {
	int count = 9;
	public void count1(){
		count = 10;
		System.out.println("count1= " + count);
	}
	public void count2(){
		System.out.println("count2= " + count++);//count先输出再自增
	}
	//任何一个类都可以有main方法
	public static void main(String args[]){
		//1. new Test()是一个匿名对象，只能用一次，使用后就会被销毁
		//2. new Test().count1() 匿名对象调用了一个count1（）方法
		new Cp04().count1();
		Cp04 t1 = new Cp04();
		t1.count2();
		t1.count2();
	}
}