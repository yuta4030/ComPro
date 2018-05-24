package yuta4030.com.github.AtCoder_Beginners_Selection;
/*
問題文
あなたは、
500 円玉を A 枚、100 円玉を B 枚、50 円玉を C 枚持っています。
これらの硬貨の中から何枚かを選び、
合計金額をちょうどX 円にする方法は何通りありますか。
同じ種類の硬貨どうしは区別できません。
2 通りの硬貨の選び方は、ある種類の硬貨についてその硬貨を選ぶ枚数が異なるとき区別されます。

制約
0≤A,B,C≤50
A+B+C≥1
50≤X≤20,000
A,B,C は整数である
X は 50 の倍数である

入力
入力は以下の形式で標準入力から与えられる。
A
B
C
X

出力
硬貨を選ぶ方法の個数を出力せよ。
 */


import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int coin500 = sc.nextInt();
        int coin100 = sc.nextInt();
        int coin50 = sc.nextInt();

        int sum = sc.nextInt();

        int count = 0;

        for (int i = 0; i <= coin500; i++) {
            for (int j = 0; j <= coin100; j++) {
                for (int k = 0; k <= coin50; k++) {
                    if (sum == (i * 500 + j * 100 + k * 50)) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
