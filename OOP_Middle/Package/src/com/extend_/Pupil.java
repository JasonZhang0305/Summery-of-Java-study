package com.extend_;
//小学生模拟考试的情况
public class Pupil {
    //属性三个
    public String name;
    public int age;
    private double score;

    //方法三个
    public void setScore(double score) {
        this.score = score;
    }
    public void testing() {
        System.out.println("小学生" + name + "正在考小学数学...");
    }
    public  void showInfo() {
        System.out.println("小学生名" + name + "年龄" + age + "成绩" + score);
    }
}
