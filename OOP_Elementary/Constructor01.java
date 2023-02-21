//构造器：构造对象的属性，本身也是个方法

public class Constructor01 {
	
	public static void main(String[] args) {
		Person p1 = new Person("Smith", 80);
		Person p2 = new Person("Tom");
	}
}
class Doggy {
	//这里会有一个默认的无参构造器 
}
class Person {
	String name;
	int age;
	//constructor
	//1.构造器没有返回值，也不能写void
	//2.构造器的名称和类名必须一样
	public Person(String pName, int pAge) {
		System.out.println("构造器被调用~~ 完成对象的属性的初始化");
		name = pName;
		age = pAge; 		
	}
	public Person(String pName){
		name = pName;
	}			
}