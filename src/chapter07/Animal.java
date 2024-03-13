package chapter07;

public abstract class Animal {
    // 필드
    private String name;

    // 생성자
    public Animal(String name) {
        this.name = name;
    }
    
    // 메서드
    public String getName() {
        return name;
    }
    public void introduce() {
        System.out.print(toString()+"이다. ");
        bark();
    }

    // 추상 메서드
    public abstract void bark(); // 짖기
    public abstract String toString();
}
