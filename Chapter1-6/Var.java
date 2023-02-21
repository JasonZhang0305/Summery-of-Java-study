// variables
public class Var {
	public static void main(String[] args) {
	    int age = 23;
	    double score = 88.9;
	    char gender = '男';
	    String name = "zzj";
	    //输入信息，快捷键
	    System.out.println("あなたの個人情報は：");
	    System.out.println(name);
	    System.out.println(age);
	    System.out.println(score);
	    System.out.println(gender);
	    //变量的替换
	    score = 99.9;
	    System.out.println(score);
	    //浮点型 float(四个字节) ；double（八个字节）
	    float n1 = 1.1f;
	    double n2 = 1.1;
	    double n3 = 1.2f;
	    System.out.println(n1);
	    //科学计数法
	    System.out.println(5.12e2);
	    System.out.println(5.12E-2);	    
	}
}