package AtCoder.abc259.A;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a[] = new int[5];
        Arrays.setAll(a, i -> scanner.nextInt());

        // N M X T D
        int n = a[0];
        int m = a[1];
        int x = a[2];
        int t = a[3];
        int d = a[4];

        int answer = 0;
        if (x <= m) {
            answer = t;
        } else {
            answer = t - ((x - m) * d);
        }

        System.out.println(answer);

    }

}