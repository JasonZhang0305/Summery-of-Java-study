import java.util.Scanner;
public class If01 {

	public static void main(String[] arge) {
    	
    	Scanner myScanner = new Scanner(System.in);
    	System.out.println("请输入年龄:");
    	int age = myScanner.nextInt();
	    if (age > 0 && age < 100) {
	    	if (age < 18) {
	    		System.out.println("十八🈲️");
	    	} else if (age > 65) {
	    		System.out.println("高龄者⚠️");
	    	} else {
	    		System.out.println("Continue...");
	    	}
	    } else {
	    	System.out.println("年龄不在范围内！");
	    }

	}
}