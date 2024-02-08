package chapter02;

import java.util.Scanner;

// 원의 넓이를 구해보자. PI * r * r
public class Circle {
    public static void main(String[] args) {
        // 변수 선언
        Scanner sc = new Scanner(System.in);

        double radius;

        final double PI; // final : 상수 선언, 1번만 대입 가능
        PI = Math.PI; // Math 클래스의 PI 상수 대입

        double area;

        // 키보드로 입력 받기
        System.out.print("반지름을 입력하세요 : ");
        radius = sc.nextDouble();
        
        // 넓이 계산
        area = PI * radius * radius;

        // 출력
        // 정밀도 확인을 위해 반지름 1을 입력해보자
        System.out.println("원의 넓이는 " + area +" 입니다."); // double형, 64bit, 정밀도 약 15자리
        System.out.println();

        System.out.printf("원의 넓이는 %f 입니다.\n", area); // 실수형 Format : 6자리가 default
        System.out.printf("원의 넓이는 %.15f 입니다.\n", area); // 소숫점 15자리까지 출력
        System.out.println();

        // 실수형은 부동소수점 형태로 저장
        // 부동소수점 : 지수부(10의 n승), 가수부(유효숫자)
        System.out.printf("원의 넓이는 %e 입니다.\n", area); // 지수형 Format 출력 : 6자리가 default
        System.out.printf("원의 넓이는 %.15e 입니다.\n", area); // 소숫점 15자리까지 출력
    }
}
