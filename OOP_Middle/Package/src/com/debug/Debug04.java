package com.debug;

import java.util.Arrays;

//演示执行到下一个断点
public class Debug04 {
    public static void main(String[] args) {
        int[] arr = {1, -1, 10, 20, 100};
        //用Debug追踪Arrays.sort方法的底层逻辑
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("hello100");
        System.out.println("hello200");
        System.out.println("hello300");
        System.out.println("hello400");
    }
}
