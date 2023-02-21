package com.zzj.Enum;

public class Enumeration {
    public static void main(String[] args) {
        Season season = new Season("spring", "warm");
        Season season1 = new Season("summer", "hot");
        Season season2 = new Season("autumn", "cool");
        Season season3 = new Season("winter", "cold");
        //对象可以继续加下去，但是季节需要限定为4个
    }
}

class Season {
    private String name;
    private String desc;

    public Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}