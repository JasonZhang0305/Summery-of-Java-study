package com.zzj.wrapper;

import java.util.Arrays;

public class System_ {
    public static void main(String[] args) {
        System.out.println("ok1");
//        System.exit(0);//0表示正常状态 程序退出
        System.out.println("ok2");
        int[] src = {1,2,3};
        int[] dest = new int[3];
        System.arraycopy(src,0,dest,0,2);
        System.out.println(dest);
        System.out.println("dest=" + Arrays.toString(dest));
        System.out.println(System.currentTimeMillis());
        System.gc();
    }
}
