package yuta4030.com.github.AtCoderGrandContest._024;
/*
https://agc024.contest.atcoder.jp/tasks/agc024_a
 */

import java.util.Scanner;

public class Fairness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        long k = sc.nextLong();

        System.out.println((k % 2 == 0 ? (a - b) : (b - a)));
    }
}