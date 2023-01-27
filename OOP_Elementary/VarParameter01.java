//可变参数

public class VarParameter01 {
	public static void main(String[] args) {
		Method m = new Method();
		String ss = m.showScore("zzj", 90.5, 80);
		System.out.println(ss);
	
	}
}

class Method {
	
	//有三个方法，分别实现返回姓名和两门课的成绩
	// 返回姓名和三门课的成绩，返回姓名和五门课的成绩
	// 分装成一个可变参数的方法

	public String showScore(String name, double... scores){ //nums是一个数组
		double totalScore = 0;
		for(int i = 0; i < scores.length; i++) {
			totalScore += scores[i];
		}
		return name + "有" + scores.length + "门课的成绩，总分为 " + totalScore; 
	}
}