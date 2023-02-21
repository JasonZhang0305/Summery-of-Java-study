
public class VarScope {
	public static void main(String[] args) {
	Cat cat = new Cat();
	cat.eat();
	cat.eat();
	Dog dog = new Dog();
	dog.test(); 	
	}
}

class Dog {
	public void test() {
		Cat cat1 = new Cat();
		cat1.cry();
	}
}
class Cat {
	//全局变量：也就是属性变量，作为整个类的属性
	//属性在定义时，可以直接赋值
	//也可以不赋值，因为有默认值，默认值是0
	int age;
	String name;

	//1.局部变量一半是指在成员方法中定义的变量
	//2. n 和 name就是局部变量
	public void cry(){ 
		int n = 10;
		String name = "jack";
		System.out.println(name);
	}

	public void eat() {
		int age = 15;
		//System.out.println(n);//别的方法中的局部变量不能用
		//System.out.println(name); //别的方法中的局部变量不能用
		System.out.println(age); 
	}
}