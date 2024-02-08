package chapter02;
// import문 : 다른 클래스 불러오기,package 선언 이후, 클래스 선언 이전에 작성한다.
import java.util.Scanner;
public class ScanInteger {
    public static void main(String[] args) {
        // import 문을 작성하면 다른 패키지의 클래스 사용 가능
        Scanner sc = new Scanner(System.in);

        int value; // 정수값을 담을 그릇
        
        System.out.print("정숫값 : ");
        
        // 키보드를 통해 입력한 정수를 받는다
        value = sc.nextInt(); // 입력받은 정숫값을 변수에 저장

        System.out.println(value + "를 입력했습니다.");

        // 키보드로 입력한 정숫값에 10을 더하거나 뺀 값을 표시
        System.out.println("10을 더한 값은 " + (value+10) + "입니다.");
        System.out.println("10을 뺀 값은 " + (value-10) + "입니다.");
    }
}
