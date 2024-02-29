package chapter06.lecture;

public class SingletonTest {
    public static void main(String[] args) {
        // 오류 발생
        // Singleton singleton = new Singleton();

        Singleton singleton = Singleton.getInstance();
    }
}
