package chapter07.lecture;

public class Dog extends Animal {
    String species;
    String breed;

    public Dog() {
        super("강아지");
    }

    public Dog(String name, String species, String breed) {
        super(name);
        this.species = species;
        this.breed = breed;
    }
}