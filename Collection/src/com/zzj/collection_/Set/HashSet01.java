package com.zzj.collection_.Set;

import java.util.HashSet;

public class HashSet01 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        System.out.println(set.add("john"));
        System.out.println(set.add("lucy"));
        System.out.println(set.add("jack"));
        System.out.println(set.add("rose"));
        set.remove("john");
        System.out.println(set);
        set = new HashSet();
        System.out.println(set);
        //hashset不能添加相同的元素/数据
        set.add("lucy");
        set.add("lucy");//加不了
        set.add(new Dog("tom"));//不同的狗
        set.add(new Dog("tom"));//不同的狗
        System.out.println(set);
        set.add(new String("hsp"));
        set.add(new String("hsp"));//加不了
        System.out.println(set);
    }
}
class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
