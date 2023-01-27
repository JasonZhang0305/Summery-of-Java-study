/* 猴子吃桃：
   有一对桃子，猴子第一天吃了其中的一半多一个，第二天又吃了其中一半多一个，
   吃到第10天时，只剩一个桃子了
   问：最初有多少个桃子
*/
public class Recursion03 {
	//main method
	public static void main(String[] args) {
		T t1 = new T();
		System.out.println(t1.peach(1));
	}
}

class T {
	// 找到变量：桃子，天数
	/*day = 10, peach = 1;
	  day = 9, peach = (day10+1)*2
	  ...
	*/
	public int peach(int day) {
		if (day == 10) {
			return 1;
		} else if (day >= 1 && day <= 9) {
			return(peach(day + 1)+1)*2;
		} else {
			System.out.println("day在1-10内");
			return -1;
		}
		
	}
}