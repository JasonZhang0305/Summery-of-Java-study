//小老鼠出迷宫
public class MiGong {
	public static void main(String[] args) {
		
		int[][] map = new int[8][7];
		//3.将最上面一行和最下面一行全部设置为1
		for (int i = 0; i < 7; i++) {
			map[0][i] = 1;
			map[7][i] = 1;
		}
		//4.将最右面的第一列和最左面的第一列全部设置为1
		for (int j = 0; j < 8; j++) {
			map[j][0] = 1;
			map[j][6] = 1;
		}
		map[3][1] = 1;
		map[3][2] = 1;
		map[2][2] = 1;//测试一个回溯

		System.out.println("====Map====");
		for (int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}

		//使用findWay给老鼠找路
		T t1 = new T();
		t1.findWay(map, 1, 1);

		System.out.println("=====findWay=====");

		for (int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}
}

class T {
	//用递归来解决迷宫问题
	//1.找到时T，没找到是F
	//2.i,j就是老鼠的位置 
	//3.定规则：0表示可以走，1表示障碍物，2表示可以走的最短路径，3表示走过但走不通
	//4.当map[6][5]=2时，就说明找到通路，否则就继续找
	//5.先确定找路的策略：下 右 上 左
	public boolean findWay(int[][] map, int i, int j) {
		if (map[6][5] == 2) {
			return true;
		} else {
			if(map[i][j] == 0) {
				map[i][j] = 2; //假定能走通
				if(findWay(map, i+1, j)) { //先测试往下走
					return true;
				} else if(findWay(map, i, j+1)) { //再测试往右走
					return true;
				} else if (findWay(map, i-1, j)) { //再测试往左走
					return true;
				} else if (findWay(map, i, j-1)) { //再测试往上走
					return true;
				} else {
					map[i][j] = 3;
					return false;
				}
			} else {
				return false;
			}
		}
	}
}