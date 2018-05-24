package yuta4030.com.github.AtCoderBeginnerContest._095;
/*
https://beta.atcoder.jp/contests/abc095/submissions/2531006
 */

import java.util.Scanner;

public class SomethingOnIt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.next());
        int price = 700;
        for (int i = 0; i < sb.length(); i++) {
            price += (sb.charAt(i) == 'o' ? 100 : 0);
        }
        System.out.println(price);
    }
}