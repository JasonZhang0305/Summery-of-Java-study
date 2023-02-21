package com.PolyMorphic;

public class Poly01 {
    public static void main(String[] args) {
        Master tom = new Master("Tom");
        Dog dog= new Dog("阿欢");
        Bone bone = new Bone("🦴");
        tom.feed(dog, bone);

        Cat cat = new Cat("阿喵");
        Fish fish = new Fish("🐟");
        System.out.println("=======");
        tom.feed(cat, fish);

        Pig pig = new Pig("阿花");
        Rice rice = new Rice("🍚");
        System.out.println("=======");
        tom.feed(pig, rice);
    }
}
