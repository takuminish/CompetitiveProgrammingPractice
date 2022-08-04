package AtCoder.abc262.B;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // 整数を入力 N M
        int a[] = new int[2];
        Arrays.setAll(a, i -> scanner.nextInt());
        int n = a[0];
        int m = a[1];

        scanner.nextLine();

        // 辺を入力
        int b[][] = inputMultiRowArrayInt(scanner, m);

        boolean c[][] = new boolean[n][n];

        // c[i][j] = true → 頂点iと頂点jが辺で結ばれている
        for (int i = 0; i < m; i++) {
            c[b[i][0] - 1][b[i][1] - 1] = true;
            c[b[i][1] - 1][b[i][0] - 1] = true;
        }

        int answer = 0;

        // 総当たり
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (c[i][j] && c[j][k] && c[k][i]) {
                        answer++;
                    }
                }
            }
        }

        System.out.println(answer);

    }

    /**
     * 
     * @param scanner
     * @param n       行数、列数
     * @return int[][] 複数行で入力された値を格納した2次元配列
     */
    static int[][] inputMultiRowArrayInt(Scanner scanner, int m) {
        // 変数宣言
        String[] str = new String[10000];
        int[][] a = new int[m][2];

        // 1 2
        // 1 2
        // 1 2
        // 1 2
        // の形式で入力されるのを変数に入力
        for (int i = 0; i < m; i++) {
            str[i] = scanner.nextLine();
            String[] s = str[i].split(" ");
            for (int j = 0; j < 2; j++) {
                a[i][j] = Integer.parseInt(s[j]);
            }
        }

        return a;
    }
}
