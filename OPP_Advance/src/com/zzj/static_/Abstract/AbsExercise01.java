package com.zzj.static_.Abstract;

public class AbsExercise01 {
    public static void main(String[] args) {
        Manager jacky = new Manager("Jacky",999,50000,8000);
        jacky.work();
        CommonEmployee samon = new CommonEmployee("Samon", 111, 5000);
        samon.work();
    }
}
