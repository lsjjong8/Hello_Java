package chapter07;

public interface Skinnable {
    // 인터페이스에서는 상수만 정의 가능 (final static 생략 가능)
    public static final int BLACK = 0;
    public static final int RED = 1;
    public static final int GREEN = 2;
    public static final int BLUE = 3;
    public static final int YELLOW = 4;

    public abstract void changeSkin(int skin); // 스킨 변경
}
