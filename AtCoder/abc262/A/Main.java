package AtCoder.abc262.A;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // 整数を入力
        // 2000 <= y <= 3000
        int y = scanner.nextInt();

        // 入力されたyの余りを計算
        int remainder = y % 4;

        System.out.println(y + ((10 - remainder) % 4));

    }
}