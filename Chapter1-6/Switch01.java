// switch

import java.util.Scanner;  
public class Switch01 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入一个字符（a-c)");
		/*细节：
		表达式的值应该类型一致
		返回值必须是（byte,short,int,long,enum,String）类型
		case值需要是个常量或者是常量表达式，而不能是变量
		default也可以没有
		如果没有写break，程序会顺序执行到下一个break
		*/

		char c1 = myScanner.next().charAt(0);
		switch(c1) {
			case 'a' :
				System.out.println("今天星期一，今天不上班。");
				break;
			case 'b' :
				System.out.println("今天星期二，今天还是不上班。");
				break;
			case 'c' :
				System.out.println("今天星期三，今天依旧不上班。");
				break;
			default:
				System.out.println("字符不正确！");
		}
	    System.out.println("退出switch，continue...");
	}
}