package chapter10.lecture;

public class ClassCastExceptionExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        changeDog(dog);

        Cat cat = new Cat();
        changeDog(cat);

        System.out.println("프로그램 종료"); // 실행되지 않음
    }

    public static void changeDog(Animal animal) {
        // if(animal instanceof Dog) {
        Dog dog = (Dog) animal; // ClassCastException 발생
        // }
    }
}

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}