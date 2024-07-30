package chapter06.lecture;

class Scope {
    // 클래스 변수
    public static int staticVariable;

    // 인스턴스 변수
    public int instanceVariable;

    // 정적 메소드
    public static void doStaticMethod() {
        // globalVariable = 100; // 에러
        staticVariable = 200; // 클래스 변수
        int localVariable = 300; // 지역 변수

        // 출력
        // System.out.println("인스턴스 변수: " + globalVariable);
        System.out.println("클래스 변수: " + staticVariable);
        System.out.println("지역 변수:" + localVariable);
    }

    // 인스턴스 메소드
    public void doMethod() {
        instanceVariable = 100; // 인스턴스 변수
        staticVariable = 200; // 클래스 변수
        int localVariable = 300; // 지역 변수

        // 출력
        System.out.println("인스턴스 변수: " + instanceVariable);
        System.out.println("클래스 변수: " + staticVariable);
        System.out.println("지역 변수:" + localVariable);
    }
}

public class VariableExample {
    public static void main(String[] args) {
        System.out.println("클래스 변수 (인스턴스 없이 접근 가능): " + Scope.staticVariable);
        Scope.doStaticMethod();

        // 인스턴스 생성
        Scope instance = new Scope();

        instance.doMethod();

        System.out.println("인스턴스 변수 (접근하려면 인스턴스 필요): " + instance.instanceVariable);
    }
}