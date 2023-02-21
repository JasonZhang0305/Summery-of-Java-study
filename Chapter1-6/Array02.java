//创建char类型的26个元素的数组，分别放置‘A’-‘Z’。

public class Array02 {
	
	public static void main(String[] args) {
		char chars[] = new char[26];//设置空的数组
		//循环赋值
		for(int i = 0; i < chars.length; i++) {
			chars[i] = (char)('A' + i);//'A'+i 是int，需要强转
		}
		//循环输出
		System.out.println("===chars数组===");
		for(int i = 0; i < chars.length; i++) {
			System.out.print(chars[i] + " ");
		}
	}
}