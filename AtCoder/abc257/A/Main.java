package AtCoder.abc257.A;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // A~Z
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // 入力値の取得
        Scanner sc = new Scanner(System.in);
        int[] a = new int[2];
        Arrays.setAll(a, i -> sc.nextInt());
        int n = a[0];
        int x = a[1];

        double answer1 = (double) x / n;
        double answer2 = Math.floor(answer1);

        int answer = (int) answer2;

        // 割り切れない → つぎのアルファベットに該当する
        if (answer1 - answer2 > 0) {
            answer++;

        }

        System.out.println(answer - 1);
    }

}