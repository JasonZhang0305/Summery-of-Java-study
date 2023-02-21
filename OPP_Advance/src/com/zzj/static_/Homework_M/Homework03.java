package com.zzj.static_.Homework_M;

public class Homework03 {
    public static void main(String[] args) {
        Manager zzj = new Manager("zzj", 150, 20, 1.2);
        zzj.setBonus(6000);
        zzj.printSal();
        CommonEmployee jjj = new CommonEmployee("jjj", 100, 24, 1);
        jjj.printSal();
    }
}
class Employee {
    private String name;
    private double daySal;
    private int workDays;
    private double grade;

    public Employee(String name, double daySal, int workDays, double grade) {
        this.name = name;
        this.daySal = daySal;
        this.workDays = workDays;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDaySal() {
        return daySal;
    }

    public void setDaySal(double daySal) {
        this.daySal = daySal;
    }

    public int getWorkDays() {
        return workDays;
    }

    public void setWorkDays(int workDays) {
        this.workDays = workDays;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
    public void printSal() {
        System.out.println(name + ", salary= " + daySal*workDays*grade);
    }
}
class Manager extends Employee {
    private double bonus;

    public Manager(String name, double daySal, int workDays, double grade) {
        super(name, daySal, workDays, grade);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void printSal() {
        System.out.println("Manager: " + getName() + ", salary=" +
                (getDaySal() * getWorkDays() * getGrade() + bonus));
    }
}
class CommonEmployee extends Employee {
    public CommonEmployee(String name, double daySal, int workDays, double grade) {
        super(name, daySal, workDays, grade);
    }

    @Override
    public void printSal() {
        System.out.print("Common employee: ");
        super.printSal();
    }
}
