package com.zzj.static_.Homework_M;

public class Homework01 {
    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person("Jacky",10,"Student");
        people[1] = new Person("Tom",30,"Teacher");
        people[2] = new Person("Mary",50,"Engineer");
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }
        Person temp = null;
        for (int i = 0; i < people.length-1; i++) {
            for (int j = 0; j < people.length-1-i; j++) {
                if(people[j].getName().length() < people[j+1].getName().length()) {
                    temp = people[j];
                    people[j] = people[j+1];
                    people[j+1] = temp;
                }
            }
        }
        System.out.println("=======排序后的======");
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }
    }

}

class Person {
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
