package chapter10;

import java.util.Scanner;

public class ThrowAndCatch {
    static void check(int sw) throws Exception {
        switch (sw) {
            case 1:
                // 검사 예외, 대처가 필수인 예외 (try문 또는 throws 절에 명시하지 않으면 컴파일 오류가 발생)
                throw new Exception("검사 예외 발생!!");
            case 2:
                // 비검사 예외, 대처가 필수는 아는 예외 (try문 또는 throws 절에 명시하지 않아도 컴파일 오류가 발생하지는 않음)
                throw new RuntimeException("비검사 예외 발생!!");
        }
    }

    static void test(int sw) throws Exception {
        check(sw); // 이 호출은 검사 예외 Exception이 발생할 가능성이 있다.
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("sw:");
        int sw = sc.nextInt();

        try {
            test(sw);
        } catch (RuntimeException e) { // e: 예외 RuntimeExcption와 그 하위 클래스를 포착
            System.out.println(e.getMessage());
        } catch (Exception e) { // e: 예외 Excption와 그 하위 클래스를 포착
            System.out.println(e.getMessage());
        }
    }
}
