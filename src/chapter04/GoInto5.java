package chapter04;

import java.util.Scanner;

public class GoInto5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정숫값:");
        int n = sc.nextInt();

        if(n > 0)
            if(n % 5 == 0)
                System.out.println("이 값은 5로 나누어집니다.");
            else
                System.out.println("이 값은 5로 나누어지지 않습니다.");
        else
            System.out.println("음의 정숫값을 입력했습니다.");
    }
}
