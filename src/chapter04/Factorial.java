package chapter04;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("양의 정숫값:");
            n = sc.nextInt();
        } while (n <= 0);
        
        int factorial = 1;
        int i = 1;
        
        // factorial 계산
        /*while(i <= n) { // Bottom-UP
            factorial *= i; // factorial에 i 곱하기
            i++; // i 증가
        }

        System.out.println("1부터 " + n + "까지의 곱은 " + factorial + "입니다.");*/
        // System.out.println("1부터 " + n + "까지의 곱은 " + recursive(n) + "입니다.");
    }

    public static int recursive(int n) {  // Top-Down
        if(n == 1) {
            return 1;
        }

        return n * recursive(n-1);
    }
}
