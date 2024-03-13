package chapter07;

public class Animal {
    // 필드
    private String name;

    // 생성자
    public Animal(String name) {
        this.name = name;
    }

    public void bark() { // 짖기
        System.out.println("짖는다!");
    }

    public String getName() {
        return name;
    }
}
