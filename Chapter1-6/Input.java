import java.util.Scanner;
public class Input {

	public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("今天天气如何");
        String weather = myScanner.next();
        System.out.println("今天心情如何");
        String mood = myScanner.next();
	    System.out.println("今日汇总如下");
	    System.out.println("天气" + weather + "心情" + mood);
	}
}