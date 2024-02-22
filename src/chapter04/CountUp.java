package chapter04;

import java.util.Scanner;

public class CountUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("카운트업 합니다.");
        int x;

        do {
            System.out.print("양의 정수값:");
            x = sc.nextInt();
        } while (x <= 0);

        for (int i=0; i<= x; i++) {
            System.out.println(i);
        }
    }
}
