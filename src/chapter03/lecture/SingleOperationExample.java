package chapter03.lecture;

public class SingleOperationExample {
    public static void main(String[] args) {
        int x = -100;
        int result1 = +x;
        int result2 = -x;
        System.out.println("result1=" + result1);
        System.out.println("result2=" + result2);

        byte b = 100;
        // byte result3 = -b;
        // 정수형의 부호 연산 결과는 int 타입으로 반환됨
        int result3 = -b;
        System.out.println("result3=" + result3);
    }
}
