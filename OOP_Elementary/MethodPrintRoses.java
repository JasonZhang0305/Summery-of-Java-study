//编写一个方法，判断一个数是奇数还是偶数，返回boolean值

public class MethodPrintRoses {
	//main method
	public static void main(String[] args) {
		// AA a = new AA();
		// if(a.isOdd(1)) {
		// 	System.out.println("奇数");
		// } else {
		// 	System.out.println("偶数");
		// }
		AA p = new AA();
		p.printRoses(100, 100);	
	}
}
class AA {
	//思路：
	//1. 方法的返回类型：boolean
	//2. 方法的名字isOdd
	//3. 方法的形参（int num)
	//4. 方法体，判断

	public boolean isOdd(int num) {
		return num % 2 != 0;		
	}

	//method2 打印行列
	public void printRoses(int row, int col) {
		for (int i = 0; i < row; i++) {
			if (i < row - 1) {
				for (int j = 0; j < col; j++) {
					System.out.print("🌹");
				}
			} else {
				for (int j = 0; j < col - 1; j++) {
					System.out.print("🌹");
				}
			}
			System.out.println();			
		}	
	}
}
