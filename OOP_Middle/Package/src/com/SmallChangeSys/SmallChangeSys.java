package com.SmallChangeSys;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {

    public static void main(String[] args) {
        //1.メニューを作る；相関変数の定義
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String key = "";
        //2.小銭内訳
        String details = "----------小銭内訳----------";
        //3.収益イン
        double money = 0;
        double balance = 0;
        Data data = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        //4.消費
        String note = "";
        //5.退出
        String choice = "";

        do{
            System.out.println("\n=========小銭メニュー=========");
            System.out.println("\t\t1 内訳");
            System.out.println("\t\t2 収益");
            System.out.println("\t\t3 消費");
            System.out.println("\t\t4 退出");

            System.out.println("操作内容を選択してください(1-4): ");
            key = scanner.next();

            //switchを用いて条件分岐を作る
            switch (key) {
                case "1":
                    System.out.println(details);
                    break;
                case "2":
                    System.out.println("収益の金額：");
                    money = scanner.nextDouble();
                    if (money <= 0) {
                        System.out.println("収益金額は０以下にならない");
                        break;
                    }
                    balance += money;
                    Date date = new Date();
                    System.out.print(sdf.format(date));
                    details += "\n収益イン" + "\t+" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case "3":
                    System.out.println("消費金額：");
                    money = scanner.nextDouble();
                    if (money <= 0 || money > balance) {
                        System.out.println("消費金額は０ー" + balance + "の間にあるはずだ！");
                        break;
                    }
                    System.out.println("消費説明");
                    note = scanner.next();
                    balance -= money;
                    date = new Date();
                    details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case "4":
                    while(true) {
                        System.out.println("退出しますか(Y/N)");
                        choice = scanner.next();
                        //建议一段代码完成一个小功能，不要混在一起
                        if("Y".equals(choice) || "N".equals(choice)) {
                            break;
                        } else {
                            System.out.println("入力が間違いました。もう一度お願いします！");
                        }
                    }
                    if(choice.equals("Y")) {
                        loop = false;
                        break;
                    }
                default:
                    System.out.println("選択が間違いました。もう一度お願いします！");
            }
        } while (loop);
        System.out.println("-----------退出-----------");
    }
}
