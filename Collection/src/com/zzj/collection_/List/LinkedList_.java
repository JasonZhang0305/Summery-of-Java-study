package com.zzj.collection_.List;

import java.util.List;

public class LinkedList_ {
    public static void main(String[] args) {
        Node jacky = new Node("jacky");
        Node tom = new Node("Tom");
        Node zzj = new Node("zzj");
        //链接三个节点，形成双向链表
        //jack -> tom -> zzj
        jacky.next = tom;
        tom.next = zzj;
        //zzj -> tom -> jack
        zzj.pre = tom;
        tom.pre = jacky;

        Node first = jacky;
        Node last = zzj;

        //从头到尾遍历
        System.out.println("======");
        while(true) {
            if (first == null) {
                break;
            }
            System.out.println(first);
            first = first.next;
        }
        //从尾到头遍历
        while(true) {
            if (last == null) {
                break;
            }
            System.out.println(last);
            last = last.pre;
        }
        //添加或删除数组比较方便
        //需求：再tom和zzj之间插入对象 smith
        //1 创建一个Node节点，名字就是smith
        Node smith = new Node("smith");
        //重建双向链表
        smith.next = zzj;
        zzj.pre = smith;
        smith.pre = tom;
        tom.next = smith;
        first = jacky;
        System.out.println("=====First======");
        while (true) {
            if (first == null) {
                break;
            }
            System.out.println(first);
            first = first.next;
        }
        last = zzj;
        System.out.println("=====Last======");
        while (true) {
            if (last == null) {
                break;
            }
            System.out.println(last);
            last = last.pre;
        }
    }
}
//定义一个Node类，Node对象 表示双向链表的一个节点
class Node {
    public Object item;//存放数据
    public Node next;//指向下一个节点
    public Node pre;//指向前一个节点
    public Node(Object name) {
        this.item = name;
    }
    public String toString() {
        return "Node name=" + item;
    }
}
