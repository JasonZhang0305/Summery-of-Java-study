//顺序查找
import java.util.Scanner;
public class SeqSearch {
	
	public static void main(String[] args) {
		String[] colors = {"red", "blue", "yellow", "black"};
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Please enter my favorite color.");
		String favColor = myScanner.next(); 
		int index = -1;
		for(int i = 0; i < colors.length; i++) {
			if (favColor.equals(colors[1])) {
				System.out.println("Congratulate!");
				index = i;
			    break;	
			}    		
		}
		if (index == -1) {
			System.out.println("Sorry, you did not find it. ");
		}
	}
}	