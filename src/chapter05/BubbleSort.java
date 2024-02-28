package chapter05;

public class BubbleSort {
    public static void main(String[] args) {
        int[] intArray = {5, 3, 2, 8, 7};

        bubbleSort(intArray);

        printArray(intArray);
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++)
            for (int j = 0; j < arr.length- 1- i; j++)
                if(arr[j] > arr[j+1])
                    swap(arr, j, j+1);
    }

    // int a, int b로만 구현 불가(값 복사만 되기 때문)
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArray(int[] arr) {
        int length = arr.length;

        System.out.print("{");
        if(length >= 2) {
            for (int i = 0; i < length - 1; i++) {
                System.out.print(arr[i] + ", ");
            }
        }

        if(length >= 1) {
            System.out.print(arr[length-1]);
        }
        System.out.print("}");
    }
}