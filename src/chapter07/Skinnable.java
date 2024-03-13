package chapter07;

public interface Skinnable {
    // 인터페이스에서는 상수만 정의 가능 (final static 생략 가능)
    final static int BLACK = 0;
    final static int RED = 1;
    final static int GREEN = 2;
    final static int BLUE = 3;
    final static int YELLOW = 4;

    void changeSkin(int skin); // 스킨 변경
}
