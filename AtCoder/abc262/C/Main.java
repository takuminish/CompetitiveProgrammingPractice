package AtCoder.abc262.C;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // 整数を入力 N
        int n = Integer.parseInt(scanner.nextLine());

        // 配列aの入力
        int a[] = new int[n];
        Arrays.setAll(a, i -> scanner.nextInt());

        int answer = 0;

        // ミスしたポイント!!
        // 桁あふれを考慮できていなかった!!
        long same = 0;

        for (int i = 0; i < n; i++) {
            if ((i + 1) == a[i]) {
                same++;
                continue;
            }

            if ((i + 1) == a[a[i] - 1] && (i + 1) <= a[i]) {
                answer++;
            }

        }
        System.out.println(answer + ((same * (same - 1)) / 2));
    }

}
