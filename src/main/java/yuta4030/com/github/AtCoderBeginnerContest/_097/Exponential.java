package yuta4030.com.github.AtCoderBeginnerContest._097;
/*
https://beta.atcoder.jp/contests/abc097/tasks/abc097_b
 */


import java.util.Scanner;

public class Exponential {
    public static void main(String[] args) {
        //99999は門番
        int[] check = {1, 4, 8, 9, 16, 25, 27, 32, 36, 49, 64, 81, 100, 121, 125, 128, 144, 169, 196, 216, 225, 243, 256, 289, 324, 343, 361, 400, 441, 484, 512, 529, 576, 625, 676, 729, 784, 841, 900, 961, 1000, 99999};

        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();

        for (int i = 0; i < check.length; i++) {
            if (max < check[i]) {
                System.out.println(check[i - 1]);
                return;
            }
        }
    }

}
