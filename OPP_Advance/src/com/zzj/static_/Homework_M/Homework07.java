package com.zzj.static_.Homework_M;

public class Homework07 {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("jacky", 20, "dentist", 'M', 20000);
        Doctor doctor2 = new Doctor("jacky", 20, "dentist", 'F', 20000);
        //Doctor doctor2 = doctor1; //这种情况下是 ojb1 == ojb2
        System.out.println(doctor1.equals(doctor2));

    }
}

class Doctor {
    private String name;
    private int age;
    private String job;
    private char gender;
    private double sal;

    public Doctor(String name, int age, String job, char gender, double sal) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.sal = sal;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public boolean equals(Object obj) {
        if (this == obj) { //判断对象是否指向同一空间
            return true;
        }
        if (!(obj instanceof Doctor)) {
            return false;
        }//判断doctor是否是obj2的类或者子类
        Doctor doctor = (Doctor)obj;//如果是obj是doctor的父类的话，需要向下转型，转换后才能比较属性
        return this.name.equals(doctor.name) && this.age == doctor.age && this.gender ==
                doctor.gender && this.job.equals(doctor.job) && this.sal == doctor.sal;
    }
}
