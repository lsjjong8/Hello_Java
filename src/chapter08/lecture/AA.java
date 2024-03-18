package chapter08.lecture;

public class AA {
    // 인스턴스 필드
    B field1 = new B();
    C field2 = new C();

    // 인스턴스 메소드
    void method1() {
        B var1 = new B();
        C var2 = new C();
    }

    // 정적 필드 초기화
    // static B field3 = new B();
    static C field4 = new C();

    static void method2() {
        //B var1 = new B();
        C var2 = new C();
    }

    class B {}

    static class C{}
}
