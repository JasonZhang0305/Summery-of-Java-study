package com.zzj.static_.Abstract.Template;

public class BB {
    public void job() {
        long start = System.currentTimeMillis();
        long num = 0;
        for (long i = 1; i <= 900000; i++) {
            num -= i;
        }
        long end = System.currentTimeMillis();
        System.out.println("BB执行时间" + (end - start));
    }
}
