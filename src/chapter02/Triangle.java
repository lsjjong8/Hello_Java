package chapter02;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("밑변을 입력하세요 : ");
        double width = sc.nextDouble();

        System.out.print("높이를 입력하세요 : ");
        double height = sc.nextDouble();

        // 넓이를 구해서 표시
        System.out.println("넓이는 " + (width * height / 2) + "입니다.");
    }
}
