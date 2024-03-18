package chapter10.lecture;

public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        int[] intArray = {1, 2};

        System.out.println("intArray[0]: " + intArray[0]);
        System.out.println("intArray[1]: " + intArray[1]);
        System.out.println("intArray[2]: " + intArray[2]); // ArrayIndexOutOfBoundsException 발생

        System.out.println("프로그램 종료"); // 실행되지 않음
    }
}