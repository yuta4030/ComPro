package yuta4030.com.github.AtCoder_Beginners_Selection;
/*
問題文
N 枚のカードがあります. i 枚目のカードには, a_i という数が書かれています.
Alice と Bob は, これらのカードを使ってゲームを行います.
ゲームでは, Alice と Bob が交互に 1 枚ずつカードを取っていきます. Alice が先にカードを取ります.
2 人がすべてのカードを取ったときゲームは終了し, 取ったカードの数の合計がその人の得点になります.
2 人とも自分の得点を最大化するように最適な戦略を取った時, Alice は Bob より何点多く取るか求めてください.

制約
N は 1 以上 100 以下の整数
ai (1≤i≤N) は1 以上100 以下の整数

入力
入力は以下の形式で標準入力から与えられる.
N
a_1 a_2 a_3 ... a_N

出力
両者が最適な戦略を取った時, Alice は Bob より何点多く取るかを出力してください.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CardGameforTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        Collections.sort(list, Collections.reverseOrder());
        int ans = 0;
        for (int i = 0; i < list.size(); i++) {
            ans += Math.pow(-1, (i % 2)) * list.get(i);
        }
        System.out.println(ans);
    }
}

