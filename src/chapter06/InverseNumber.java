package chapter06;

import java.util.Scanner;

public class InverseNumber {
    static Scanner sc = new Scanner(System.in);

    static int readPlusInt() {
        int input;
        do {
            System.out.print("양의 정수값:");
            input = sc.nextInt();
        } while(input <= 0);
        return input;
    }

    static boolean shouldRetry() {
        int input;
        do {
            System.out.print("다시 한 번? <Yes...1/No...0>:");
            input = sc.nextInt();
        } while(input!=1 && input!=0);
        return input == 1;
    }

    public static String printInverseNumber(int n) {
        StringBuilder result = new StringBuilder();

        while(n > 0) {
            String intString = Integer.toString(n%10);
            result.append(intString);
            n /= 10;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        boolean needRetry;
        do {
            int n = readPlusInt();

            System.out.print("반대로 읽으면 " + printInverseNumber(n) + "입니다.");

            needRetry = shouldRetry();

        } while(needRetry);
    }
}
