package chapter06.lecture;

public class Singleton {
    // 정적 필드
    private static Singleton instance;

    // 생성자
    private Singleton() {}

    // 정적 메소드
    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}