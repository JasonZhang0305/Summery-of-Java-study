package com.zzj.Enum;

public class Homework01 {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        cat.shout();
        dog.shout();

    }
}
abstract class Animal {
    public abstract void shout();
}
class Cat extends Animal {
    @Override
    public void shout() {
        System.out.println("miao~");
    }
}
class Dog extends Animal {
    @Override
    public void shout() {
        System.out.println("wang!");
    }
}
