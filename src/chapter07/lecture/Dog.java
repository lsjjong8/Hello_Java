package chapter07.lecture;

public class Dog extends Animal {
    String name; // 동물 이름을 또...?
    String species;
    String breed;

    // 생성자
    public Dog(String name, String species, String breed) {
        this.name = name;
        this.species = species;
        this.breed = breed;
    }
}