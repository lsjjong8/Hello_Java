package chapter07.lecture;

public class AnimalExample {
    public static void main(String[] args) {
        // Animal myAnimal = new Animal(); // 추상 클래스는 객체 생성 불가

        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.makeSound();
        myCat.makeSound();
    }
}
