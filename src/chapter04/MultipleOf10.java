package chapter04;

import java.util.Scanner;

// 읽은 정숫값이 양수이면 10의 배수인지 판정해서 표시
public class MultipleOf10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정숫값:");
        int n = sc.nextInt();
        
        // 입력한 정숫값이 10의 배수이면 "이 값은 10의 배수입니다." 라고 출력
        // 그렇지 않으면 "이 값은 10의 배수가 아닙니다." 라고 출력
        // 만약 음수를 읽은 경우 "음의 정숫값을 입력했습니다."라고 출력
        if(n > 0)
            if(n%10 == 0)
                System.out.println("이 값은 10의 배수입니다.");
            else
                System.out.println("이 값은 10의 배수가 아닙니다.");
        else
            System.out.println("음의 정숫값을 입력했습니다.");
    }
}
