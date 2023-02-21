package com.zzj.static_.StaticMethod;

public class StaticMethod {
    public static void main(String[] args) {
       //创建两个学生对象，交学费
//        Student Tom = new Student("Tom");
//        Tom.payFee(100);
//        Student Mary = new Student("Mary");
//        Mary.payFee(300);
        //直接用类方法调用也可
        Student.payFee(200);
        Student.showFee();
        System.out.println(Student.fee);
        //如果我们希望不创建instance也可以调用某个方法，即当作工具使用
        //这时，把方法做成静态方法时非常合适
        System.out.println("9开平方的结果是=" + Math.sqrt(9));
        System.out.println("1+2=" + MyTools.calSum(1,2));
    }
}
//可以自己开发工具自己用
class MyTools {
    public static double calSum(double n1, double n2) {
        return n1 + n2;
    }
}
class Student {
    private String name;
    //定义一个类变量，来累计学生的学费
    public static double fee = 0;
    public Student(String name) {
        this.name = name;
    }
    public static void payFee(double fee) {
        Student.fee += fee;
    }
    public static void showFee() {
        System.out.println("总学费有：" + Student.fee);
    }
}
