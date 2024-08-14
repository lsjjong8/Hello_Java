package chapter08.lecture;

// Java version 11 기준
public class A {
    A() {
        System.out.println("A 객체가 생성됨");
    }

    // 인스턴스 멤버 클래스 (non-static, Heap 영역에 종속)
    class B {
        B() {
            System.out.println("B 객체가 생성됨");
        }

        // 인스턴스 멤버
        int field1;
        void method1() {}

        // 정적 멤버
        // static int field2;
        // static void method2() {}
    }

    // 정적 멤버 클래스 (static, Method 영역에 종속)
    static class C {
        C() {
            System.out.println("C 객체가 생성됨");
        }

        // 인스턴스 멤버
        int field1;
        void method1() {}

        // 정적 멤버
        static int field2;
        static void method2() {}
    }

    // 로컬 클래스(메소드 내부, Stack 영역에 종속)
    void method() {
        class D {
            D() {
                System.out.println("D 객체가 생성됨");
            }

            // 인스턴스 멤버
            int field1;
            void method1() {}

            // 정적 멤버
            // static int field2;
            // static void method2() {}
        }

        D d = new D();
        d.field1 = 3;
        d.method1();
    }
}
