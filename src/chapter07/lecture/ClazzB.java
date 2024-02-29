package chapter07.lecture;

public class ClazzB {
    public void method() {
        ClazzA a = new ClazzA(); // 접근 가능
        a.field = "value";
        a.method();
    }
}