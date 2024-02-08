package chapter02;
// import문 : 다른 클래스 불러오기,package 선언 이후, 클래스 선언 이전에 작성한다.
import java.util.Random;

public class RandomInteger {
    public static void main(String[] args) {
        Random rand = new Random();

        int n1 = rand.nextInt(9);
        System.out.println("임의의 정수 값은 " + n1);
        // 난수를 생성한다. 0부터 N-1까지 N개의 난수 생성
        // 0부터 시작하여 직관적이진 않으므로 칠판으로 설명
        // Offset 개념, 0 + offset ~ N-1 + offset

        // 한 자리의 양의 정수 (1 ~ 9), (0+1 ~ N-1+1)
        int n2 = 1 + rand.nextInt(9);
        System.out.println("한 자리의 양의 정수 : " + n2);

        // 두 자리의 양의 정수 (10 ~ 99), (0+10 ~ N-1+10)
        int n3 = 10 + rand.nextInt(90);
        System.out.println("두 자리의 양의 정수 : " + n3);

        // 문제 한 자리의 음의 정수
        // 한자리 양의 정수에 -부호 붙이기(가장 쉬움)
        int n4 = 0;
        System.out.println("한 자리의 음의 정수 : " + n4);
        
    }
}
