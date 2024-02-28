package chapter06.lecture;

import java.util.Scanner;

public class InitializationExample {
    // 정적 변수
    private static int staticVariable = 10; // 1. 0으로 정적 필드 초기화 이후 대입됨

    // 정적 초기화 블록
    static {
        System.out.println("정적 초기화 블록"); // 2. 정적 초기화 블록 수행
        staticVariable = 100;
    }

    // 인스턴스 변수
    private int instanceVariable = 1; // 5. 0으로 인스턴스 필드 초기화 이후 대입됨

    // 인스턴스 초기화 블록
    {
        System.out.println("인스턴스 초기화 블록");  // 6. 인스턴스 초기화 블록 수행
        instanceVariable = 42;
    }

    // 생성자
    public InitializationExample() {
        System.out.println("생성자"); // 7. 생성자 수행
    }

    public static void main(String[] args) {
        new Scanner(System.in).nextLine(); // 메인 메서드 수행 시작 지점에서 입력 받기

        System.out.println(InitializationExample.staticVariable);

        System.out.println("메인 메서드"); // 3. 메인메서드 수행

        // 객체 생성
        InitializationExample obj = new InitializationExample(); // 4. 생성자 호출

        System.out.println(obj.instanceVariable);
    }
}