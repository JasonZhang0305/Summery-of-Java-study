package com.zzj.wrapper;

public class StringEx {
    public static void main(String[] args) {
        Test1 ex = new Test1();
        ex.change(ex.str, ex.ch);
        System.out.print(ex.str + " and ");
        System.out.println(ex.ch);
        String n = "zzjzzj";
        String m = "zzjzzjzzjzzj";
        System.out.println(n.compareTo(m));
        //占位符 %
        String info = String.format("我的名字是%s, 不是%s, 希望大家喜欢我。",n,m);
        System.out.println(info);
    }
}
class Test1 {
    String str = new String("hsp");
    final char[] ch = {'j', 'a', 'v', 'a'};
    public void change(String str, char ch[]) {
        this.str = "java";
        ch[0] = 'h';
    }
}
