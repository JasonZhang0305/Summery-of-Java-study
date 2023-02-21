package com.zzj.static_.singleTon01;

public class SingleTon01 {
    public static void main(String[] args) {
        //用方法来掉对象
        GirlFriend instance = GirlFriend.getInstance();
        System.out.println(instance);
        GirlFriend instance2 = GirlFriend.getInstance();
        System.out.println(instance2);

    }

}
class GirlFriend {
    private String name;
    //为了能够在静态方法中返回对象，需要将其修饰为static
    private static GirlFriend gf = new GirlFriend("Jeccica");
    //规定只能创建一个Girlfriend对象
    //【单利模式】-【饿汉式】：先创建好一个instance，调用的时候直接返回
    //但是存在浪费资源问题
    //1 将构造器私有化
    //2 在类内部直接创建static对象
    //3 提供一个公共的static方法，返回对象
    private GirlFriend(String name) {
        this.name = name;
    }
    public static GirlFriend getInstance() {
        return gf;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}
