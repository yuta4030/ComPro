package yuta4030.com.github.AtCoderBeginnerContest._096;
/*
https://beta.atcoder.jp/contests/abc096/tasks
 */


import java.util.Scanner;

public class DayOfTakahashi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a > b ? a - 1 : a);
    }
}