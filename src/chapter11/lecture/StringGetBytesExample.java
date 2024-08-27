package chapter11.lecture;


import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class StringGetBytesExample {
    // 종종 문자열을 바이트 배열로 변환하는 경우가 있음
    // 예를들어 네트워크로 문자열을 전송하거나, 문자열을 암호화할 때
    // 윈도우 인코딩 : EUC-KR(window 949) 알파벳은 1바이트, 한글은 2바이트로 변환
    // UTF-8은 알파벳은 1바이트, 한글은 3바이트로 변환
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "안녕하세요";

        // 기본 문자셋으로 인코딩과 디코딩 시작
        // 네트워크 전송자 시점
        byte[] byte1 = str.getBytes();
        System.out.println("byte1.length = " + byte1.length);
        System.out.println("Default Charset:" + Charset.defaultCharset().displayName()); // 전송자의 기본 인코딩

        // 네트워크 수신자 시점
        String str1 = new String(byte1);
        System.out.println("byte1 -> String: " + str1);
        System.out.println("Default Charset:" + Charset.defaultCharset().displayName()); // 수신자의 기본 인코딩
        // 기본 문자셋으로 인코딩과 디코딩 끝



        // EUC-KR로 인코딩과 디코딩 시작
        // 네트워크 전송자 시점
        byte[] byte2 = str.getBytes("EUC-KR"); // EUC-KR로 인코딩된 바이트 배열 리턴
        System.out.println("byte2.length = " + byte2.length);
        // System.out.println("Default Charset:" + Charset.defaultCharset().displayName()); // 전송자의 기본 인코딩

        // 네트워크 수신자 시점
        String str2 = new String(byte2, "EUC-KR"); // String 생성자로 byte2를 EUC-KR로 디코딩
        System.out.println("byte2->String(EUC-KR): " + str2);



        // UTF-8로 인코딩과 디코딩 시작
        // 네트워크 전송자 시점
        byte[] byte3 = str.getBytes(StandardCharsets.UTF_8); // UTF-8로 인코딩된 바이트 배열 리턴
        System.out.println("byte3.length = " + byte3.length);
        // System.out.println("Default Charset:" + Charset.defaultCharset().displayName()); // 전송자의 기본 인코딩

        // 네트워크 수신자 시점
        String str3 = new String(byte3, StandardCharsets.UTF_8); // UTF-8 생성자로 byte2를 ISO_8859_1로 디코딩
        System.out.println("byte3->String(UTF-8): " + str3);
    }
}
