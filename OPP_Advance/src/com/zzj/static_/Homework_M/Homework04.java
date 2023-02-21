package com.zzj.static_.Homework_M;

public class Homework04 {
    public static void main(String[] args) {
        Worker worker = new Worker(60000);
        worker.printAnnual();
        Farmer farmer = new Farmer(50000);
        farmer.printAnnual();
        Waiter waiter = new Waiter(40000);
        waiter.printAnnual();
        Tutor tutor = new Tutor(80000);
        tutor.setFee(100);
        tutor.setDay(20);
        tutor.printAnnual();
        Scientist scientist = new Scientist(200000);
        scientist.setBonus(300000);
        scientist.printAnnual();
    }
}
class Employees {
    private double basic;

    public Employees(double basic) {
        this.basic = basic;
    }

    public double getBasic() {
        return basic;
    }

    public void setBasic(double basic) {
        this.basic = basic;
    }
    public void printAnnual() {
        System.out.println(basic);
    }
    public void g1(){};
}
class Worker extends Employees {
    public Worker(double basic) {
        super(basic);
    }

    @Override
    public void printAnnual() {
        System.out.print("👷的💰为");
        super.printAnnual();
    }
    ;
}

class Farmer extends Employees {
    public Farmer(double basic) {
        super(basic);
    }

    @Override
    public void printAnnual() {
        System.out.print("🧑‍🌾的💰为");
        super.printAnnual();
    }
}
class Waiter extends Employees {
    public Waiter(double basic) {
        super(basic);
    }

    @Override
    public void printAnnual() {
        System.out.print("💁‍的💰为");
        super.printAnnual();
    }
}

class Tutor extends Employees {
    private double fee;
    private int day;

    public Tutor(double basic) {
        super(basic);
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public void printAnnual() {
        System.out.print("🧑‍🏫‍的💰为");
        System.out.println(fee * day + getBasic());
    }
}

class Scientist extends Employees {
    private double bonus;

    public Scientist(double basic) {
        super(basic);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void printAnnual() {
        System.out.print("🧑‍🔬‍的💰为");
        System.out.println(getBasic() + bonus);
    }
}