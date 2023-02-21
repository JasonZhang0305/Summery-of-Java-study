package com.zzj.Generic_;

import java.util.*;

public class Generic_ {
    public static void main(String[] args) {
        //泛型本质：传递类型参数
        HashSet<Student> students = new HashSet<>();
        students.add(new Student("jack",18));
        students.add(new Student("tom",28));
        students.add(new Student("mary",19));
        for (Student student : students) {
            System.out.println(student);
        }
        //k-String v-Student
        HashMap<String, Student> stu = new HashMap<>();
        stu.put("milan",new Student("milan",38));
        stu.put("jack",new Student("jack",28));
        stu.put("zzj",new Student("zzj",23));

        Set<Map.Entry<String,Student>> entries = stu.entrySet();
        Iterator<Map.Entry<String, Student>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Student> next = iterator.next();
            System.out.println(next.getKey() + "-" + next.getValue());
        }
    }
}
class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
