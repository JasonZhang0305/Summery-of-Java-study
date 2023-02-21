package com.zzj.Enum;

public class Enumeration04 {
    public static void main(String[] args) {
        Gender boy1 = Gender.BOY;
        Gender boy2 = Gender.BOY;
        System.out.println(boy1);
        System.out.println(boy1 == boy2);
    }
}
enum Gender {
    BOY, GIRL
}
