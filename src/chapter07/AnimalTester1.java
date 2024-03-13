package chapter07;

public class AnimalTester1 {
    public static void main(String[] args) {
        // 다음 선언은 오류 : 추상 클래스는 인스턴스화 불가
        // Animal animal = new Animal();

        Animal[] animals = new Animal[2];

        animals[0] = new Dog("초코", "치와와"); // 개
        animals[1] = new Cat("나비", 7); // 고양이

        for (Animal animal: animals) {
            System.out.print(animal.getName() + " : ");
            animal.bark();
            System.out.println();
        }
    }
}
