//多维数组
public class TwoDimArr {
	
	public static void main(String[] args) {
		//定义一个一维数组
		int[][] arr = { {0, 0, 1},
					    {0, 1, 0},
					    {1, 0, 0} };
		int num1 = arr.length;

		//输出二维图形
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "  ");			    		
			}				    	
			System.out.println();
		}
		System.out.println(num1);					    
	}
}	