package chapter02.lecture;

public class IntegerExample {
    public static void main(String[] args) {
        byte a = 10;                        // byte형 변수 a
        // a = 128;                         // 컴파일 오류
        System.out.println(a);              // 변수 a 출력

        short b = 50;                       // short형 변수 b
        // b = -32769;                      // 컴파일 오류
        System.out.println(b);              // 변수 b 출력

        int c = -10;                        // short형 변수 c
        // c = 2_147_483_648;               // 컴파일 오류
        System.out.println(c);              // 변수 c 출력
 
        long d = -50;                       // short형 변수 d
        // d = -9_223_372_036_854_775_809l;  // 컴파일 오류
        System.out.println(d);              // 변수 d 출력
    }
}
