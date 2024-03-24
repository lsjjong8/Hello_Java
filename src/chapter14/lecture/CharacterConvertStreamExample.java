package chapter14.lecture;

import java.io.*;

public class CharacterConvertStreamExample {
    public static void main(String[] args) throws IOException {
        write("문자 변환 스트림을 사용합니다.");
        String data = read();
        System.out.println(data);
    }

    public static void write(String str) throws IOException {
        // FileOutputStream에 OutputStreamWriter 보조 스트림을 연결
        FileOutputStream fos = new FileOutputStream("C:/Temp/test1.txt");
        Writer writer = new OutputStreamWriter(fos);
        
        writer.write(str); // OutputStreamWriter 보조 스트림을 이용해서 문자 출력
        writer.flush();
        writer.close();
    }

    public static String read() throws IOException {
        // FileInputStreamReader 보조 스트림을 이용해서 문자 입력
        FileInputStream fis = new FileInputStream("C:/Temp/test1.txt");
        Reader reader = new InputStreamReader(fis);

        char[] buffer = new char[100];

        // InputStreamReader 보조 스트림을 이용해서 문자 입력
        int readCharNum = reader.read(buffer);

        reader.close();
        
        // char 배열에서 읽은 수 만큼 문자열로 변환
        String data = new String(buffer, 0, readCharNum);
        return data;
    }
}
