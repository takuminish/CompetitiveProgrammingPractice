package AtCoder.abc261.B;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        // 標準入力からの値受け取り
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        boolean isCorrect = true;

        String[][] a = inputMultiRowArrayString(scanner, n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // -○○○
                // ×-○○
                // ××-○
                // ×××-
                // ×の箇所は判定する必要がない
                if (i >= j) {
                    continue;
                }
                switch (a[i][j]) {
                    case "W":
                        if (!a[j][i].equals("L")) {
                            isCorrect = false;
                        }
                        break;
                    case "L":
                        if (!a[j][i].equals("W")) {
                            isCorrect = false;
                        }
                        break;
                    case "D":
                        if (!a[j][i].equals("D")) {
                            isCorrect = false;
                        }
                        break;
                }

                if (!isCorrect) {
                    break;
                }
            }
            if (!isCorrect) {
                break;
            }
        }

        if (isCorrect) {
            System.out.println("correct");
        } else {
            System.out.println("incorrect");
        }
    }

    /**
     * 
     * @param scanner
     * @param n       行数、列数
     * @return int[][] 複数行で入力された値を格納した2次元配列
     */
    static String[][] inputMultiRowArrayString(Scanner scanner, int n) {
        // 変数宣言
        String[] str = new String[1000];
        String[][] a = new String[n][n];

        // n
        // 1 2 3 4 5
        // 1 2 3 4 5
        // 1 2 3 4 5
        // 1 2 3 4 5
        // の形式で入力されるのを変数に入力
        for (int i = 0; i < n; i++) {
            str[i] = scanner.nextLine();
            String[] s = str[i].split("");
            for (int j = 0; j < n; j++) {
                a[i][j] = s[j];
            }
        }

        return a;
    }
}
