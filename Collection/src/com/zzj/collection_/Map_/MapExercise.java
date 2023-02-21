package com.zzj.collection_.Map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"all"})
public class MapExercise {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1,new Employee("zzj",10000,1));
        map.put(2,new Employee("zjj",15000,2));
        map.put(3,new Employee("jjj",20000,3));

        //用keySet方法遍历
        Set keySet = map.keySet();
        for (Object key : keySet) {
            Employee employee = (Employee) map.get(key);
            if (employee.getSalary() > 18000) {
                System.out.println(employee);
            }
        }
        //使用EntrySet的迭代器
        Set entrySet = map.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry =  (Map.Entry)iterator.next();
            Employee employee = (Employee) entry.getValue();
            if (employee.getSalary() > 18000) {
                System.out.println(employee);
            }
        }
    }
}
class Employee {
    private String name;
    private double salary;
    private int id;

    public Employee(String name, double salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                '}';
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
