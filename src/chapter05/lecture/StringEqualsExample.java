package chapter04;

public class StringEqualsExample {
    public static void main(String[] args) {
        String str1 = new String("이름");
        String str2 = new String("이름");

        if(str1 == str2) {
            System.out.println("str1과 str2는 참조가 같음");
        } else {
            System.out.println("str1과 str2는 참조가 다름");
            System.out.println(System.identityHashCode(str1));
            System.out.println(System.identityHashCode(str2));
        }

        if(str1.equals(str2)) {
            System.out.println("str1과 str2는 문자열이 같음");
        }

        String str3 = "이름";
        String str4 = "이름";

        if(str3 == str4) {
            System.out.println("str1과 str2는 참조가 같음");
            System.out.println(System.identityHashCode(str3));
            System.out.println(System.identityHashCode(str4));
        } else {
            System.out.println("str1과 str2는 참조가 다름");
        }

        if(str3.equals(str4)) {
            System.out.println("str1과 str2는 문자열이 같음");
        }

        Integer num1 = Integer.valueOf(128);
        Integer num2 = Integer.valueOf(128);

        System.out.println(num1 == num2);
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));

        Integer num3 = Integer.valueOf(1);
        Integer num4 = Integer.valueOf(1);

        System.out.println(num3 == num4);
        System.out.println(System.identityHashCode(num3));
        System.out.println(System.identityHashCode(num4));
    }
}
