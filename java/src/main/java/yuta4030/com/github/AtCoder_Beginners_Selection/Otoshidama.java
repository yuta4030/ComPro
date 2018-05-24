package yuta4030.com.github.AtCoder_Beginners_Selection;
/*
問題文
日本でよく使われる紙幣は、
10000 円札、5000 円札、1000 円札です。以下、「お札」とはこれらのみを指します。
青橋くんが言うには、彼が祖父から受け取ったお年玉袋にはお札がN 枚入っていて、
合計でY 円だったそうですが、嘘かもしれません。
このような状況がありうるか判定し、ありうる場合はお年玉袋の中身の候補を一つ見つけてください。
なお、彼の祖父は十分裕福であり、お年玉袋は十分大きかったものとします。

制約
1≤N≤2000
1000≤Y≤2×10^7
N は整数である。
Y は1000 の倍数である。

入力
入力は以下の形式で標準入力から与えられる。
N Y

出力
N 枚のお札の合計金額がY 円となることがありえない場合は、-1 -1 -1 と出力せよ。

N 枚のお札の合計金額がY 円となることがありうる場合は、そのようなN 枚のお札の組み合わせの一例を
「10000 円札x枚、5000 円札y 枚、1000 円札z 枚」として、
x、y、z を空白で区切って出力せよ。複数の可能性が考えられるときは、そのうちどれを出力してもよい。

入力例 1
9 45000

出力例 1
4 0 5
お年玉袋に10000 円札4 枚と1000 円札5 枚が入っていれば、合計枚数が9 枚、合計金額が45000 円になります。
5000 円札9 枚という可能性も考えられるため、0 9 0 も正しい出力です。
 */


import java.util.Scanner;

public class Otoshidama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int money = sc.nextInt();

        for (int i = 0; i <= num; i++) {
            for (int j = 0; j <= num; j++) {
                for (int k = 0; k <= num; k++) {
                    if ((i + j + k) == num && (i * 10000 + j * 5000 + k * 1000) == money) {
                        System.out.println(i + " " + j + " " + k);
                        return;
                    }

                    if ((i + j + k) >= num || (i * 10000 + j * 5000 + k * 1000) >= money) {
                        break;
                    }
                }
            }
        }
        System.out.println("-1 -1 -1");
    }
}
