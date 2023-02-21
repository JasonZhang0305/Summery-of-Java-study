package com.zzj.static_.Homework_M;

public class Homework06 {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(1000);
        checkingAccount.deposit(100);
        checkingAccount.withdraw(9);
        System.out.println(checkingAccount.getBalance());//子类instance可以调用父类的所用可以调用的方法和字段
        System.out.println("==============");
        SavingAccount savingAccount = new SavingAccount(1000);
        savingAccount.deposit(100);
        savingAccount.deposit(200);
        savingAccount.deposit(300);
        System.out.println(savingAccount.getBalance());
        savingAccount.deposit(100);
        System.out.println(savingAccount.getBalance());
        savingAccount.earnMonthlyInterest();
        System.out.println(savingAccount.getBalance());
    }
}

class BankAccount{
    private double balance;
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount){
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}

class CheckingAccount extends BankAccount{

    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }
    @Override
    public void deposit(double amount) {
        super.deposit(amount - 1);
        System.out.println("已存入" + amount + "元，" + "手续费1元。");
    }
    @Override
    public void withdraw(double amount) {
        super.withdraw(amount + 1);
        System.out.println("已取出" + amount + "元，" + "手续费1元。");
    }
}

class SavingAccount extends BankAccount {
    private int count = 3;//免费取款次数
    private double rate = 0.01;
    public void earnMonthlyInterest() {
        count = 3;//每个月月初先将免费取款次数重置
        super.deposit(getBalance() * rate);
    }

    public SavingAccount(double initialBalance) {
        super(initialBalance);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public void deposit(double amount) {
        //判断是否可以免手续费
        if(count > 0) {
            super.deposit(amount);
        } else {
            super.deposit(amount - 1);
        }
        count--;
    }

    @Override
    public void withdraw(double amount) {
        if(count > 0) {
            super.withdraw(amount);
        } else {
            super.withdraw(amount + 1);
        }
        count--;
    }
}