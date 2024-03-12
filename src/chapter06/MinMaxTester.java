package chapter06;

import java.util.Scanner;

public class MinMaxTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("x값:");
        int x = sc.nextInt();
        System.out.print("y값:");
        int y = sc.nextInt();
        System.out.print("z값:");
        int z = sc.nextInt();

        System.out.print("배열a의 요소 수:");
        int num = sc.nextInt();
        int[] a = new int[num]; // 요소 수가 num인 배열

        for (int i = 0; i < num; i++) {
            System.out.print("a[" + i + "]:");
            a[i] = sc.nextInt();
        }

        System.out.printf("x, y 의 최소값은 %d입니다.\n", MinMax.min(x, y));
        System.out.printf("x, y 의 최대값은 %d입니다.\n", MinMax.max(x, y));
        System.out.printf("x, y, z 의 최소값은 %d입니다.\n", MinMax.min(x, y, z));
        System.out.printf("x, y, z 의 최대값은 %d입니다.\n", MinMax.max(x, y, z));
        System.out.printf("배열 a의 최소값은 %d입니다.\n", MinMax.min(a));
        System.out.printf("배열 a의 최대값은 %d입니다.\n", MinMax.max(a));
    }
}
