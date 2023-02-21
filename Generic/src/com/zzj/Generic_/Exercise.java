package com.zzj.Generic_;

import java.util.ArrayList;
import java.util.Comparator;

public class Exercise {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("tom",20000,new MyDate(2000,11,1)));
        employees.add(new Employee("jack",25000,new MyDate(2001,1,11)));
        employees.add(new Employee("zzj",30000,new MyDate(2002,3,30)));
        System.out.println("Employees=" + employees);
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (!(o1 instanceof Employee && o2 instanceof Employee)) {
                    System.out.println("类型不正确");
                    return 0;
                }
                int i = o1.getName().compareTo(o2.getName());
                if (i != 0) {
                    return i;
                }
                int yearMinus = o1.getBirthday().getYear() - o2.getBirthday().getYear();
                if (yearMinus != 0) {
                    return yearMinus;
                }
                int monthMinus = o1.getBirthday().getMonth() - o2.getBirthday().getMonth();
                if (monthMinus != 0) {
                    return monthMinus;
                }
                return o1.getBirthday().getDay() - o2.getBirthday().getDay();
            }
        });
        System.out.println("=====Sort=====");
        System.out.println(employees);
    }
}

class MyDate {
    private int year;
    private int month;
    private int day;
    public MyDate(int year, int month,int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear(){
        return  year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
class Employee {
    private String name;
    private double salary;
    private MyDate birthday;

    public Employee(String name, double salary, MyDate birthday) {
        this.name = name;
        this.salary = salary;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", birthday=" + birthday +
                '}' + "\n";
    }
}