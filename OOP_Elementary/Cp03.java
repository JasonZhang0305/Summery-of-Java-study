public class Cp03 {
	
	public static void main(String[] args) {
		Circle circle = new Circle(2);
		System.out.println("面积为" + circle.area());
		System.out.println("周长为" + circle.len());

	}
}

class Circle {
	double radius;

	public Circle(double radius){
		this.radius = radius;
	}
	//计算圆的面积
	public double area(){ 
		return Math.PI*radius*radius;
	}
	//计算圆的周长
	public double len(){
		return 2*Math.PI*radius;
	}
}