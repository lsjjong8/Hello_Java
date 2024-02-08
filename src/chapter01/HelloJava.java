package chapter01;
// 이전에 메모장으로 작성 및 컴파일 : javac -encoding utf-8 chapter01.HelloJava.java

/**
 * 문서화 주석
 * 작성일 : 2024-00-00
 * 작성자 : 이승종
 */
public class HelloJava { // 클래스 선언
    public static void main(String[] args) { // main 메서드, {} 블록 시작과 끝
        
        // System.out.println("첫 Java 프로그램입니다.") // 세미콜론 필수
        
        // 한줄 주석, System.out.println() : 출력문 + 라인 개행, "문자열 리터럴(값)"
        /* 전통적 주석, 단축키 CTRL + SHIFT + /(슬래쉬)*/
        System.out.println("첫 Java 프로그램입니다.");
        System.out.println("화면에 출력하고 있습니다");

        System.out.println("첫 Java 프로그램입니다. 화면에 출력하고 있습니다");
        System.out.println("첫 Java 프로그램입니다.\n화면에 출력하고 있습니다");

        System.out.print("첫 Java 프로그램입니다.");
        System.out.println("화면에 출력하고 있습니다");

        System.out.print("첫 Java 프로그램입니다.");
        System.out.print("화면에 출력하고 있습니다");

    }
}
// 기호 문자 읽는 법 추가 진행
