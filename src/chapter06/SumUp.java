package chapter06;

import java.util.Scanner;

public class SumUp {
    // 1부터 n까지의 합
    static int sumUp1(int n) {
        int sum = 0;
        for(int i=1; i <= n; i++)
            sum += i;
        return sum;
    }

    static int sumUp2(int n) {
        int sum = 0;
        while(n > 0)
            sum += n--;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1부터 x까지의 합을 구하자.");
        int x;
        do {
            System.out.print("x의 값:");
            x = sc.nextInt();
        } while (x <= 0);

        System.out.println("1부터 " + x + "까지의 합은 " + sumUp1(x) + "입니다.");
        System.out.println("1부터 " + x + "까지의 합은 " + sumUp2(x) + "입니다.");
    }
}
