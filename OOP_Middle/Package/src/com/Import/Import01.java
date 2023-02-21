package com;
//import需要放在package和class之间
//import可以有多条；没有顺序要求
import java.util.Arrays;

//类定义
public class Import01 {
    public static void main(String[] args) {
        int[] arr = {-1, 20, 3, 12, 3};
        //用系统提供的相关类完成排序
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
