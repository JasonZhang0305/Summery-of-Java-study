package com.zzj.Enum;

public class Homework {
    public static void main(String[] args) {
        Person Ts = new Person("唐僧", new Horse());

    }
}
interface Vehicles {
    public void work();
}
class Horse implements Vehicles {
    @Override
    public void work() {
        System.out.println("获得了🐎");
    }
}
class Boat implements Vehicles {
    @Override
    public void work() {
        System.out.println("获得了🚢");
    }
}
class Factory {
    //将方法做成static比较方便
    public static Horse getHorse() {
        return new Horse();
    }
    public static Boat getBoat() {
        return new Boat();
    }
}
class Person {
    private String name;
    private  Vehicles vehicles;

    //在创建人对象时，事先给他分配一个交通工具
    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }
    public void passRiver() {
        Boat boat = Factory.getBoat();
        boat.work();
    }
    public void common() {
        Horse horse = Factory.getHorse();
        horse.work();
    }
}
