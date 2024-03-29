package chapter03.lecture;

public class CompareOperatorExample {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 10;

        boolean result1 = (num1 == num2);
        boolean result2 = (num1 != num2);
        boolean result3 = (num1 <= num2);

        System.out.println("result1=" + result1);
        System.out.println("result2=" + result2);
        System.out.println("result3=" + result3);

        char char1 = 'A';
        char char2 = 'B';

        boolean result4 = (char1 < char2);
        System.out.println("result4=" + result4);

        // 예외
        double num3 = 0.1;
        float num4 = 0.1f;

        System.out.println(num3 == num4);
        System.out.println((float)num3 == num4);
    }
}