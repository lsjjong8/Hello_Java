package chapter10.lecture;

public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        String data1 = "100";
        String data2 = "a100";

        int value1 = Integer.parseInt(data1);
        int value2 = Integer.parseInt(data2); // NumberFormatException 발생

        int result = value1 + value2;
        System.out.println(data1 + "+" + data2 + "=" + result);

        System.out.println("프로그램 종료"); // 실행되지 않음
    }
}