package chapter14.lecture;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample2 {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("C:/Temp/test2.db");

        byte[] buffer = new byte[2];

        while(true) {
            int readByteNum = is.read(buffer); // 배열 길이만큼 읽기

            if(readByteNum == -1) break; // 파일 끝에 도달했을 경우

            for (int i = 0; i < readByteNum; i++) {
                System.out.println(buffer[i]);
            }

            System.out.println();
        }

        is.close();
    }
}
