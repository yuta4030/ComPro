package yuta4030.com.github.AtCoder_Beginners_Selection;
/*
問題文
シカのAtCoDeerくんは二次元平面上で旅行をしようとしています。
AtCoDeerくんの旅行プランでは、時刻 0 に 点(0,0) を出発し、1 以上N 以下の各i に対し、
時刻ti に 点(x_i,y_i) を訪れる予定です。AtCoDeerくんが時刻t に 点(x,y) にいる時、
時刻t+1 には 点(x+1,y),(x−1,y),(xy+1),(x,y−1) のうちいずれかに存在することができます。
その場にとどまることは出来ないことに注意してください。
AtCoDeerくんの旅行プランが実行可能かどうか判定してください。

制約
1 ≤ N ≤ 10^5
0 ≤ x_i ≤ 10^5
0 ≤ y_i ≤ 10^5
1 ≤ t_i ≤ 10^5
ti < t_i+1 (1 ≤ i ≤ N−1)
入力は全て整数

入力
入力は以下の形式で標準入力から与えられる。

N
t_1 x_1 y_1
t_2 x_2 y_2
:
t_N x_N y_N

出力
旅行プランが実行可能ならYesを、不可能ならNoを出力してください。
 */


import java.util.Scanner;

public class Traveling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int t = 0;
        int x = 0;
        int y = 0;

        for (int i = 0; i < N; i++) {

            int ti = sc.nextInt();
            int xi = sc.nextInt();
            int yi = sc.nextInt();

            int distance = Math.abs(xi - x) + Math.abs(yi - y);
            int time = ti - t;

            if ((time < distance) || ((time - distance) % 2 != 0)) {
                System.out.println("No");
                return;
            }

            t = ti;
            x = xi;
            y = yi;
        }
        System.out.println("Yes");
    }
}