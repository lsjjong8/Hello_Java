package chapter05;

import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요소 수:");
        int n = sc.nextInt(); // 요소 수 입력
        int[] a = new int[n]; // 배열 생성

        // 배열 요소 입력 받기
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        System.out.print("a = {");
        if(n >= 2) {
            for (int i = 0; i < n - 1; i++) {
                System.out.print(a[i] + ", ");
            }
        }

        if(n >= 1) {
            System.out.print(a[n-1]);
        }
        System.out.print("}");
    }
}
