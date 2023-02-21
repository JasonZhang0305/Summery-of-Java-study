package com.extend_.improve_;

import com.extend_.Graduate;
import com.extend_.Pupil;

public class Extends01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "小明";
        pupil.age = 10;
        pupil.testing();
        pupil.setScore(60);
        pupil.showInfo();
        System.out.println("======");
        Graduate graduate = new Graduate();
        graduate.name = "zzj";
        graduate.age = 23;
        graduate.testing();
        graduate.setScore(100);
        graduate.showInfo();
    }
}
