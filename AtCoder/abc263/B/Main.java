package AtCoder.abc263.B;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int a[] = new int[n - 1];

        Arrays.setAll(a, i -> scanner.nextInt());

        int count = 0;

        while (n != 1) {
            n = a[n - 2];
            count++;
        }

        System.out.println(count);

    }
}