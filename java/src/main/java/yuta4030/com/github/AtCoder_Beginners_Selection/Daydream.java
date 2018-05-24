package yuta4030.com.github.AtCoder_Beginners_Selection;
/*
問題文
英小文字からなる文字列S が与えられます。
Tが空文字列である状態から始め、以下の操作を好きな回数繰り返すことで
S=T とすることができるか判定してください。

T の末尾に dream dreamer erase eraser のいずれかを追加する。
制約
1≦|S|≦10^5
S は英小文字からなる。

入力
入力は以下の形式で標準入力から与えられる。
S

出力
S=T とすることができる場合 YES を、そうでない場合 NO を出力せよ。


 */


import java.util.Scanner;

public class Daydream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer(sc.next());

        boolean flag;
        do {
            if (sb.length() == 0) {
                System.out.println("YES");
                return;
            }

            flag = false;
            int tmp = sb.indexOf("dreameraser");
            if (tmp != -1) {
                sb.delete(tmp, tmp + 11);
                flag = true;
                continue;
            }

            tmp = sb.indexOf("dreamerase");
            if (tmp != -1) {
                sb.delete(tmp, tmp + 10);
                flag = true;
                continue;
            }


            tmp = sb.indexOf("dreamer");
            if (tmp != -1) {
                sb.delete(tmp, tmp + 7);
                flag = true;
                continue;
            }

            tmp = sb.indexOf("eraser");
            if (tmp != -1) {
                sb.delete(tmp, tmp + 6);
                flag = true;
                continue;
            }

            tmp = sb.indexOf("dream");
            if (tmp != -1) {
                sb.delete(tmp, tmp + 5);
                flag = true;
                continue;
            }

            tmp = sb.indexOf("erase");
            if (tmp != -1) {
                sb.delete(tmp, tmp + 5);
                flag = true;
                continue;
            }
        } while (flag);

        System.out.println("NO");
    }
}
