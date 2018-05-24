package yuta4030.com.github.AtCoder_Beginners_Selection;
/*
問題文
すぬけ君は 1,2,3 の番号がついた
3 つのマスからなるマス目を持っています。
各マスには 0 か 1 が書かれており、
マス i には si が書かれています。
すぬけ君は 1 が書かれたマスにビー玉を置きます。
ビー玉が置かれるマスがいくつあるか求めてください。

制約
s1,s2,s3 は 1 あるいは 0

入力
入力は以下の形式で標準入力から与えられる。

s1s2s3

出力
答えを出力せよ。

 */

import java.util.Scanner;

public class PlacingMarbles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        for (char c : sc.nextLine().toCharArray()) {
            ans += Integer.parseInt(String.valueOf(c));
        }

        System.out.println(ans);
    }
}
