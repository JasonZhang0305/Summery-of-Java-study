//面向对象，方便数据管理
//用面向对象的方式来解决养猫问题
//创建一个猫类

public class Object01 {
	
	public static void main(String[] args) {

	//cat1 cat2是类下面的对象，每一个对象有对应的一个大类中的所有属性
	Cat cat1 = new Cat();
	cat1.name = "小白";
	cat1.age = 3;
	cat1.color = "白色";
	cat1.weight = 10;
	Cat cat2 = new Cat();
	cat2.name = "小花";
	cat2.age = 100;
	cat2.color = "花色";
	cat2.weight = 20;

	//访问对象的属性
	System.out.println("第一只猫的属性：" + cat1.name + " " + 
		cat1.age + " " + cat1.color + cat1.weight);
	System.out.println("第二只猫的属性：" + cat2.name + " " + 
		cat2.age + " " + cat2.color + cat2.weight);
	}	
}

class Cat { //Cat 是一个类，属性（field，字段，成员变量）在类中定义
	String name;
	int age;
	String color;
	double weight;
	String[] price; //属性也可以是数组 
}
