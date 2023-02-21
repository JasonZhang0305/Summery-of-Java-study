package com.zzj.collection_;

import java.util.HashSet;
import java.util.Objects;

public class Homework04 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        Person p1 = new Person(1001,"AA");
        Person p2 = new Person(1002,"BB");
        set.add(p1);
        set.add(p2);
        System.out.println(set);
        p1.name = "CC";//p1的hashcode已经变了
        set.remove(p1);//remove会找不到地址
        System.out.println(set);
//        set.add(new Person(1001,"CC"));
//        System.out.println(set);
//        set.add(new Person(1011,"AA"));
//        System.out.println(set);

    }
}
class Person {
    public int id;
    public String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);//根据name 和 id来定hashcode，name被
        //修改了的话，hashcode也会变
    }


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}