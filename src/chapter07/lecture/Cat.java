package chapter07.lecture;

public class Cat extends Animal {
    public Cat() {
        super("고양이");
    }

    @Override
    protected void makeSound() {
        System.out.println(name + "가 야옹합니다.");
    }
}
