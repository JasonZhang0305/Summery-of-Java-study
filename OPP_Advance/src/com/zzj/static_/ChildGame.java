package com.zzj.static_;

public class ChildGame {
    public static void main(String[] args) {
        Child child1 = new Child("zzj");
        child1.join();
        child1.count++;

        Child child2 = new Child("zjz");
        child2.join();
        child2.count++;

        Child child3 = new Child("jjz");
        child3.join();
        child3.count++;
        System.out.println("共有" + Child.count + "个小孩加入了游戏...");
        //静态变量是类加载的时候就创建了，所以我们没有创建实力也可以访问
        System.out.println(Child.beijing);
    }
}

class Child {
    private String name;
    public static int count = 0;
    public static int beijing = 000000;
    public Child(String name) {
        this.name = name;
    }
    public void join(){
        System.out.println(name + " 加入了游戏...");
    }
}
