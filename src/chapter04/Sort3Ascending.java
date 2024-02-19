package chapter04;

import java.util.Scanner;

public class Sort3Ascending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 a : ");
        int a = sc.nextInt(); // 3

        System.out.print("정수 b : ");
        int b = sc.nextInt(); // 2

        System.out.print("정수 c : ");
        int c = sc.nextInt(); // 1

        // 변수 a, b, c를 작은 순으로 정렬

        System.out.println("a <= b <= c가 되도록 정렬했습니다.");
        System.out.println("변수 a는 " + a + "입니다.");
        System.out.println("변수 b는 " + b + "입니다.");
        System.out.println("변수 b는 " + c + "입니다.");
    }
}
