package chapter14.lecture;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample5 {
    public static void main(String[] args) throws IOException {
        // 데이터 출발지를 test8.txt로 하는 문자 기반 파일 입력 스트림을 생성
        Reader reader = new FileReader("C:/Temp/test8.txt");

        char[] buffer = new char[100]; // 길이 100인 배열 생성

        int readCharNum;

        // 파일 끝에 도달 체크
        while((readCharNum = reader.read(buffer)) != -1) {
            // 읽은 문자 수만큼 반복하여 배열에 저장된 문자 출력
            for (int i = 0; i < readCharNum; i++) {
                System.out.println(buffer[i]);
            }
        }

        reader.close(); // 입력 스트림을 닫음
    }
}
