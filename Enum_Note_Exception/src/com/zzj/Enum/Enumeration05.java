package com.zzj.Enum;

public class Enumeration05 {
    public static void main(String[] args) {
        Week[] weeks = Week.values();
        System.out.println("===所有星期信息如下===");
        for(Week week : weeks){
            System.out.println(week);
        }
    }
}
//不能继承，因为默认有继承了。可以执行接口
@SuppressWarnings({"all"})
enum  Week {
    MONDAY("星期一"), TUESDAY("星期二"), WEDNESDAY("星期三"), THURSDAY("星期四"),
    FRIDAY("星期五"), SATURDAY("星期六"), SUNDAY("星期日");

    private String name;

    private Week(String name) {
        this.name = name;
    }
    static {};

    @Override
    public String toString() {
        return "Week{" +
                "name='" + name + '\'' +
                '}';
    }
}



