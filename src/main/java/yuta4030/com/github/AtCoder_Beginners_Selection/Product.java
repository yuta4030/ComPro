package yuta4030.com.github.AtCoder_Beginners_Selection;

/*
 * 問題文
 * シカのAtCoDeerくんは二つの正整数a,b を見つけました。
 * a と b の積が偶数か奇数か判定してください。
 * <p>
 * 制約
 * 1 ≤ a, b ≤ 10000
 * a,b は整数
 * <p>
 * 入力
 * 入力は以下の形式で標準入力から与えられる。
 * a b
 * <p>
 * 出力
 * 積が奇数なら Odd と、 偶数なら Even と出力せよ。
 */

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(((a * b) % 2 == 0) ? "Even" : "Odd");
    }
}
