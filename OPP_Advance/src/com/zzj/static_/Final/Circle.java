package com.zzj.static_.Final;

public class Circle {
    public static void main(String[] args) {
        C c = new C(6);
        System.out.println(c.calCircle());
    }
}
class C {
    private double radius;

    public C(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    private final double PI = 3.14;

    public double getPI() {
        return PI;
    }
    public double calCircle() {
        return PI*radius*radius;
    }
}
