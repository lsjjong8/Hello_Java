package chapter03.lecture;

public class ShiftOperator {
    public static void main(String[] args) {
        // 1. 산술쉬프트 (부호 변화가 없음 *2, /2 효과)
        // <<, Left Shift, a의 비트를 왼쪽으로 b만큼 이동시킴 
        // 부호 비트를 유지, 오른쪽에 추가되는 값은 0으로 채움, x2의 효과
        System.out.printf("%32s\n", "decimal 3 - Left Shift");
        System.out.print(String.format("%32s\n", Integer.toBinaryString(3)).replace(" ", "0"));
        // 0b0000...0011 <- 1bit 이동 0b0000...0110
        System.out.print(String.format("%32s\n", Integer.toBinaryString(3 << 1)).replace(" ", "0"));
        // 0b0000...0011 <- 1bit 이동 0b0000...1100
        System.out.print(String.format("%32s\n", Integer.toBinaryString(3 << 2)).replace(" ", "0"));
        System.out.println();

        System.out.printf("%32s\n", "decimal -3 - Left Shift");
        System.out.printf("%32s\n", Integer.toBinaryString(-3));
        // 0b1111...1101 <- 1bit 이동 0b1111...11010
        System.out.printf("%32s\n", Integer.toBinaryString(-3 << 1));
        // 0b1111...1101 <- 1bit 이동 0b1111..110100
        System.out.printf("%32s\n", Integer.toBinaryString(-3 << 2));
        System.out.println();

        // >>, Right Shift, a의 비트를 오른쪽으로 b만큼 이동시킴
        // 빈 값을 부호비트로 채움, /2의 효과, 나머지 발생 시 내림
        // 5를 바이너리 스트링 출력
        System.out.printf("%32s\n", "decimal 5 - Right Shift");
        System.out.print(String.format("%32s\n", Integer.toBinaryString(5)).replace(" ", "0"));
        // 0b0000...0101 -> 1bit 이동 0b0000...0010
        System.out.print(String.format("%32s\n", Integer.toBinaryString(5 >> 1)).replace(" ", "0"));
        // 0b0000...0101 -> 1bit 이동 0b0000...0001
        System.out.print(String.format("%32s\n", Integer.toBinaryString(5 >> 2)).replace(" ", "0"));
        System.out.println();

        System.out.printf("%32s\n", "decimal -5 - Right Shift");
        // -5를 바이너리 스트링 출력
        System.out.printf("%s\n", Integer.toBinaryString(-5));
        // 0b1111...1011 -> 1bit 이동 0b1111...1101
        System.out.printf("%s\n", Integer.toBinaryString(-5 >> 1));
        // 0b1111...1011 -> 1bit 이동 0b1111...1110
        System.out.printf("%s\n", Integer.toBinaryString(-5 >> 2));
        System.out.println();


        // 논리시프트 (>>>), 0으로 채운다
        System.out.println("===== 논리 시프트 =====");
        // 0000...0011 -> 1비트 이동 0000...0001
        System.out.print(String.format("%32s\n", Integer.toBinaryString(3 >>> 1)).replace(" ", "0"));
        // 0000...0011 -> 2비트 이동 0000...0000 & 0000...0001 => 0, 마지막 자릿수 확인
        System.out.print(String.format("%32s\n", Integer.toBinaryString(3 >>> 2 & 1)).replace(" ", "0"));
        // 1111...1101 -> 31비트 이동, 부호 비트 확인
        System.out.print(String.format("%32s\n", Integer.toBinaryString(-3 >>> 31)).replace(" ", "0"));

    }
}
