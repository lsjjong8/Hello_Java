package chapter03;

import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("num1(피제수)을 입력하세요 : ");
        int num1 = sc.nextInt();

        System.out.print("num2(제수)을 입력하세요 : ");
        int num2 = sc.nextInt();

        boolean isMultiple = (num1 % num2 == 0);

        String result = isMultiple? "num1는 num2의 배수임":"num1은 num2의 배수가 아님";

        System.out.println(result);
    }
}
