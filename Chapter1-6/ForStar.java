//用for循环打金字塔
/*化繁为简：
  先打一个矩形
  再打半个金字塔
  打印整个金字塔
  打印空心金字塔
  先死后活：
  层数做成变量
*/

public class ForStar {
	
	public static void main(String[] args) {
		
		int Layer = 10;
		for(int i = 1; i<= Layer; i++) { //i 表示层数
			for(int k = 1; k <= Layer - i;k++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= 2 * i -1; j++){
				if(j == 1 || j == 2 * i - 1 || i == Layer) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}	
		//每打印一层后就换行
			System.out.println("");
		}	
	}
}