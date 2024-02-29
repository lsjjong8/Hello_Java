package chapter07.lecture;

public class ClazzB {
    public void method() {
        A a = new A(); // 접근 가능
        a.field = "value";
        a.method();
    }
}