package yuta4030.com.github.AtCoderTypicalContest001;
/*
https://atc001.contest.atcoder.jp/tasks/dfs_a
 */


import java.util.Scanner;

public class DepthFirstSearchTest {
    private static int h;
    private static int w;
    private static String c[][];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        h = sc.nextInt();
        w = sc.nextInt();
        c = new String[h][w];

        int startH = -1;
        int startW = -1;
        int goalH = -1;
        int goalW = -1;

        for (int i = 0; i < h; i++) {
            String str = sc.next();
            for (int j = 0; j < w; j++) {
                c[i][j] = str.substring(j, j + 1);
                if (c[i][j].equals("s")) {
                    startH = i;
                    startW = j;
                }
                if (c[i][j].equals("g")) {
                    goalH = i;
                    goalW = j;
                }
            }
        }

        DepthFirstSearch dfs = new DepthFirstSearch(h, w, c);
        dfs.search(startH, startW);

        if (dfs.isReach(goalH, goalW)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }


    static class DepthFirstSearch {
        int h;
        int w;
        boolean[][] reached;
        String[][] c;

        DepthFirstSearch(int h, int w, String[][] c) {
            this.h = h;
            this.w = w;
            this.c = c;
            reached = new boolean[h][w];
        }

        void search(int x, int y) {
            if (x < 0 || h <= x || y < 0 || w <= y || c[x][y].equals("#")) {
                return;
            }
            if (reached[x][y]) {
                return;
            }

            reached[x][y] = true;

            search(x + 1, y);
            search(x - 1, y);
            search(x, y + 1);
            search(x, y - 1);
        }

        boolean isReach(int h, int w) {
            return reached[h][w];
        }

    }
}

