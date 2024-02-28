package chapter06.lecture;

public class Calculator { // 사용자가 정의한 계산기 클래스

    // 덧셈 메서드
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // 뺄셈 메서드
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // 곱셈 메서드
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // 나눗셈 메서드
    public static double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new ArithmeticException("0으로 나눌 수 없음");
        }
    }

    // 거듭제곱 메서드
    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    // 제곱근 구하기 메서드
    public static double squareRoot(double num) {
        if (num >= 0) {
            return Math.sqrt(num);
        } else {
            throw new ArithmeticException("음수의 제곱근은 실수로 표현 불가");
        }
    }

    // 절댓값 구하기 메서드
    public static double absoluteValue(double num) {
        return num >= 0? num : -num;
    }
}
