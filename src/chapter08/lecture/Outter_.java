package chapter08.lecture;

public class Outter_ {
    String field = "Outter-field";
    void method() {
        System.out.println("Outter-method");
    }

    class Nested {
        String field = "Nested-Field";
        void method() {
            System.out.println("Nested-method");
        }
        void print() {
            System.out.println(this.field);
            this.method();

            System.out.println(Outter_.this.field);
            Outter_.this.method();
        }
    }
}
