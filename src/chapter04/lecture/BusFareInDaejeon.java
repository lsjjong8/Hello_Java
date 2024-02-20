package chapter04.lecture;

import java.util.Scanner;

public class BusFareInDaejeon {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("만 나이 입력: ");
        int age = sc.nextInt();

        if(age < 0){
            System.out.println("나이를 잘못 입력하셨습니다.");
        } else if(age >= 19) {
            System.out.println("버스요금 : 1500원");
        } else if(age >= 13) { // 더 간결하게 바꿔보자
            System.out.println("버스요금 : 750원");
        } else if(age >= 6) {
            System.out.println("버스요금 : 350원");
        } else {
            System.out.println("버스요금 : 무료");
        }
    }
}