package chapter05;

public class PrintArrayVariable {
    public static void main(String[] args) {
        /*final */int[] a = new int[5];
        // final로 상수처럼 주소 값을 고정할 수 있음
        // 주소 값이 고정이지 내부 요소 값은 바뀔 수 있음

        System.out.println("a = " + a); // 객체를 구별하기 위한 해시 코드

        a = null;

        System.out.println("a = " + a);
    }
}
