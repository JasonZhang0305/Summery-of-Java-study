//把需要的功能写到一个类的方法中，然后需要的时候调用该方法

public class Method02 {
	//main method
	public static void main(String[] args) {
		
		int [][] map = {{0, 0, 0},{1, 1, 1},{1, 1, 3}};
		//使用方法完成输出
		MyTools tool = new MyTools();
		Person p1 = new Person();
		tool.printArr(map);
		tool.printArr(map);
		tool.printArr(map);
	}
}
class MyTools {
	public void printArr(int[][] map) {
		System.out.println("=====");
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}
}
