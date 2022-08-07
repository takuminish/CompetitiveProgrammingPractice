package AtCoder.abc263.C;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int a[] = new int[2];

        Arrays.setAll(a, i -> scanner.nextInt());

        int n = a[0];
        int m = a[1];

        // N = 3, M = 5の場合、
        // 1 2 3 4 5から、数字を3つ選ぶ
        // そのため、1つ目は必然的に1〜3から選ばないと3つ選べない
        for (int i = 1; i <= m - n + 1; i++) {
            int b[] = new int[n];
            b[0] = i;
            solver(1, i + 1, n, m, b);
        }
    }

    static void solver(int c, int k, int n, int m, int[] d) {

        // 配列の要素数がnを超えた時点で出力開始。
        if (c >= n) {
            for (int j = 0; j < n; j++) {
                System.out.print(d[j] + " ");
            }
            System.out.println();
            return;
        }

        // N = 3, M = 5, C = 2、スタートが1のとき
        // 1 2 X
        // Xを3〜5でループし、出力するためのfor文
        for (int a = k; a <= m; a++) {
            d[c] = a;
            solver(c + 1, a + 1, n, m, d);
        }

        return;
    }
}