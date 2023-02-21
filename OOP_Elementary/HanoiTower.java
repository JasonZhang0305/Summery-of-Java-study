
public class HanoiTower {
	public static void main(String[] args) {
		Tower tower = new Tower();
		tower.move(5, 'A', 'B', 'C');
	}
}

class Tower {
	public void move(int num, char a, char b, char c){
		int count = 0;
		if(num ==1){
			System.out.println(a + "->" + c);
		} else {
			//如果有多个盘，可以看成两个，最下面的和最上面的所有盘
			//1.先移动上面所有的盘到b，借助c
			move(num - 1, a, c, b);
			System.out.println(a+ "->" + c);
			move(num - 1, b, a, c);
		}
	}
}