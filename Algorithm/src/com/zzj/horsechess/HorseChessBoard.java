package com.zzj.horsechess;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

/*
* 马踏棋盘
* 1 创建二维数组
* 2 将当前位置设置为已访问，然后根据当前位置，计算马儿还能走哪些位置，并放入数组
* 遍历数组，看哪个还能走，如果可以走就走一步
* 走不通就回溯
* 判断马儿是否完成了任务，使用step和应该走的步数比较，如果没有达到数量，则表示没有完成，将棋盘归零
 */
public class HorseChessBoard {
    private static int X = 6;//col
    private static int Y = 6;//row
    private static int[][] chessBoard= new int[Y][X];
    private static boolean[] visited = new boolean[X*Y];//记录某个位置是否走过
    private  static boolean finished = false;
    public static void main(String[] args) {

        int row = 5;
        int col = 5;
        //test
        long start = System.currentTimeMillis();
        traversalChessBoard(chessBoard, row-1, col-1, 1);
        long end = System.currentTimeMillis();
        System.out.println("遍历耗时 = " + (end-start));

        //输出当前棋盘的状况
        for (int[] rows : chessBoard) {
            for (int step : rows) { //step表示该位置是马儿应该走的第几步
                System.out.print(step + "  ");
            }
            System.out.println();
        }
    }
    //编写最核心的算法，遍历棋盘，如果遍历成功，就把finished设置为true
    //并且，将马儿走的每一步记录到chessBoard
    public static void traversalChessBoard(int[][] chessBoard, int row, int col, int step) {
        chessBoard[row][col] = step;
        visited[row * X + col] = true;
        //获取当前位置可以走哪些位置
        ArrayList<Point> points = next(new Point(col, row));
        while (!points.isEmpty()) {
            Point p = points.remove(0);
            //判断该位置是否走过，如果没有走过，我们就递归遍历
            if (!visited[p.y * X + p.x]) {
                //如果没走过的话，就递归遍历
                traversalChessBoard(chessBoard, p.y, p.x, step + 1);
            }
        }
        //当退出while，看是否遍历成功，如果没有成功就重置相应的值，然后进行回溯
        if(step < X*Y && !finished) {
            //重置
            chessBoard[row][col] = 0;
            visited[row*X + col] = false;
        } else {
            finished = true;
        }
    }


    //编写方法，可以获取当前位置，和可以走的下一步的所有位置
    public static ArrayList<Point> next(Point curPoint) {
        ArrayList<Point> points = new ArrayList<>();
        Point p1 = new Point();
        //判断下一步可以走的所有位置
        //从左上开始顺时针找下一个位置
        if ((p1.x = curPoint.x-2) >= 0 && (p1.y = curPoint.y-1) >= 0) {
            points.add(new Point(p1));//这里一定要new一个p
        }
        if ((p1.x = curPoint.x-1) >= 0 && (p1.y = curPoint.y-2) >= 0) {
            points.add(new Point(p1));
        }
        if ((p1.x = curPoint.x+1) < X && (p1.y = curPoint.y-2) >= 0) {
            points.add(new Point(p1));
        }
        if ((p1.x = curPoint.x+2) < X && (p1.y = curPoint.y-1) >= 0) {
            points.add(new Point(p1));
        }
        if ((p1.x = curPoint.x+2) < X && (p1.y = curPoint.y+1) < Y) {
            points.add(new Point(p1));
        }
        if ((p1.x = curPoint.x+1) >= 0 && (p1.y = curPoint.y+2) < Y) {
            points.add(new Point(p1));
        }
        if ((p1.x = curPoint.x-1) >= 0 && (p1.y = curPoint.y+2) < Y) {
            points.add(new Point(p1));
        }
        if ((p1.x = curPoint.x-2) >= 0 && (p1.y = curPoint.y+1) < Y) {
            points.add(new Point(p1));
        }
        return points;
    }
}
