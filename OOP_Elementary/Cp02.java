
public class Cp02 {
	
	public static void main(String[] args) {

		Book book = new Book("笑傲江湖", 300);
		book.info();
		book.updatePrice();
		book.info();
	}
}

class Book {
	String name;
	double price;
	public Book(String name, double price){
		this.name = name;
		this.price = price;
	}
	public void updatePrice(){ 
	//方法也可以没有参数，没有返回值，这里只是改变了对象里的一个属性
		if (price > 150) {
			price = 150;
		} else if (price > 100) {
			price = 100;
		}
	}
	//显示书籍的情况
	public void info(){
		System.out.println("书名=" + this.name + "价格=" + this.price);
	}
}