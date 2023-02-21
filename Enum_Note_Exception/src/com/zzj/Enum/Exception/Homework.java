package com.zzj.Enum.Exception;

public class Homework {
    public static void main(String[] args) {
        try {
            if(args.length != 2) {
                throw new ArrayIndexOutOfBoundsException("这个参数不对");
            }
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            double res = cal(n1, n2);
            System.out.println("结果为" + res);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("参数格式不对，需要输出整数");
        } catch (ArithmeticException e) {
            System.out.println("出现了除0的异常");
        }
    }
    public static double cal(int n1, int n2) {
        return n1 / n2;
    }
}
