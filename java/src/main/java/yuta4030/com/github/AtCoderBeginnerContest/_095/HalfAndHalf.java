package yuta4030.com.github.AtCoderBeginnerContest._095;
/*
https://beta.atcoder.jp/contests/abc095/tasks/arc096_a
 */

import java.util.Scanner;

public class HalfAndHalf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ab = sc.nextInt();

        int x = sc.nextInt();
        int y = sc.nextInt();

        int min = (x < y ? x : y);

        int buyA = 0;
        int buyB = 0;
        int buyAB = 0;


        if (a + b > ab * 2) {
            buyAB += min * 2;
            x -= min;
            y -= min;
        }

        if (a > ab * 2) {
            buyAB += x * 2;
        } else {
            buyA += x;
        }

        if (b > ab * 2) {
            buyAB += y * 2;
        } else {
            buyB += y;
        }

        System.out.println(buyA * a + buyB * b + buyAB * ab);
    }
}