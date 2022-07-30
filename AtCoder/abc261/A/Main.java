package AtCoder.abc261.A;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 標準入力からの値受け取り
        Scanner scanner = new Scanner(System.in);

        int a[] = new int[4];
        Arrays.setAll(a, i -> scanner.nextInt());

        // 各値に設定
        int redStart = a[0];
        int redEnd = a[1];
        int blueStart = a[2];
        int blueEnd = a[3];

        // 重なっていない場合は0
        if (redEnd <= blueStart) {
            System.out.println(0);
            return;
        }
        if (blueEnd <= redStart) {
            System.out.println(0);
            return;
        }

        // 赤が青にすっぽり収まる場合
        if (blueStart <= redStart && redEnd <= blueEnd) {
            System.out.println(redEnd - redStart);
            return;
        }

        // 青が赤にすっぽり収まる場合
        if (redStart <= blueStart && blueEnd <= redEnd) {
            System.out.println(blueEnd - blueStart);
            return;
        }

        // 青の範囲に赤が重なっている場合
        if (blueStart <= redStart && redStart < blueEnd) {
            System.out.println(blueEnd - redStart);
            return;
        }

        // 赤の範囲に青が重なっている場合
        if (redStart <= blueStart && blueStart < redEnd) {
            System.out.println(redEnd - blueStart);
            return;
        }
    }
}
