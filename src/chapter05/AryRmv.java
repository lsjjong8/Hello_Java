package chapter05;

import java.util.Scanner;

public class AryRmv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요소 수:");
        int num = sc.nextInt();
        int[] inputArray = new int[num];

        for (int i = 0; i < inputArray.length; i++) {
            System.out.print("a[" + i + "]");
            inputArray[i] = sc.nextInt();
        }

        System.out.print("삭제할 요소의 인덱스:");
        int idx = sc.nextInt();

        aryRmv(inputArray, idx);

        for (int i = 0; i < num; i++) {
            System.out.println("a[" + i + "] = " + inputArray[i]);
        }
    }

    static void aryRmv(int[] a, int idx) {
        if(idx >=0 && idx < a.length) {
            for (int i = idx; i < a.length-1 ; i++) {
                a[i] = a[i+1];
            }
        }
    }
}
