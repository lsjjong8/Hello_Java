package chapter05;

import java.util.Random;
import java.util.Scanner;
//
public class Shuffle {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.print("요소 수:");
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        /*for(int i=0; i<2*n;i++) {
            int idx1 = rand.nextInt(n);
            int idx2 = rand.nextInt(n);

            int temp = a[idx1];
            a[idx1] = a[idx2];
            a[idx2] = temp;
        }*/

        // Fisher-Yates 알고리즘
        for(int i=n-1; i>0; i--) {
            int j = rand.nextInt(i+1);

            if(i!=j) {
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }

        System.out.println("요소를 섞었습니다.");
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
}
