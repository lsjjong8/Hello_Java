package chapter02;

public class VarSwap {
    public static void main(String[] args) {
        // 변수 선언
        int a = 5;
        int b = 10;

        // a와 b의 값을 바꿔보기
        // 힌트 : 물 컵과 주스 컵를 바꾸려면?
        int temp;
        temp = a;
        a = b;
        b = temp;

        // 출력
        System.out.println("a값은 " + a);
        System.out.println("b값은 " + b);
    }
}
