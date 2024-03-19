package chapter11.lecture;

public class StringValueOfExample {
    public static void main(String[] args) {
        String str1 = String.valueOf(10);
        String str2 = String.valueOf(10.5);
        String str3 = String.valueOf(true);
        String str4 = String.valueOf("문자열");
        String str5 = String.valueOf("문자열");

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4 == str5); // true
    }
}
