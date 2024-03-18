package chapter10.lecture;

public class ThrowsExample {
    public static void main(String[] args) /*throws ClassNotFoundException*/ {
        try {
            findClass();
        } catch (ClassNotFoundException e) {
            System.out.println("클래스가 존재하지 않습니다.");
        }

        // findClass();
    }

    public static void findClass() throws ClassNotFoundException {
        Class clazz = Class.forName("java.lang.String2");
    }
}
