package chapter05;

import java.util.Random;
import java.util.Scanner;

public class MonthCAI {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        
        String[] monthString = {
                "January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"
        };

        System.out.println("해당 월의 영어 단어를 입력하시오.");
        System.out.println("첫 글자는 대문자, 나머지는 소문자로 입력하세요.");
        
        int retry;
        int last = -1; // 이전 월

        do {
            int month; // 표시할 월 : 0~11의 난수

            do {
                month = rand.nextInt(12);
            } while(month == last);

            last = month;

            while(true) {
                System.out.print((month + 1) + "월:");
                String s = sc.next();

                if(s.equals(monthString[month])) break;
                System.out.println("틀렸습니다.");
            }

            System.out.println("정답입니다. 다시 한번? 1...Yes/0...No");
            retry = sc.nextInt();
        } while (retry == 1);
        
    }
}
