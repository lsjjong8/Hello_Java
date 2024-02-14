package chapter02.lecture;
public class CastingExample {
    public static void main(String[] args) {
        int intValue = 44032;
        char charValue = (char) intValue;
        System.out.println(charValue);

        long longValue = 500;
        intValue = (int) longValue;
        System.out.println(intValue);

        double doubleValue = 3.14;
        intValue = (int) doubleValue;
        System.out.println(intValue);

        // 수동 타입 변환 (무조건 다운캐스팅)
        byte byteValue = (byte) 128;    // int → byte(다운캐스팅)
        System.out.println(byteValue);
    }
}