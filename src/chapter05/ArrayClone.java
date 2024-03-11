package chapter05;

import java.util.Scanner;

public class ArrayClone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요소 수:");
        int num = sc.nextInt();

        int[] inputArray = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]:");
            inputArray[i] = sc.nextInt();
        }

        int[] clonedArray = arrayClone(inputArray);

        System.out.print("복제된 배열 : ");
        PrintArray.printIntArray(clonedArray);
    }

    static int[] arrayClone(int[] array) {
        int[] newArray = new int[array.length];

        for(int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        return newArray;
    }
}
