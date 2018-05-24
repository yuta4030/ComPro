package yuta4030.com.github.AtCoderBeginnerContest._096;
/*
https://beta.atcoder.jp/contests/abc096/tasks/abc096_c
 */


import java.util.Scanner;

public class GridRepainting2 {
    private static int h;
    private static int w;
    private static String c[][];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        h = sc.nextInt();
        w = sc.nextInt();
        c = new String[h][w];

        for (int i = 0; i < h; i++) {
            String str = sc.next();
            for (int j = 0; j < w; j++) {
                c[i][j] = str.substring(j, j + 1);
            }
        }

        DepthFirstSearch dfs = new DepthFirstSearch(h, w, c);

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (c[i][j].equals("#")) {
                    if (!dfs.search(i, j)) {
                        System.out.println("No");
                        return;
                    }

                }
            }
        }

        System.out.println("Yes");
    }


    static class DepthFirstSearch {
        int h;
        int w;
        String[][] c;

        DepthFirstSearch(int h, int w, String[][] c) {
            this.h = h;
            this.w = w;
            this.c = c;
        }

        boolean search(int x, int y) {
            if (check(x + 1, y)) {
                return true;
            }
            if (check(x - 1, y)) {
                return true;
            }
            if (check(x, y + 1)) {
                return true;
            }
            if (check(x, y - 1)) {
                return true;
            }
            return false;
        }

        boolean check(int x, int y) {
            if (x < 0 || h <= x || y < 0 || w <= y || c[x][y].equals(".")) {
                return false;
            }
            return c[x][y].equals("#");

        }
    }

}
