package AtCoder.abc263.A;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!

        Scanner scanner = new Scanner(System.in);

        int a[] = new int[5];
        int b[] = new int[13];

        Arrays.setAll(a, i -> scanner.nextInt());

        for (int i = 0; i < 5; i++) {
            b[a[i] - 1]++;
        }

        boolean f1 = false;
        boolean f2 = false;
        for (int i = 0; i < 13; i++) {
            if (b[i] == 2) {
                f1 = true;
            }
            if (b[i] == 3) {
                f2 = true;
            }
        }

        if (f1 && f2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}