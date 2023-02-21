

public class c5P4 {
	
	public static void main(String[] args) {
		double count = 1;
		for(double i = 2; i <= 100; i++) {
			if (i % 2 != 0) {
				//double j = 1 / i;
				count += 1/i;	
			} else {
				//double k = -1 / i;
				count += -1/i;	
			}	
		}
		System.out.println("count=" + count);

	}
}