package yuta4030.com.github.AtCoderBeginnerContest._097;

/*
https://beta.atcoder.jp/contests/abc097/tasks/abc097_a
 */

import java.util.Scanner;

public class ColorfulTransceivers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if (Math.abs(a - c) <= d || (Math.abs(a - b) <= d && Math.abs(b - c) <= d)) {
            System.out.println("Yes");

        } else {
            System.out.println("No");
        }
    }

}
