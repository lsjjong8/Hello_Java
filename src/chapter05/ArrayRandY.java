package chapter05;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class ArrayRandY {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int n; // 요소 수

        do {
            System.out.print("요소 수: ");
            n = sc.nextInt();
        } while(n > 10); // 요소 수는 10 이하만 입력 받기

        int[] a = new int[n];

        // 1 ~ 10 까지의 난수 발생, 중복된 수가 발생하지 않게끔 난수 저장
        // 1. 여태 뽑은 수와 지금 뽑은 수 비교
        // 2. 지금 뽑은 수가 중복이면 다시 뽑음
        // 3. 해당 로직을 index 0 부터 n-1까지 수행하여 배열에 저장
        for (int i = 0; i < n; i++) {
            a[i] = 1 + rand.nextInt(10);
            for (int j = 0; j < i; j++) {
                if(a[i] == a[j]) { // 중복이 발생한 경우
                    i--;
                    break;
                }
            }
        }

        PrintArray.printIntArray(a);
    }
}
