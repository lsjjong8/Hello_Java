package chapter07.lecture;

public class InstanceofExample {
    public static void method1(Parent parent) {
        if(parent instanceof Child) {
            Child child = (Child) parent;
            System.out.println("method1 - Child로 변환 성공");
        } else {
            System.out.println("method1 - Child로 변환되지 않음");
        }
    }

    public static void method2(Parent parent) {
        Child child = (Child) parent; // ClassCastException이 발생할 가능성 있음
        System.out.println("method1 - Child로 변환 성공");
    }

    public static void main(String[] args) {
        Parent parentA = new Child();
        method1(parentA); // child 인스턴스를 매개값으로 전달, 변환 성공
        method2(parentA); // child 인스턴스를 매개값으로 전달, 변환 성공

        Parent parentB = new Parent();
        method1(parentB); // Parent 인스턴스를 매개값으로 전달, 변환 불가
        method2(parentB); // Parent 인스턴스를 매개값으로 전달, 예외 발생
    }
}