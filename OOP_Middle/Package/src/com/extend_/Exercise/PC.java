package com.extend_.Exercise;

public class PC extends Computer{

    private String brand;
    //这里也体现：继承设计的基本思想，父类的构造器完成父类的初始化
    //主类的构造器完成主类的初始化
    public PC(String cup, int memory, int disk, String brand) {
        super(cup, memory, disk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void printInfo() {
        System.out.println("PC信息如下：");
        //System.out.println(getCpu() + getMemory() + getDisk());
        System.out.println(getDetails() + ", brand=" + brand);
    }
}
