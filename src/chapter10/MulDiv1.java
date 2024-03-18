package chapter10;

import java.util.Scanner;

public class MulDiv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("x값:");
        int x = sc.nextInt();
        System.out.print("y값:");
        int y = sc.nextInt();

        System.out.println("x * y = " + (x * y)); // x에 "ABC"을 입력하면 런타임 오류 발생
        System.out.println("x / y = " + (x / y)); // y에 0을 입력하면 런타임 오류가 발생
    }
}
