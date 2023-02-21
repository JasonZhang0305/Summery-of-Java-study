import java.util.Scanner;

public class ex02 {
    public static void main(String[] args ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        for(int i = 1; i <= N; i++) {
            if (i % X == 0 && i % Y == 0) {
                System.out.println("AB");
            } else if (i % X == 0) {
                System.out.println("A");
            } else if (i % Y == 0) {
                System.out.println("B");
            } else {
                System.out.println("N");
            }
        }
    }
}
