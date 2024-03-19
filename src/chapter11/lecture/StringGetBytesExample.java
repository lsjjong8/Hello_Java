package chapter11.lecture;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class StringGetBytesExample {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "안녕하세요";

        // 기본 문자셋으로 인코딩과 디코딩
        byte[] byte1 = str.getBytes();
        System.out.println("byte1.length: " + byte1.length);
        String str1 = new String(byte1);
        System.out.println("byte1->String: " + str1);
        System.out.println("Default Charset:" + Charset.defaultCharset().displayName());

        try {
            // EUC-KR을 이용해서 인코딩과 디코딩
            byte[] byte2 = str.getBytes("EUC-KR"); // EUC-KR로 인코딩된 바이트 배열 리턴
            System.out.println("byte2.length: " + byte2.length);
            String str2 = new String(byte2, "EUC-KR"); // String 생성자로 byte2를 EUC-KR로 디코딩
            System.out.println("byte2->String(EUC-KR): " + str2);

            // UTF-8을 이용해서 인코딩과 디코딩
            byte[] byte3 = str.getBytes(StandardCharsets.UTF_8); // UTF-8로 인코딩된 바이트 배열 리턴
            System.out.println("byte3.length: " + byte3.length);
            String str3 = new String(byte3, StandardCharsets.UTF_8); // String 생성자로 byte3를 UTF-8로 디코딩
            System.out.println("byte3->String(UTF-8): " + str3);

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
