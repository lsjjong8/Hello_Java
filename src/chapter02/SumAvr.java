package chapter02;

public class SumAvr {
    public static void main(String[] args) {
        // int형 : 정수형 변수
        // =(대입 연산자) : LeftValue에 RightValue를 대입함. 같다라는 의미가 아님
        int x;
        int y;

        x = 63;
        y = 18;

        // 컴파일 오류 발생
        /*x = 63.4;
        y = 18.3;*/

        System.out.println("x값은 " + x + "입니다.");
        System.out.println("y값은 " + y + "입니다.");
        System.out.println("합계는 " + (x+y) + "입니다.");
        System.out.println("평균은 " + (x+y)/2 + "입니다.");

        // 출력 비교
        System.out.println("x");
        System.out.println(x);

        // 선언과 동시에 정수 리터럴 대입
        /*int x = 63;
        int y = 18*/

        // 변수 동시에 선언
        /*int x, y;
        x = 63;
        y = 18;*/

        // 축약형
        // int x = 63, y = 18;
    }
}
