package com.zzj.Enum;

public class Enumeration03 {
    public static void main(String[] args) {
        System.out.println(Season02.SPRING);
    }
}
enum Season02 {
    //1 使用关键字enum替代class
    //2 用"常量名（实参列表）"来列举，常量名之间用"，"隔开。
    //3 用enum实现枚举，需要将定义常量对象写在前面
    //4 如果使用的是午餐构造器，创建常量对象时，可省略（）
    SPRING("spring", "warm"), SUMMER("summer", "hot"),
    AUTUMN("autumn", "cool"), WINTER("winter", "cold"), WHAT;
    private String name;
    private String desc;

    private Season02(){}
    private Season02(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season01{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}