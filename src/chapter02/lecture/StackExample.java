package chapter02.lecture;

public class StackExample {

    public static void main(String[] args) {
        int mainVariable = 10; // main 메서드의 지역 변수
        System.out.println("Main 메서드 시작");

        someMethod(); // 다른 메서드 호출

        System.out.println("Main 메서드 종료");
    }

    public static void someMethod() {
        int methodVariable = 20; // someMethod 메서드의 지역 변수
        System.out.println("SomeMethod 메서드 시작");

        anotherMethod(); // 또 다른 메서드 호출

        System.out.println("SomeMethod 메서드 종료");
    }

    public static void anotherMethod() {
        int anotherVariable = 30; // anotherMethod 메서드의 지역 변수
        System.out.println("AnotherMethod 메서드 시작");

        // 여기에 다른 작업을 추가할 수 있습니다.

        System.out.println("AnotherMethod 메서드 종료");
    }
}