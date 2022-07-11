package AtCoder.abc256.A;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long answer = (long) Math.pow(2, n);

        System.out.println(answer);
    }

}