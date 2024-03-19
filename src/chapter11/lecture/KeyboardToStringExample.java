package chapter11.lecture;

import java.io.IOException;

public class KeyboardToStringExample {
    public static void main(String[] args) throws IOException {
        byte[] bytes = new byte[100]; // 읽은 바이트를 저장하기 위한 배열 생성

        System.out.print("입력:");
        int readByteNo = System.in.read(bytes); // 배열에 읽은 바이트를 저장하고 읽은 바이트 수를 리턴

        String str = new String(bytes, 0, readByteNo-1); //-2는 \r\n 제거용.. \r이 콘솔에서 인식되지 않아 -1로 대체
        System.out.print(str);
    }
}
