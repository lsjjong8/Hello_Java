package chapter07;

public class Dog extends Animal {
    private String type; // 개의 종류

    public Dog(String name, String type) {
        super(name);
        this.type = type;
    }

    @Override
    public void bark() {
        System.out.println("멍멍!");
    }
}
