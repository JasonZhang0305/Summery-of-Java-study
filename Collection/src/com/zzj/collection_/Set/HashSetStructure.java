package com.zzj.collection_.Set;

public class HashSetStructure {
    public static void main(String[] args) {
        //Hashset的底层就是Hashmap
        //创建一个数组，数组的类型是Node[]
        Node[] table = new Node[16];
        System.out.println(table);
        Node john = new Node("john", null);
        table[2] = john;
        Node jack = new Node("jack", null);
        john.next = jack;
        Node rose = new Node("rose",null);
        jack.next = rose;
        Node luck = new Node("luck", null);
        table[3] = luck;
        System.out.println(table);
    }
}
class Node {
    Object item;
    Node next;

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }
}