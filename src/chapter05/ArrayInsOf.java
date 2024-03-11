package chapter05;

import java.util.Scanner;

public class ArrayInsOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요소 수:");
        int num = sc.nextInt();
        int[] inputArray = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]:");
            inputArray[i] = sc.nextInt();
        }

        System.out.print("삽입할 인덱스:");
        int idx = sc.nextInt();

        System.out.print("삽입할 값:");
        int n = sc.nextInt();

        int[] outputArray = arrayInsOf(inputArray, idx, n);

        PrintArray.printIntArray(outputArray);
    }

    static int[] arrayInsOf(int[] array, int idx, int value) {
        if (idx < 0 || idx >= array.length) {
            return array.clone();
        } else {
            int[] newArray = new int[array.length+1];

            int i = 0;
            for (; i < idx; i++) {
                newArray[i] = array[i];
            }

            newArray[idx] = value;

            for (; i < array.length; i++) {
                newArray[i+1] = array[i];
            }

            return newArray;
        }
    }
}
