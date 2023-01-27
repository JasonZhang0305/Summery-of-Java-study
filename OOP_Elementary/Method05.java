//编写一个方法copyPerson,可以复制一个Persion对象，返回复制的对象。
//注意要求得到新对象和原来的对象是两个独立的对象，只是属性相同

public class Method05 {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "milian";
		p1.age = 100;
		MyTools tools = new MyTools();
		Person p2 = tools.copyPerson(p1);
		System.out.println("age= " + p2.age + ", name= " + p2.name);
	}
}
class Person {
	String name;
	int age;
}
class MyTools {
	public Person copyPerson(Person p1) {
		Person p2 = new Person();
		p2.name = p1.name;
		p2.age = p1.age;
		return p2;
	}
}