package chapter03.lecture;

/*다양한 진법의 표현과 비트연산자*/

public class BitwiseOperator {
    public static void main(String[] args) {
        //#0. 자바코드로 진법 변환, Integer 클래스의 메소드 활용
        // 출력 메소드는 기본적으로 10진수로 변환해서 보여줌
        int data = 13;
        System.out.println(Integer.toBinaryString(data)); //1101, 2진수
        System.out.println(Integer.toOctalString(data)); //15, 8진수
        System.out.println(Integer.toHexString(data)); //d, 16진수
        System.out.println();

        System.out.println(Integer.parseInt("1101", 2)); //13
        System.out.println(Integer.parseInt("15", 8)); //13
        System.out.println(Integer.parseInt("D", 16)); //13
        System.out.println();

        //#1. 다양한 진법 사용
        System.out.println(13); // 10진수, 13
        System.out.println(0b1101); // 2진수, 13
        System.out.println(015); // 8진수, 13
        System.out.println(0xD); // 16진수, 13
        System.out.println();

        //#2. 비트연산자
        //@AND 비트연산자
        System.out.println(3 & 10); //2
        System.out.println(0b0011 & 0b1010); //0b0010 --> 2
        System.out.println(0x3 & 0xA); //2
        System.out.println();

        //@OR 비트연산자
        System.out.println(3 | 10); //11
        System.out.println(0b0011 | 0b1010); //0b1011 --> 11
        System.out.println(0x3 | 0xA); //11
        System.out.println();

        //@XOR 비트연산자
        System.out.println(3 ^ 10); //9
        System.out.println(0b0011 ^ 0b1010); //0b1001 --> 9
        System.out.println(0x3 ^ 0xA); //9
        System.out.println();

        //@NOT 비트연산자
        System.out.println(~3); //-4
        System.out.println(~0b0011); //0b1111...1100 -> -4
        System.out.println(~0x3); //-4
    }
}