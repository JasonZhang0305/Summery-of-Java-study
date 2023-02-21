package com.zzj;

public class Cat {
    private String name = "招财猫";
    public int age = 10;

    public Cat() {
        this.name = name;
    }

    public void hi() {
        System.out.println("hi" + name);
    }
    public void cry(){
        System.out.println("maio~");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
