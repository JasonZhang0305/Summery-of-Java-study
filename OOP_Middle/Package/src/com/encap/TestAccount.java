package com.encap;

public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("Jacky Mamm");
        account.setPwd("199935zzj");
        account.setBalance(10);

        account.showInfo();
    }
}
