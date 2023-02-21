package com.PolyMorphic.PolyArray;

public class PolyArray {
    public static void main(String[] args) {
        //要求：创建1个person对象，2个student对象，2个teacher对象统一放入数组中，并调用每个对象的say方法
        Person[] persons = new Person[5];
        persons[0] = new Person("jack", 20);
        persons[1] = new Student("tom", 19, 100);
        persons[2] = new Student("neus", 19, 60);
        persons[3] = new Teacher("jacco", 30, 20000);
        persons[4] = new Teacher("king", 50, 40000);

        //循环遍历多态数组，调用say
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].say());//动态绑定机制
            if (persons[i] instanceof Student) {
               //向下多态
                Student student = (Student)persons[i];
               student.study();
                // 等价于 ((Student)persons[i]).study();
            }
            if (persons[i] instanceof Teacher) {
               Teacher teacher = (Teacher) persons[i];
               teacher.teach();
                // 等价于 ((Teacher)persons[i]).teach();
            }
//            persons[i].teach(); 这么写是不行的，因为编译过程中，在父类person里找不到teach方法，就会报错
//            persons[i].study(); 同理
        }
    }
}
