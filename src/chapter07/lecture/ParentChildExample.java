package chapter07.lecture;

public class ParentChildExample {
    public static void main(String[] args) {
        Child childClazz = new Child();

        Parent parentClazz = childClazz; // 자동 타입 변환

        parentClazz.method1();
        parentClazz.method2(); // 재정의된 메서드 호출
        //parent.method3(); // 호출 불가능
    }
}
