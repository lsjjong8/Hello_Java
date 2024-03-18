package chapter10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MulDiv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("x값:");
        int x = sc.nextInt();
        System.out.print("y값:");
        int y = sc.nextInt();

        try {
            System.out.println("x * y = " + (x * y)); // x에 "ABC"을 입력하면 런타임 오류 발생
            System.out.println("x / y = " + (x / y)); // y에 0을 입력하면 런타임 오류가 발생
        } catch (InputMismatchException e) {
            System.out.println("입력 오류 발생." + e);
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("산술 오류 발생." + e);
            e.printStackTrace();
        } finally {
            System.out.println("프로그램을 종료합니다.");
        }
    }
}