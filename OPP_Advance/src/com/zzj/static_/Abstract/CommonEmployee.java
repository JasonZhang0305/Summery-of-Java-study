package com.zzj.static_.Abstract;

public class CommonEmployee extends Employee {
    public CommonEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("Common employee " + getName() + " is working.");
    }
}
