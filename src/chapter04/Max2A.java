package chapter04;

import java.util.Scanner;

public class Max2A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("실수 a:");
        double a = sc.nextDouble();

        System.out.println("실수 b:");
        double b = sc.nextDouble();

        double max; // 큰 값을 저장

        if(a>b)
            max = a;
        else
            max = b;

        System.out.println("큰 쪽의 값은 " + max + "입니다.");
    }
}
