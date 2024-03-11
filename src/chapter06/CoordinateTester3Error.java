package chapter06;

import java.util.Scanner;

public class CoordinateTester3Error {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("좌표는 몇 개:");
        int num = sc.nextInt();

        Coordinate[] a = new Coordinate[num];

        for (int i = 0; i < a.length; i++) {
            a[i] = new Coordinate();
        }

        for (int i = 0; i < a.length; i++) {
            a[i].set(5.5, 7.7);
        }

        for (int i = 0; i < a.length; i++) {
            System.out.printf("a[%d] = (%.1f, %.1f)\n", i, a[i].getX(), a[i].getY());
        }
    }
}
