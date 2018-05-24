package yuta4030.com.github.AtCoder_Beginners_Selection;
/*
問題文
1 以上 N 以下の整数のうち、10 進法での各桁の和が
A 以上 B 以下であるものの総和を求めてください。

制約
1≤N≤10^4
1≤A≤B≤36
入力はすべて整数である

入力
入力は以下の形式で標準入力から与えられる。
N A B

出力
1 以上N 以下の整数のうち、10 進法での各桁の和が
A 以上B 以下であるものの総和を出力せよ。
 */

import java.util.Scanner;

public class SomeSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int ans = 0;
        for (int i = 1; i <= n; i++) {
            char[] array = String.valueOf(i).toCharArray();

            int sum = 0;
            for (char c : array) {
                sum += Integer.parseInt(String.valueOf(c));
            }

            if (a <= sum && sum <= b) {
                ans += i;
            }
        }

        System.out.println(ans);
    }
}
