package chapter04;

import java.util.Scanner;

public class CountDown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("카운트다운 합니다.");

        int x;
        do{
            System.out.print("양의 정수값:");
            x = sc.nextInt();
        } while(x <= 0); // do-while문을 while문으로 변경해보자
        // do문 종료시 x는 양의 정수

        // while문
        while(x >= 0) {
            // --x로 변경해보자
            System.out.println(x--); // x 값을 표시한 후 감소시킴
            System.out.println("x의 값이 " + x + "이 됐습니다."); // x값 표시
        }
    }
}
