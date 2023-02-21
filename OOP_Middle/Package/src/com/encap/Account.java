package com.encap;

public class Account {
    //为了封装，将3个属性设置为private
    private String name;
    private double balance;
    private String pwd;

    public Account() {
    }

    public Account(String name, double balance, String pwd) {
        this.setName(name);
        this.setBalance(balance);
        this.setPwd(pwd);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name.length() >= 2 && name.length() <= 8) {
            this.name = name;
        } else {
            System.out.println("姓名要求2-8位数，默认值为'无名'。");
            this.name = "无名";
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance > 20) {
            this.balance = balance;
        } else {
            System.out.println("余额须大于20，默认为0");
            this.balance = 0;
        }
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        if (pwd.length() == 6) {
            this.pwd = pwd;
        } else {
            System.out.println("密码须为6位数，否则默认为000000");
            this.pwd = "000000";
        }
    }
    public void showInfo() {
        System.out.println("账号信息： 姓名为 " + name + ", 余额为 " + balance + ", 密码为 " + pwd);
    }
}
