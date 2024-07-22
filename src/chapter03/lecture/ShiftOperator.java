package chapter03.lecture;

public class ShiftOperator {
    public static void main(String[] args) {
        // 1. 산술쉬프트 (부호 변화가 없음 *2, /2 효과)
        // <<, Left Shift, a의 비트를 왼쪽으로 b만큼 이동시킴 
        // 부호 비트를 유지, 오른쪽에 추가되는 값은 0으로 채움, x2의 효과
        System.out.println(3 << 1); // 0b0000...0011 <- 1bit 이동 0b0000...0110
        System.out.println(3 << 2); // 0b0000...0011 <- 2bit 이동 0b0000...1100
        System.out.println(Integer.toBinaryString(3));
        System.out.println(Integer.toBinaryString(3 << 1));
        System.out.println(Integer.toBinaryString(3 << 2));

        System.out.println(-3 << 1); // 0b1111...1101 <- 1bit 이동 0b1111...11010
        System.out.println(-3 << 2); // 0b1111...1101 <- 1bit 이동 0b1111..110100
        System.out.println(Integer.toBinaryString(-3));
        System.out.println(Integer.toBinaryString(-3 << 1));
        System.out.println(Integer.toBinaryString(-3 << 2));

        // >>, Right Shift, a의 비트를 오른쪽으로 b만큼 이동시킴
        // 빈 값을 부호비트로 채움, /2의 효과, 나머지 발생 시 내림
        // 5를 바이너리 스트링 출력
        System.out.printf("%8s\n", Integer.toBinaryString(5));
        // 0b0000...0101 -> 1bit 이동 0b0000...0010
        System.out.printf("%8s\n", Integer.toBinaryString(5 >> 1));
        System.out.println(5 >> 1);

        // -5를 바이너리 스트링 출력
        System.out.printf("%s\n", Integer.toBinaryString(-5));
        // 0b1111...1011 -> 1bit 이동 0b1111...1101
        System.out.printf("%s\n", Integer.toBinaryString(-5 >>1));
        System.out.println(-5 >> 1);

        // 논리시프트 (>>>), 0으로 채운다
        // 0000...0011 -> 1비트 이동 0000...0001
        System.out.println(3 >>> 1);
        // 0000...0011 -> 2비트 이동 0000...0000 & 0000...0001 => 0, 마지막 자릿수 확인
        System.out.println(3 >>> 2 & 1);
        // 1111...1101 -> 31비트 이동, 부호 비트 확인
        System.out.println(-3 >>> 31);

    }
}
