package AtCoder.abc258.A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 0;
        a = scanner.nextInt();

        int h = a / 60;
        int m = a % 60;

        int ansH = 21 + h;

        System.out.println(String.format("%02d", ansH) + ":" + String.format("%02d", m));

    }

}