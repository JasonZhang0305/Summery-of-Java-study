
public class TestPerson {
	
	public static void main(String[] args) {
		Person p1 = new Person("zzj", 23);
		Person p2 = new Person("ZZJ", 32);
		System.out.println(p1.compareTo(p2));
	}
}
/*
定义一个Person类，里面有name，age属性，宾提供compareTo比较方法，
用于判断是否和另一个人相等，提供测试类TestPerson用于测试，
名字和年龄完全一样，就返回true，否则返回false
*/
class Person{
	//属性
	String name;
	int age;

	//构造器，作用是将属性赋给调用构造器的对象
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//compare方法
	public boolean compareTo(Person p) { //形参变量
		return this.name.equals(p.name) && this.age == p.age;
		//p1调用的compareTo方法，所以this就赋给p1
	}
}