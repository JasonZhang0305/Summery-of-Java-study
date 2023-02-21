//自动转换
public class autoconvert {

	public static void main(String[] args) {
		int num = 'a'; // char ->int
		double d1 = 80; // int -> double
	    System.out.println(num); //97
	    System.out.println(d1); //80.0
	    //系统会自动将所有数据转换成容量最大的数据类型，然后进行计算
	    int n1 = 10;
	    float n2 = n1 + 1.1f; // int + float 结果是float 
	    System.out.println(n2); //11.1
	    
	    //byte, short, char 三折可以计算，计算后直接转为int
        byte b1 = 1;
        byte b2 = 2;
        short b3 = 3;
        int b4 = 4;
        int s1 = b1 + b2; //true: b1 + b2 =>int
        //byte s2 = b1 + b3; false: b1 + b3 =>int /= byte

        //boolean不参与转换

        //自动提升原则： 表达结果的类型自动提升为操作数中最大的类型
        double e1 = d1 + b1 + s1; // double + byte + int => double
        System.out.println(e1); // 84.0 (double)

        //基本数据类型转String
        int f1 = 1;
        float f2 = 1.1f;
        double f3 = 1.1;
        boolean f4 = true;
        String r1 = f1 + "";
        String r2 = f2 + "";
        String r3 = f3 + "";
        String r4 = f4 + "";
        System.out.println(r1 + r2 + r3 + r4);

        //String -> 其他
        int num1 = Integer.parseInt(r1);
        float num2 = Float.parseFloat(r2);
        double num3 = Double.parseDouble(r3);
        boolean num4 = Boolean.parseBoolean(r4);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
	}
}