package com.encap;

public class Encapsulation01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("jackshakdhaskdh");
        person.setAge(30);
        person.setSalary(3000);
        System.out.println(person.info());
        System.out.println(person.name);
        System.out.println(person.getSalary());
        Person smith = new Person("smith", 2000, 50000);
        System.out.println("======smith的信息=====");
        System.out.println(smith.info());
    }
}

class Person {
    public String name;
    private  int age;
    private double salary;

    //创建构造器
    public Person() {
    }
    public Person(String name, int age, double salary) {
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public void setName(String name) {
        //加入对数据的校验, 完善业务逻辑
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("姓名有误");
            this.name = "翠花";
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("超出年龄范围，无效！");
            this.age = 18;
        }
    }

    public double getSalary() {
       return -1;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String info() {
        return "信息为: name = " + name + ", age = " + age + ", 薪水 = " + salary;
    }
}