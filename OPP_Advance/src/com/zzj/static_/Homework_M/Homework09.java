package com.zzj.static_.Homework_M;

public class Homework09 {
    public static void main(String[] args) {
        Students student = new Students("XiaoMing", 'M', 18, "002309398");
        student.printInfo();
        System.out.println("=========");
        Teachers teachers = new Teachers("zzj", 'M', 23, 1);
        teachers.printInfo();
        School[] people = new School[4];
        people[0] = new Students("zzz",'F',15,"02229292");
        people[1] = new Students("jjj",'M',16,"02229293");
        people[2] = new Teachers("jzz",'M',36,10);
        people[3] = new Teachers("jzj",'F',26,2);
        System.out.println("====排序====");
        bubbleSort(people);
        System.out.println("========调用方法=======");
        for (int i = 0; i < people.length; i++) {
            useMethod(people[i]);
        }
    }
    public static void bubbleSort(School[] people) {
        for (int i = 0; i < people.length - 1; i++) {
            for (int j = 0; j < people.length -1 - i; j++) {
                if (people[j].getAge() < people[j+1].getAge()) {
                    School temp = people[j];
                    people[j] = people[j+1];
                    people[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].toString());
        }
    }
    //向下转型，判断类型
    public static void useMethod(School person) {
        if(person instanceof Students) {
            ((Students) person).study();
        } else if (person instanceof Teachers) {
            ((Teachers) person).teach();
        } else {
            System.out.println("Do nothing");
        }
    }
}

class School {
    private String name;
    private char gender;
    private int age;

    public School(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String play() {
        return this.name + "爱玩";
    }
    public void printInfo(){
        System.out.println();
    }
    public String basicInfo() {
        return "name: " + name + "\nage: " + age + "\ngender: " + gender;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}

class Students extends School {
    private String stu_id;

    public Students(String name, char gender, int age, String stu_id) {
        super(name, gender, age);
        this.stu_id = stu_id;
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }
    public void study() {
        System.out.println("我承诺，我要好好学习！");
    }

    @Override
    public String play() {
        return super.play() + "篮球";
    }

    public void printInfo() {
        System.out.println("学生信息：");
        System.out.println(super.basicInfo());//直接调用父类
        System.out.println("学号： " + stu_id);
        study();//直接调用方法
        System.out.println(play());//调用重写的方法
    }

    @Override
    public String toString() {
        return "Students{" +
                "stu_id='" + stu_id + '\'' +
                super.toString() +
                '}';
    }
}

class Teachers extends School {
    private int work_age;

    public Teachers(String name, char gender, int age, int work_age) {
        super(name, gender, age);
        this.work_age = work_age;
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }
    public void teach() {
        System.out.println("我承诺，我会认真教学！");
    }

    @Override
    public String play() {
        return super.play() + "象棋";
    }
    public void printInfo() {
        System.out.println("老师信息：");
        System.out.println(super.basicInfo());
        System.out.println("工龄： " + work_age);
        teach();
        System.out.println(play());
    }

    @Override
    public String toString() {
        return "Teachers{" +
                "work_age=" + work_age +
                super.toString() +
                '}';
    }
}
