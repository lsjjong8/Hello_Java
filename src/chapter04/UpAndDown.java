package chapter04;

import java.util.Random;
import java.util.Scanner;

public class UpAndDown {
    public static void main(String[] args) {
        Random rand = new Random();

        Scanner sc = new Scanner(System.in);

        int targetNumber = 10 + rand.nextInt(90);  // 맞춰야 하는 숫자 : 10~99 난수 생성

        System.out.println("숫자 맞추기 게임 시작!");
        System.out.println("10부터 99사이의 숫자를 맞추세요.");

        int guessNumber;

        do {
            System.out.print("어떤 숫자일까?:");
            guessNumber = sc.nextInt();

            if(guessNumber > targetNumber)
                System.out.println("더 작은 숫자입니다.");
            else
                System.out.println("더 큰 숫자입니다.");

        } while (guessNumber != targetNumber);

        System.out.println("정답입니다.");
    }
}
