package com.zzj.collection_.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListExercise {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Book("三国演义","罗贯中",30));
        list.add(new Book("水浒传","施耐庵",31));
        list.add(new Book("红楼梦","曹雪芹",33));
        list.add(new Book("史记","司马迁",23));
        //遍历
        for (Object obj : list) {
            System.out.println(obj);
        }
        //对集合进行排序
        System.out.println("======");
        sort(list);
    }
    public static void sort(List list) {
        for (int i = 0; i < list.size() -1; i++) {
            for (int j = 0; j < list.size() -1 -i; j++) {
                Book book1 = (Book) list.get(j);
                Book book2 = (Book) list.get(j+1);
                if (book1.getPrice() > book2.getPrice()) {
                    list.set(j,book2);
                    list.set(j+1,book1);
                }
            }
        }
        for (Object o : list) {
            System.out.println(o);
        }

    }
}
class Book {
    private String name;
    private String author;
    private int price;

    public Book(String name, String author, int price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}