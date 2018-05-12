package yuta4030.com.github.AtCoder_Beginners_Selection;
/*
問題文
黒板に N 個の正の整数 A1,...,AN が書かれています．
すぬけ君は，黒板に書かれている整数がすべて偶数であるとき，
次の操作を行うことができます．
黒板に書かれている整数すべてを，2 で割ったものに置き換える．
すぬけ君は最大で何回操作を行うことができるかを求めてください．

制約
1≤N≤200
1≤Ai≤10^9

入力
入力は以下の形式で標準入力から与えられる。
NA1 A2 ... AN

出力
すぬけ君は最大で何回操作を行うことができるかを出力せよ．

入力
例 1
3
8 12 40
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShiftOnly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();


        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            list.add(sc.nextInt());
        }

        int count = 0;
        while (true) {
            for (int i = 0; i < list.size(); i++) {
                int num = list.get(i);

                if (num % 2 != 0) {
                    System.out.println(count);
                    return;
                }

                list.set(i, num / 2);
            }
            count++;
        }
    }
}
