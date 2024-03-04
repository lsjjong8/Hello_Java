package chapter07.lecture;

// 추상 클래스 정의
public abstract class Animal {
    protected String name;

    protected Animal() {}

    protected Animal(String name) {
        this.name = name;
    }

    // 공통 메소드
    public void makeSoundWhileMoving() {
        move();
        makeSound();
    }

    // 추상 메소드 정의 (구현을 강제)
    abstract protected void makeSound();
    abstract protected void move();
}