package chapter05;

import java.util.Scanner;

public class AryIns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요소 수:");
        int num = sc.nextInt();
        int[] inputArray = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("a[" + i + "]:");
            inputArray[i] = sc.nextInt();
        }

        System.out.print("삽입할 요소의 인덱스:");
        int idx = sc.nextInt();

        System.out.print("삽입할 값:");
        int value = sc.nextInt();

        aryIns(inputArray, idx, value); // a[idx]에 n을 삽입

        PrintArray.printIntArray(inputArray);
    }

    static void aryIns(int[] a, int idx, int value) {
        if (idx >= 0 && idx < a.length) {
            for (int i = a.length - 1; i > idx; i--) {
                a[i] = a[i-1];
            }
            a[idx] = value;
        }
    }
}
