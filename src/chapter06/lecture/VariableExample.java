package chapter06.lecture;

public class VariableExample {
    // 인스턴스 변수 (전역 변수)
    int globalVariable;

    // 클래스 변수 (static 변수)
    static int staticVariable;

    public void exampleMethod() {
        // 지역 변수
        int localVar = 42;

        // 전역 변수에 값 할당
        globalVariable = 100;

        // 클래스 변수에 값 할당
        staticVariable = 200;

        // 출력: 전역 변수, 클래스 변수, 지역 변수의 값 출력
        System.out.println("전역 변수: " + globalVariable);
        System.out.println("클래스 변수: " + staticVariable);
        System.out.println("지역 변수: " + localVar);
    }

    public static void main(String[] args) {
        // 클래스의 인스턴스 생성
        VariableExample instance = new VariableExample();

        // exampleMethod 호출
        instance.exampleMethod();

        // 출력: 전역 변수와 클래스 변수는 클래스의 인스턴스 없이도 접근 가능
        System.out.println("전역 변수 (클래스 인스턴스 없이 접근): " + instance.globalVariable);
        System.out.println("클래스 변수 (클래스 인스턴스 없이 접근): " + staticVariable);
    }
}
