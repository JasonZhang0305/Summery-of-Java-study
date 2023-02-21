package com.zzj.collection_.Set;

import java.util.HashSet;
import java.util.Objects;

public class HashSetIncrement {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i <= 100; i++) {
            hashSet.add(i);
        }
        for (int i = 0; i <= 12; i++) {
            hashSet.add(new A(i));
        }
        System.out.println(hashSet);
    }
}
class A {
    private int n;

    public A(int n) {
        this.n = n;
    }

    @Override
    public int hashCode() {
        return 100;
    }
}