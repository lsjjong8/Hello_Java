package chapter06;

import java.util.Scanner;

public class MathMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("실수값:");
        double x = sc.nextDouble();

        // Math 클래스는 클래스 메서드와 클래스 변수만 제공하며
        // 인스턴스 메서드와 인스턴스 변수를 일절 제공하지 않음
        // Math class : 수치 계산 관련 메서드를 모은 것, 비슷한 부품을 모아둠
        // 비슷한 기능의 메서드나 상수를 모아서 캡슐화 (유틸리티 클래스)
        // <-> 데이터와 데이터 처리를 위한 로직을 캡슐화(객체)
        System.out.println("절대값:" + Math.abs(x));
        System.out.println("제곱근:" + Math.sqrt(x));
        System.out.println("면적:" + Math.PI * x * x);
    }
}
