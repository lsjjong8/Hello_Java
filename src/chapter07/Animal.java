package chapter07;

public abstract class Animal {
    // 필드
    private String name;

    // 생성자
    public Animal(String name) {
        this.name = name;
    }

    public abstract void bark(); // 짖기

    public String getName() {
        return name;
    }
}
