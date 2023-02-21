//输入姓名和密码，登陆机会三次

import java.util.Scanner;
public class break02 {
	
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		String name = "";
		String password = "";
		int chance = 3;
		for( int i = 1; i<= 3; i++) {
			System.out.println("请输入姓名");
			name = myScanner.next();
			System.out.println("请输入密码");
			password = myScanner.next();
			if ("zzj".equals(name) && "666".equals(password)) {
				System.out.println("恭喜你，登陆成功～");
				break;//满足if条件，就提前结束for循环
			}
			chance--;
			System.out.println("你还有" + chance + "次登录机会");
		}
	}
}