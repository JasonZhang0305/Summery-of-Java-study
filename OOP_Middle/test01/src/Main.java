import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        System.out.println();
        Scanner myScanner = new Scanner(System.in);
        Scanner scanner= new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        MyTools mt = new MyTools();
        int[] arr = {10, -1, 8, 0, 34};
        mt.bubble(arr);
        System.out.println("========");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class MyTools {
    public void bubble(int[] arr){
        for(int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}