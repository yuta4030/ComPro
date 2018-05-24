package yuta4030.com.github.AtCoderBeginnerContest._097;
/*
https://beta.atcoder.jp/contests/abc097/tasks/arc097_a
 */

import java.util.*;

public class K_thSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int ans2 = sc.nextInt();
        Set<String> set = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            set.add(String.valueOf(str.charAt(i)));

            if (set.size() == 26) {
                break;
            }
        }

        List<String> list = new ArrayList<>(set);
        Collections.sort(list);

        Set<String> ans = new HashSet<>();
        int pos = 0;
        for (int i = 0; i < set.size(); i++) {
            while (true) {
                pos = str.indexOf(list.get(i), pos);
                if (pos == -1) {
                    break;
                }

                int count = 0;
                for (int k = pos; k < str.length(); k++) {
                    ans.add(str.substring(pos, k + 1));

                    if (count++ == 10) {
                        break;
                    }
                }
                pos++;
            }

            if (ans.size() > ans2) {
                break;
            }
        }

        list = new ArrayList<>(ans);
        Collections.sort(list);
        System.out.println(list.get(ans2 - 1));
    }

}
