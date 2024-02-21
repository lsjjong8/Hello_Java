package chapter04;

import java.util.Scanner;

public class ThreeDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x; // 읽는 값

        do {
            System.out.print("세 자리의 정숫값:");
            x = sc.nextInt();
        } while(x < 100 || x > 999);
        // 드모르간의 법칙 : !(x >= 100 && x <== 999)

        System.out.println("입력한 값은 " + x + "입니다.");
    }
}
