package chapter05;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요소 수:");
        int num = sc.nextInt();

        int[] inputArray = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]:");
            inputArray[i] = sc.nextInt();
        }

        System.out.print("찾는 값:");
        int key = sc.nextInt();

        int idxTop = linearSearch(inputArray, key);
        int idxBtm = linearSearchR(inputArray, key);

        if(idxTop == -1)
            System.out.println("해당 값은 존재하지 않습니다.");
        else if(idxTop == idxBtm)
            System.out.println("해당 값은 x[" + idxTop + "에 있습니다.");
        else
            System.out.println("해당 값의 요소가 여러 개 존재합니다.");
            System.out.println("가장 앞에 위치한 값은 x[" + idxTop + "]에 있습니다.");
            System.out.println("가장 뒤에 위치한 값은 x[" + idxBtm + "]에 있습니다.");
    }

    static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] == key)
                return i;
        }
        return -1;
    }

    static int linearSearchR(int[] array, int key) {
        for (int i = array.length-1; i >=0 ; i--) {
            if(array[i] == key)
                return i;
        }
        return -1;
    }
}
