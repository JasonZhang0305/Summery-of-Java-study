package com.zzj.static_.Abstract.Template.ModifiedTemplate;

abstract public class Template {
    public abstract void work();
    public void calculateTime() {
        long start = System.currentTimeMillis();
        long num = 0;
        for (long i = 1; i <= 900000; i++) {
            num += i;
        }
        long end = System.currentTimeMillis();
    }
}
