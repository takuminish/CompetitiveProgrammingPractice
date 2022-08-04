package AtCoder.abc261.A;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // 整数を入力
        // 2000 <= y <= 3000
        int y = scanner.nextInt();

        // 入力されたyの余りを計算
        int remainder = y % 4;
        int answer = y;

        // あまりによって年数をプラス
        switch (remainder) {
            case 0:
                answer += 2;
                break;
            case 1:
                answer += 1;
                break;
            case 3:
                answer += 3;
                break;
        }
        System.out.println(answer);

    }
}