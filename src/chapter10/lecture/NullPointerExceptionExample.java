package chapter10.lecture;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String data = null;
        System.out.println(data.toString()); // NullPointerException 발생

        System.out.println("프로그램 종료"); // 실행되지 않음
    }
}