package yuta4030.com.github.AtCoderTypicalContest001;
/*
https://atc001.contest.atcoder.jp/tasks/unionfind_a
 */

import java.util.Scanner;

public class UnionFindTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        UnionFind unionFind = new UnionFind(n);

        for (int i = 0; i < q; i++) {
            if (sc.nextInt() == 0) {
                unionFind.unite(sc.nextInt(), sc.nextInt());
            } else {
                System.out.println(unionFind.same(sc.nextInt(), sc.nextInt()) ? "Yes" : "No");
            }
        }
    }

    static class UnionFind {
        int[] parent;

        UnionFind(int N) {
            this.parent = new int[N];
            for (int i = 0; i < N; i++) {
                parent[i] = i;
            }
        }

        int root(int x) {
            if (parent[x] == x) {
                return x;
            } else {
                return parent[x] = root(parent[x]);
            }
        }

        void unite(int x, int y) {
            if (same(x, y)) {
                return;
            }
            int xroot = root(x);
            int yroot = root(y);
            parent[xroot] = yroot;
        }

        boolean same(int x, int y) {
            return (root(x) == root(y));
        }
    }
}
