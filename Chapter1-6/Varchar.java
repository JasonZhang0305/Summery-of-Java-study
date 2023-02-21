//char的基本使用; char的本质是整数。

public class Varchar {
	public static void main(String[] args) {
		char c1 = 'a';
		char c2 = '张';
		char c3 = 99; // 99=c; 字符类型可以直接存放一个数字
		char c4 = '9';
		char c5 = '\t';
	    System.out.println(c1);
	    System.out.println((int)c2);
	    System.out.println(c3);
	    System.out.println(c4);
	    System.out.println(c5);
	    //char也能运算
        char c6 = 'b' + 1;
	    System.out.println((int)c6);
	    System.out.println(c6);

	}
}