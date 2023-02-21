package com.extend_;
//大学生类 -> 模拟大学生考试的简单情况
public class Graduate {
    //属性三个
    public String name;
    public int age;
    private double score;

    //方法三个
    public void setScore(double score) {
        this.score = score;
    }
    public void testing() {
        System.out.println("大学生" + name + "正在考小学数学...");
    }
    public  void showInfo() {
        System.out.println("大学生名" + name + "年龄" + age + "成绩" + score);
    }
}
