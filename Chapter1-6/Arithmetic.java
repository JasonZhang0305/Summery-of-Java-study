/**
 * 演示算数运算符的使用
 */

 public class Arithmetic {

    public static void main(String[] args) {
        // /的使用
        System.out.println(10 / 4); // 整数运算后结果依旧是整数 2
        System.out.println(10.0 / 4); // 小数参与运算之后结果会付给高精度的数值 2.5
        double d = 10 / 4; // 10 / 4 => 2 -> 2.0
        System.out.println(d);

        // % 的运算逻辑： a % b = a - a/b * b



        // ++
        int i = 10;
        i++;// i = i + 1
        ++i;// i = i + 1
        System.out.println("i=" + i);

        /*
        作为表达式使用时
        ++ii先自增后赋值
        i++先赋值后自增
        */
        int j = 8;
        int k =j++;
        System.out.println("k = " + k + "j = " + j);
        int k = ++j;
        System.out.println(k);
    }



 }