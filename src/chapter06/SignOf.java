package chapter06;

import java.util.Scanner;

public class SignOf {
    static char signOf(int n) {
        char sign = '0';

        if(n>0)
            sign = '+';
        else if (n<0) {
            sign = '-';
        }

        return sign;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 x:");
        int x = sc.nextInt();

        char sign = signOf(x);
        System.out.println("signOf(x)는 " + sign + "입니다.");
    }
}
