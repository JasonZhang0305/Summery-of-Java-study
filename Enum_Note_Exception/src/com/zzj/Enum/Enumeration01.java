package com.zzj.Enum;

public class Enumeration01 {
    public static void main(String[] args) {
        System.out.println(Season01.SPRING);
        System.out.println(Season01.SUMMER);
    }
}
//定义枚举实现,作用是限定对象个数
class Season01 {
    private String name;
    private String desc;
    public static final Season01 SPRING = new Season01("spring", "warm");
    public static final Season01 SUMMER = new Season01("summer", "hot");
    public static final Season01 AUTUMN = new Season01("autumn", "cool");
    public static final Season01 WINTER = new Season01("winter", "cold");
    //1 构造器私有化，防止直接 new
    //2 去掉set，防止属性被修改
    //3 在season内部创建固定对象
    //4 优化：可以加一个final，因为final和static一起用可以在不进行类加载的情况下访问属性
    private Season01(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }


    public String toString() {
        return "Season01{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}